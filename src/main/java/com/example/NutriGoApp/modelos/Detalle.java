package com.example.NutriGoApp.modelos;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name="Detalle Pedido")
public class Detalle {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="detalle_pedido")
    private Integer detalle_pedido;
    @Column(name="cantidad", nullable = false)
    private Integer cantidad;
    @Column(name="subtotal",nullable = false)
    private BigDecimal subtotal;

}
