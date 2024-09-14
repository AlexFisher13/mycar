package com.fisher.mycar.controller;

import com.fisher.mycar.dao.CarDao.CarDao;
import com.fisher.mycar.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarDao carDao;

    @GetMapping()
    public List<Car> getCar() {
        return carDao.findAll();
    }
}