package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.servicios.PagoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pago")
public class ControladorPago {
    @Autowired
    PagoServicio pagoServicio;
}
