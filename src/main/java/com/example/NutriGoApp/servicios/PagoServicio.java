package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Pago;
import com.example.NutriGoApp.repositorios.IPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServicio {
    @Autowired
    IPagoRepositorio repositorio;

    //Guardar
    public Pago guardarPago(Pago datosPago)throws Exception{
        try{
            return this.repositorio.save(datosPago);
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<Pago> buscarTodosPagos()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Buscar por id
    public Pago buscarPago(Integer id_pago)throws Exception{
        try{
            Optional<Pago> buscarPago=this.repositorio.findById(id_pago);
            if(buscarPago.isPresent()){
                return buscarPago.get();
            }else{
                throw new Exception("el pago no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar por id
    public Pago modificarPorId(Integer id_pago, Pago datosPago)throws Exception{
        try{
            Optional<Pago> buscarPago=this.repositorio.findById(id_pago);
            buscarPago.get().setEstado_pago(datosPago.getEstado_pago());
            buscarPago.get().setFecha_pago(datosPago.getFecha_pago());
            buscarPago.get().setMetodo_pago(datosPago.getMetodo_pago());
            return this.repositorio.save(buscarPago.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarPorId(Integer id_pago)throws Exception{
        try {
            this.repositorio.deleteById(id_pago);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
