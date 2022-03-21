package com.example.firstjenkins.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    void sum() {
        MainController controller = new MainController();
        assertEquals(3,controller.sum(2,1));
    }

    @Test
    void sub() {
        MainController controller = new MainController();
        assertEquals(12, controller.sub(14, 2));
    }

    @Test
    void molt() {
        MainController controller = new MainController();
        assertEquals(12, controller.molt(3,4));
    }

    @Test
    void div() {
        MainController controller = new MainController();
        assertEquals(2, controller.div(6,3));
        assertEquals(5.5, controller.div(11, 2));
    }

}