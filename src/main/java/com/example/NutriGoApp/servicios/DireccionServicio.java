package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IDireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServicio {
    @Autowired
    IDireccionRepositorio repositorio;
}
