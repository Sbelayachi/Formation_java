package com.example.exercice_02.services;


import com.example.exercice_02.models.CarDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;


// Attributs d'une voiture : id, brand, color, horsePower, type
@Service
@Primary
public class CarService {
    private final Map<UUID, CarDTO> cars;

    public CarService() {
        cars = new HashMap<>();

        CarDTO carA = CarDTO.builder()
                .id(UUID.randomUUID())
                .brand ("PEUGEOT")
                .color("Green")
                .horsePower(50)
                .type("Break")
                .build();

        CarDTO carB = CarDTO.builder()
                .id(UUID.randomUUID())
                .brand ("AUDI")
                .color("Red")
                .horsePower(200)
                .type("Coupée sport")
                .build();

        CarDTO carC = CarDTO.builder()
                .id(UUID.randomUUID())
                .brand ("BMW")
                .color("gray")
                .horsePower(120)
                .type("Berline")
                .build();

        CarDTO carD = CarDTO.builder()
                .id(UUID.randomUUID())
                .brand ("TOYOTA")
                .color("Black")
                .horsePower(150)
                .type("SUV")
                .build();


        cars.put(carA.getId(), carA);
        cars.put(carB.getId(), carB);
        cars.put(carC.getId(), carC);
        cars.put(carD.getId(), carD);

    }



    public List<CarDTO> getCars() {
        return cars.values().stream().toList();
    }

    public Optional<CarDTO> getCarById(UUID id) {
        return cars.values().stream().filter(d -> d.getId().equals(id)).findFirst();
    }

    public CarDTO addCar(CarDTO carData) {
        if (carData.getId() == null) {
            carData.setId(UUID.randomUUID());
        }

        cars.put(carData.getId(), carData);

        return carData;
    }
}