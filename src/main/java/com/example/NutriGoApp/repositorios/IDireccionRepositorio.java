package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionRepositorio extends JpaRepository<Direccion, Integer> {
}
