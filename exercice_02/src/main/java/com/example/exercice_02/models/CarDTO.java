package com.example.exercice_02.models;

import java.util.UUID;
import lombok.*;


@Data
@Builder
public class CarDTO {

    private UUID id;
    private String brand;
    private String color;
    private double horsePower;
    private String type;

}
