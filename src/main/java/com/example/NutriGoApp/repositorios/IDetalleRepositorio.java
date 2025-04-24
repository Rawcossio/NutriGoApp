package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.DefaultEditorKit;

public interface IDetalleRepositorio extends JpaRepository<Detalle, Integer> {
}
