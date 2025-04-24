package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.repositorios.IPedidoRepositorio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicio {
    @Autowired
    IPedidoRepositorio repositorio;

    //Guardar
    public Pedido guardarPedido(Pedido datosPedido)throws Exception{
        try{
            return this.repositorio.save(datosPedido);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<Pedido> buscarPedido()throws Exception{
        try{
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Buscar por id
    public Pedido buscarPedidoPorId(Integer id_pedido)throws Exception{
        try{
            Optional<Pedido> buscarpedido=this.repositorio.findById(id_pedido);
            if(buscarpedido.isPresent()){
                return buscarpedido.get();
            }else{
                throw new Exception("El pedido no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar por id
    public Pedido modificarPedido(Integer id_pedido, Pedido datosPedido)throws Exception{
        try{
            Optional<Pedido> buscarpedido=this.repositorio.findById(id_pedido);
            buscarpedido.get().setEstado_pedido(datosPedido.getEstado_pedido());
            buscarpedido.get().setFecha_pedido(datosPedido.getFecha_pedido());
            buscarpedido.get().setTotal_pedido(datosPedido.getTotal_pedido());
            return this.repositorio.save(buscarpedido.get());
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarPedido(Integer id_pedido)throws Exception{
        try{
            Optional<Pedido> buscarpedido=this.repositorio.findById(id_pedido);
            this.repositorio.deleteById(id_pedido);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
