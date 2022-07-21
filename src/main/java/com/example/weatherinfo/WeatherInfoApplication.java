package com.example.weatherinfo;

import com.example.weatherinfo.domain.City;
import com.example.weatherinfo.domain.Weather;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({City.class, Weather.class})
@MapperScan("com.example.weatherinfo.mapper")
@SpringBootApplication
public class WeatherInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherInfoApplication.class, args);
    }

}
