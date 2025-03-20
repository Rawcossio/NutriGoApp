package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.ITiendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicio {
    @Autowired
    ITiendaRepositorio repositorio;
}
