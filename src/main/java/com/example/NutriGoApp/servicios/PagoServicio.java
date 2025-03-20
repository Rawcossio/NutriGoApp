package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServicio {
    @Autowired
    IPagoRepositorio repositorio;
}
