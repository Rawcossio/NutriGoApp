package com.example.NutriGoApp.modelos;

import com.example.NutriGoApp.ayudas.enums.RepartidorEnum;

public class Repartidor {
    private Integer id_repartidor;
    private String nombre;
    private String telefono;
    private String correoElectronico;
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
