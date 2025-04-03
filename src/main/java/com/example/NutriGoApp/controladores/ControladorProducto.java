package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    @Autowired
    ProductoServicio productoServicio;
}
