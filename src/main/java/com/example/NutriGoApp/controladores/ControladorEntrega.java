package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.EntregaServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class ControladorEntrega {
    EntregaServicio entregaServicio;
}
