package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Entrega;
import com.example.NutriGoApp.repositorios.IEntregaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Service
public class EntregaServicio {
    @Autowired
    IEntregaRepositorio repositorio;
    //guardar

    public Entrega guardarEntrega(Entrega datosEntrega)throws Exception {
        try {
           return this.repositorio.save(datosEntrega);
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<Entrega> buscarEntrega()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por id
    public Entrega buscarEntregaPorId(Integer id_entrega){
        try{
            Optional<Entrega> buscarEntrega=this.repositorio.findById(id_entrega);
            if(buscarEntrega.isPresent()){
                return buscarEntrega.get();
            }else{
                throw new Exception("La entrega no esta en BD");
            }
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Modificar por id
    public Entrega modificarEntrega(Integer id_entrega, Entrega datosEntrega)throws Exception{
        try{
            Optional<Entrega> buscarEntrega=this.repositorio.findById(id_entrega);
            buscarEntrega.get().setEstado_entrega(datosEntrega.getEstado_entrega());
            buscarEntrega.get().setFecha_de_entrega(datosEntrega.getFecha_de_entrega());
            return this.repositorio.save(buscarEntrega.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarEntrega(Integer id_entrega)throws Exception{
        try{
           this.repositorio.deleteById(id_entrega);
           return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
