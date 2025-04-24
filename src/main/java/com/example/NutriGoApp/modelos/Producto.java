package com.example.NutriGoApp.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Integer id_producto;
    @Column(name="nombre_productos", length = 100, nullable = false)
    private String nombre;
    @Column(name="precio", nullable = false)
    private BigDecimal precio;
    @Column(name="descripcion",nullable = true)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="fk_restaurante", referencedColumnName = "id_restaurante")
    //@JsonBackReference
    private Tienda restaurante;

    @ManyToOne
    @JoinColumn(name="fk_pedido", referencedColumnName = "id_pedido")
    //@JsonBackReference
    private Pedido pedido;

    public Producto() {
    }

    public Producto(Integer id_producto, String nombre, BigDecimal precio, String descripcion) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
