package com.example.exercice_02.controllers;


import com.example.exercice_02.exeptions.ResourceNotFindException;
import com.example.exercice_02.models.CarDTO;
import com.example.exercice_02.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars") // http://localhost:8080/api/v1/cars

public class CarRestController {

    private final CarService carService;

    @GetMapping("list") // GET http://localhost:8080/api/v1/cars/list
    public List<CarDTO> listcars() {
        return carService.getCars();
    }

    @GetMapping("details/{carId}") // GET http://localhost:8080/api/v1/cars/details/{id}

    public ResponseEntity<CarDTO> getCarById(@PathVariable("carId") UUID id) {
        CarDTO found = carService.getCarById(id);

        if (found != null) {
            return ResponseEntity.ok(found);
        } else {
//            // return new ResponseEntity<CarDTO>(HttpStatus.NOT_FOUND);
            throw new ResourceNotFindException();
        }
    }
}
