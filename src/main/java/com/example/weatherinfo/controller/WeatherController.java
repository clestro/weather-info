package com.example.weatherinfo.controller;

import com.example.weatherinfo.domain.City;
import com.example.weatherinfo.mapper.CityMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/weather-info")
public class WeatherController {

    private CityMapper cityMapper;

    public WeatherController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @GetMapping("/cities")
    public List<City> getAllCities(){
        return cityMapper.getCities();
    }
}
