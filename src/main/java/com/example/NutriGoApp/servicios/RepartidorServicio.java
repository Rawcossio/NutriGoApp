package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IRepartidorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartidorServicio {
    @Autowired
    IRepartidorRepositorio repositorio;
}
