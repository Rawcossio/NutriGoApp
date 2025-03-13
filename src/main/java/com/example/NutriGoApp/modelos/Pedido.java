package com.example.NutriGoApp.modelos;

import com.example.NutriGoApp.ayudas.enums.PedidoEstado;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name="Pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pedido", length = 100, nullable = false)
    private Integer id_pedido;
    @Column(name="estado_pedido", columnDefinition = "VARCHAR(10) DEFAULT 'PENDIENTE'")
    @Enumerated(EnumType.STRING)
    private PedidoEstado estado_pedido;
    @Column(name="fecha_pedido", columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha_pedido;
    @Column(name="total_pedido", nullable = false)
    private BigDecimal total_pedido;

    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonBackReference
    private Usuario usuario;

    public Pedido() {
    }

    public Pedido(Integer id_pedido, PedidoEstado estado_pedido, LocalDateTime fecha_pedido, BigDecimal total_pedido) {
        this.id_pedido = id_pedido;
        this.estado_pedido = estado_pedido;
        this.fecha_pedido = fecha_pedido;
        this.total_pedido = total_pedido;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public PedidoEstado getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(PedidoEstado estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public LocalDateTime getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDateTime fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public BigDecimal getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(BigDecimal total_pedido) {
        this.total_pedido = total_pedido;
    }
}
