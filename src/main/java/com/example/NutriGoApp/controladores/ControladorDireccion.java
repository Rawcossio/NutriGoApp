package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.DireccionServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direccion/")
public class ControladorDireccion {
    DireccionServicio direccionServicio;
}
