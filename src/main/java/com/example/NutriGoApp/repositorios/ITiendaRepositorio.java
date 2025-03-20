package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiendaRepositorio extends JpaRepository<Tienda, Integer> {
}
