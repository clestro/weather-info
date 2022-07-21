package com.example.weatherinfo.domain;

import lombok.Data;

@Data
public class City {

    private Long id;
    private String name;
    private String coordinates;
}
