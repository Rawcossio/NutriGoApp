package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagoRepositorio extends JpaRepository<Pago, Integer> {
}
