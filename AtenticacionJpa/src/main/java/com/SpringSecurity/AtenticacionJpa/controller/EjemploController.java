package com.SpringSecurity.AtenticacionJpa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping("/demo")
    public String bienvenida(){
        return "Hola mundo";
    }

}
