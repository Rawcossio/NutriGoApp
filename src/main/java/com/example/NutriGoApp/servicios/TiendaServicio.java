package com.example.NutriGoApp.servicios;

import com.example.NutriGoApp.modelos.Tienda;
import com.example.NutriGoApp.repositorios.ITiendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaServicio {
    @Autowired
    ITiendaRepositorio repositorio;

    //Listar los metodos que activaran las consultas en la base de datos

    //guardar
    public Tienda guardarTienda(Tienda datosTienda) throws Exception {
        try {
            //Validar los datos de entrada
            return this.repositorio.save(datosTienda);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Buscar Todos los registros
    public List<Tienda> buscarTodasTiendas() throws Exception {
        try {
            return this.repositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Buscar por id
    public Tienda buscarPorId(Integer id_restaurante) throws Exception {
        try {
            Optional<Tienda> tiendaBuscada = this.repositorio.findById(id_restaurante);
            if (tiendaBuscada.isPresent()) {
                return tiendaBuscada.get();
            } else {
                throw new Exception("La tienda buscada no esta en la BD");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Modificar por id
    public Tienda modificarTienda(Integer id_restaurante, Tienda datosTienda) throws Exception {
        try {
            Optional<Tienda> tiendaBuscada = this.repositorio.findById(id_restaurante);
            if (tiendaBuscada.isPresent()) {
                tiendaBuscada.get().setNombre(datosTienda.getNombre());
                tiendaBuscada.get().setTelefono(datosTienda.getTelefono());
                tiendaBuscada.get().setDireccion(datosTienda.getDireccion());
                tiendaBuscada.get().setCategorias(datosTienda.getCategorias());
                return this.repositorio.save(tiendaBuscada.get());
            } else {
                throw new Exception("restaurante no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Eliminar por id

    public boolean eliminarTienda(Integer id_restaurante) throws Exception {
        try {
            Optional<Tienda> tiendaBuscada = this.repositorio.findById(id_restaurante);
            if (tiendaBuscada.isPresent()) {
                this.repositorio.deleteById(id_restaurante);
                return true;
            } else {
                throw new Exception("tienda no encontrada");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}


