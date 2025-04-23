package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Detalle;
import com.example.NutriGoApp.modelos.Direccion;
import com.example.NutriGoApp.repositorios.IDetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleServicio {
    @Autowired
    IDetalleRepositorio repositorio;

    //guardar
    public Detalle guardarDetalle(Detalle datosDetalle)throws Exception{
        try{
            return this.repositorio.save(datosDetalle);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //buscar todos los registros
    public List<Detalle> buscarDetalle()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por Id
    public Detalle buscarDetallePorId(Integer id_detalle)throws Exception{
        try{
            Optional<Detalle> buscarDetalle=this.repositorio.findById(id_detalle);
            if(buscarDetalle.isPresent()){
                return buscarDetalle.get();
            }else{
                throw new Exception("La direccion no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar por id
    public Detalle modificarDetalle(Integer id_detalle, Detalle datosDetalle)throws Exception{
        try{
            Optional<Detalle> buscarDetalle=this.repositorio.findById(id_detalle);
            buscarDetalle.get().setCantidad(datosDetalle.getCantidad());
            buscarDetalle.get().setSubtotal(datosDetalle.getSubtotal());
            return this.repositorio.save(buscarDetalle.get());
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarDetalle(Integer id_detalle)throws Exception{
        try{
            this.repositorio.deleteById(id_detalle);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
