package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.RepartidorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repartidor")
public class ControladorRepartidor {
    @Autowired
    RepartidorServicio repartidorServicio;
}
