package com.example.citymanager.repo;

import com.example.citymanager.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepo extends JpaRepository<City, Long> {
    void deleteCityById(Long id);
}
