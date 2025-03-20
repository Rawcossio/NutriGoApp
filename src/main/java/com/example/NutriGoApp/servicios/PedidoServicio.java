package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicio {
    @Autowired
    IPedidoRepositorio repositorio;
}
