package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IEntregaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaServicio {
    @Autowired
    IEntregaRepositorio repositorio;
}
