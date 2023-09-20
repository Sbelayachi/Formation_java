package com.example.exercice_02.controllers;


import com.example.exercice_02.exceptions.ResourceNotFound;
import com.example.exercice_02.models.CarDTO;
import com.example.exercice_02.services.CarService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/cars")
@RequiredArgsConstructor
@Slf4j

public class CarController {


    private final CarService carService;


    @GetMapping
    public String listCars(Model model, @RequestParam(value = "brand", defaultValue = "") String filterByBrand) {
        List<CarDTO> cars = carService.getCars();

        if (!filterByBrand.isEmpty() && !filterByBrand.isBlank()) {
            cars = cars.stream().filter(d -> d.getBrand().startsWith(filterByBrand)).toList();
        }


        model.addAttribute("cars", cars);

        return "car/list";
    }



    @GetMapping("/{carId}")
    public String getCarDetails(@PathVariable("carId") UUID id, Model model) {
        Optional<CarDTO> foundCar = carService.getCarById(id);

        if (foundCar.isPresent()) {
            model.addAttribute("car", foundCar.get());
            model.addAttribute("mode", "details");

            return "car/carForm";
        }

        throw new ResourceNotFound();
    }

    @GetMapping("/add")
    public String getCarForm(Model model, @RequestParam(value = "exemple", defaultValue = "default") String blabla) {
        log.debug("blabla: " + blabla);

        model.addAttribute("car", CarDTO.builder().build());
        model.addAttribute("mode", "add");

        return "car/carForm";
    }

    @PostMapping("/add")
    public String addCarHandler(CarDTO newCar) {
        carService.addCar(newCar);

        return "redirect:/cars";
    }
}