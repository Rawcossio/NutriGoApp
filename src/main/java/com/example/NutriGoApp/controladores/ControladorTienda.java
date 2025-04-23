package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Tienda;
import com.example.NutriGoApp.servicios.TiendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tienda")
public class ControladorTienda {
    @Autowired
    TiendaServicio tiendaServicio;
    //Guardar
    @PostMapping
    public ResponseEntity<?>guardarTienda(@RequestBody Tienda datosTienda){
        try{
            return   ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.tiendaServicio.guardarTienda(datosTienda));

        } catch(Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Buscar todos
    @GetMapping
    public ResponseEntity<?> buscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.tiendaServicio.buscarTodasTiendas());

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Buscar id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@RequestBody Integer id_restaurante){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.tiendaServicio.buscarPorId(id_restaurante));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Modificar
    @PutMapping("/{id}")
    public  ResponseEntity<?> modificarTienda(@PathVariable Integer id_restaurante, @RequestBody Tienda datosTienda){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.tiendaServicio.modificarTienda(id_restaurante,datosTienda));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?>eliminarTienda(@PathVariable Integer id_restaurante){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(this.tiendaServicio.eliminarTienda(id_restaurante));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
