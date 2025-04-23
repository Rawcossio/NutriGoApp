package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Producto;
import com.example.NutriGoApp.repositorios.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {
    @Autowired
    IProductoRepositorio repositorio;

    //guardar
    public Producto guardarProducto(Producto datosProducto)throws Exception{
        try {
           return this.repositorio.save(datosProducto);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<Producto> buscarProducto()throws Exception{
        try {
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por Id
    public Producto buscarProductoPorId(Integer id_producto)throws Exception{
        try {
            Optional<Producto> buscarProducto=this.repositorio.findById(id_producto);
            if (buscarProducto.isPresent()){
                return buscarProducto.get();
            }else{
                throw new Exception("El producto no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Modificar por id
    public Producto modificarProducto(Integer id_producto, Producto datosProducto)throws Exception{
        try {
            Optional<Producto> buscarProducto=this.repositorio.findById(id_producto);
            buscarProducto.get().setNombre(datosProducto.getNombre());
            buscarProducto.get().setDescripcion(datosProducto.getDescripcion());
            buscarProducto.get().setPrecio(datosProducto.getPrecio());
            return this.repositorio.save(buscarProducto.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean eliminarProducto(Integer id_producto) throws Exception{
        try {
            Optional<Producto> buscarProducto=this.repositorio.findById(id_producto);
            if(buscarProducto.isPresent()){
                this.repositorio.deleteById(id_producto);
                return true;
            }else{
                throw new Exception("El producto no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
