package com.example.mercadonaEanBoris.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MercadonaController {

    @GetMapping("/greetings")
    public String greetings() {

        return "Hi cracks";
    }

}
