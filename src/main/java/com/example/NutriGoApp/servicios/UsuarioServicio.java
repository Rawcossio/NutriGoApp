package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    IUsuarioRepositorio repositorio;
}
