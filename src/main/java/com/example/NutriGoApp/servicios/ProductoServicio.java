package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {
    @Autowired
    IProductoRepositorio repositorio;
}
