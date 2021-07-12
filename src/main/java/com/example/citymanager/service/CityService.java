package com.example.citymanager.service;

import com.example.citymanager.exception.UserNotFoundException;
import com.example.citymanager.model.City;
import com.example.citymanager.repo.CityRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CityService {
    private final CityRepo cityRepo;

    public CityService(CityRepo cityRepo){
        this.cityRepo = cityRepo;
    }

    public City addCity(City city){
        city.setCityCode(UUID.randomUUID().toString());
        return  cityRepo.save(city);
    }

    public List<City> findAllCities(){
        return cityRepo.findAll();
    }

    public City updateCity(City city){
        return cityRepo.save(city);
    }

    public void deleteCity(Long id){
        cityRepo.delete(cityRepo.getById(id));
    }
}
