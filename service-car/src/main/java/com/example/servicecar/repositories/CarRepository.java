package com.example.servicecar.repositories;

import com.example.servicecar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByClientId(Long clientId);
}
