package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.TiendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tienda")
public class ControladorTienda {
    @Autowired
    TiendaServicio tiendaServicio;
}
