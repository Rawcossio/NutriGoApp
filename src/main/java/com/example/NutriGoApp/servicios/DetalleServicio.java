package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IDetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServicio {
    @Autowired
    IDetalleRepositorio repositorio;
}
