package com.example.NutriGoApp.modelos;

import com.example.NutriGoApp.ayudas.enums.RestauranteEnum;

public class Tienda {
    private Integer id_restaurante;
    private String nombre;
    private String direccion;
    private String telefono;
    private RestauranteEnum Categorias;

    public Tienda() {
    }

    public Tienda(Integer id_restaurante, String nombre, String direccion, String telefono, RestauranteEnum categorias) {
        this.id_restaurante = id_restaurante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        Categorias = categorias;
    }

    public Integer getId_restaurante() {
        return id_restaurante;
    }

    public void setId_restaurante(Integer id_restaurante) {
        this.id_restaurante = id_restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public RestauranteEnum getCategorias() {
        return Categorias;
    }

    public void setCategorias(RestauranteEnum categorias) {
        Categorias = categorias;
    }
}
