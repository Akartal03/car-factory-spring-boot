package com.test.carfactory.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(CarController.class)
class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnMessageFromService() throws Exception {
        String model = "sedan";
        this.mockMvc.perform(get("/api/v1/car/" + model)).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Sedan")));
    }
}
