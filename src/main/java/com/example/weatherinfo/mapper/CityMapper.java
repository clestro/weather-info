package com.example.weatherinfo.mapper;

import com.example.weatherinfo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM CITY")
    List<City> getCities();
}
