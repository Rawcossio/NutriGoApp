package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Repartidor;
import com.example.NutriGoApp.repositorios.IRepartidorRepositorio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepartidorServicio {
    @Autowired
    IRepartidorRepositorio repositorio;

    //Guardar
    public Repartidor guardarRepartidor(Repartidor datosRepartidor)throws Exception{
        try {
            return this.repositorio.save(datosRepartidor);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Buscar todos los registros
    public List<Repartidor> buscarTodosRepartidores()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por id
    public Repartidor buscarRepartidorPorId(Integer id_repartidor)throws  Exception{
        try {
            Optional<Repartidor> buscarRepartidor=this.repositorio.findById(id_repartidor);
            if(buscarRepartidor.isPresent()){
                return buscarRepartidor.get();
            }else {
                throw new Exception("El repartidor buscado no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //modificar por id
    public Repartidor modificarRepartidor(Integer id_repartidor, Repartidor datosRepartidor)throws Exception{
        try {
            Optional<Repartidor> buscarRepartidor=this.repositorio.findById(id_repartidor);
            buscarRepartidor.get().setNombre(datosRepartidor.getNombre());
            buscarRepartidor.get().setTelefono(datosRepartidor.getTelefono());
            buscarRepartidor.get().setCorreoElectronico(datosRepartidor.getCorreoElectronico());
            buscarRepartidor.get().setTipoVehiculo(datosRepartidor.getTipoVehiculo());
            return this.repositorio.save(buscarRepartidor.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar por id

    public boolean eliminarRepartdor(Integer id_repartidor)throws Exception{
        try {
            Optional<Repartidor> buscarRepartidor=this.repositorio.findById(id_repartidor);
            if(buscarRepartidor.isPresent()){
                this.repositorio.deleteById(id_repartidor);
                return  true;
            }else{
                throw new Exception("El repartidor buscado no esta en la BD");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
