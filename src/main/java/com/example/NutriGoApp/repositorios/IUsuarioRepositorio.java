package com.example.NutriGoApp.repositorios;

import com.example.NutriGoApp.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    //Aca dentro del repo van las consultas personalizadas
}
