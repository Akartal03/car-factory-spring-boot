package com.test.carfactory.controller;

import com.test.carfactory.exception.CarNotFoundException;
import com.test.carfactory.model.Car;
import com.test.carfactory.model.CarFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("api/v1/car/{model}")
    public ResponseEntity<String> produceCar(@PathVariable String model) {
        try {
            Car car = CarFactory.buildCar(model);
            return ResponseEntity.ok().body(car.getType());
        } catch (CarNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("model name error");
        }
    }
}
