package com.test.carfactory;

import com.test.carfactory.exception.CarNotFoundException;
import com.test.carfactory.model.CarFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CarFactoryApplicationTests {

    @Test
    void shouldIncludesModelName() throws CarNotFoundException {
        assertThat(CarFactory.buildCar("cabrio").getType()).contains("Cabrio");
        assertThat(CarFactory.buildCar("sedan").getType()).contains("Sedan");
        assertThat(CarFactory.buildCar("hatchback").getType()).contains("Hatchback");
    }

    @Test
    void shouldThrowsException() {
        assertThrows(CarNotFoundException.class, () -> CarFactory.buildCar("Suv"));
    }

}
