package com.example.NutriGoApp.modelos;

import com.example.NutriGoApp.ayudas.enums.RepartidorEnum;
import jakarta.persistence.*;

@Entity
@Table(name="Repartidor")
public class Repartidor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_repartidor")
    private Integer id_repartidor;
    @Column(name="nombre_repartidor", length=100, nullable = false )
    private String nombre;
    @Column(name="telefono_repartidor", length=20, nullable = false )
    private String telefono;
    @Column(name="telefono_repartidor", length=150,unique = true, nullable = false )
    private String correoElectronico;
    @Column(name="tipo_vehiculo", length=50, nullable=true)
    private RepartidorEnum tipoVehiculo;

    public Repartidor() {
    }

    public Repartidor(Integer id_repartidor, String nombre, String telefono, String correoElectronico, RepartidorEnum tipoVehiculo) {
        this.id_repartidor = id_repartidor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Integer getId_repartidor() {
        return id_repartidor;
    }

    public void setId_repartidor(Integer id_repartidor) {
        this.id_repartidor = id_repartidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public RepartidorEnum getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(RepartidorEnum tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
