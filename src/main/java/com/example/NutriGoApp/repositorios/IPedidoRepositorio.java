package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedido, Integer> {
}
