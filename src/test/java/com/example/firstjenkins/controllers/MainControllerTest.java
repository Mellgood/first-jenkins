package com.example.firstjenkins.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    void sum() {
        MainController controller = new MainController();
        assertEquals(3,controller.sum(2,1));
    }
}