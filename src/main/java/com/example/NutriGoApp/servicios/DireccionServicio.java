package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Direccion;
import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.repositorios.IDireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServicio {
    @Autowired
    IDireccionRepositorio repositorio;

    //guardar
    public Direccion guardarDireccion(Direccion datosDireccion)throws Exception{
        try{
            return this.repositorio.save(datosDireccion);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //buscar todos los registros
    public List<Direccion> buscarDireccion()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por Id
    public Direccion buscarDireccionPorId(Integer id_direccion)throws Exception{
        try{
            Optional<Direccion> buscarDireccion=this.repositorio.findById(id_direccion);
            if(buscarDireccion.isPresent()){
                return buscarDireccion.get();
            }else{
                throw new Exception("La direccion no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar por id
    public Direccion modificarDireccion(Integer id_direccion, Direccion datosDireccion)throws Exception{
        try{
            Optional<Direccion> buscarDireccion=this.repositorio.findById(id_direccion);
            buscarDireccion.get().setPais(datosDireccion.getPais());
            buscarDireccion.get().setCiudad(datosDireccion.getCiudad());
            buscarDireccion.get().setCodigo_postal(datosDireccion.getCodigo_postal());
            buscarDireccion.get().setCalle(datosDireccion.getCalle());
            return this.repositorio.save(buscarDireccion.get());
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarDireccion(Integer id_direccion)throws Exception{
        try{
            this.repositorio.deleteById(id_direccion);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
