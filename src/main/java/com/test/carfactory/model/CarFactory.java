package com.test.carfactory.model;

import com.test.carfactory.exception.CarNotFoundException;

public class CarFactory {

    private CarFactory() {
        throw new IllegalStateException("Factory class");
    }

    public static Car buildCar(String model) throws CarNotFoundException {
        Car car;
        switch (model) {
            case "cabrio":
                car = new CabrioCar();
                break;
            case "sedan":
                car = new SedanCar();
                break;
            case "hatchback":
                car = new HatchbackCar();
                break;
            default:
                throw new CarNotFoundException();
        }
        return car;
    }
}
