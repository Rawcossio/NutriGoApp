package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.DetalleServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle")
public class ControladorDetalle {
    DetalleServicio detalleServicio;
}
