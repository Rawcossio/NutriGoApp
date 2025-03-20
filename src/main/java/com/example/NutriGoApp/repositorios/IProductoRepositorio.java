package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {
}
