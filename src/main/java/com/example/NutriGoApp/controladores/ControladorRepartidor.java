package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Repartidor;
import com.example.NutriGoApp.servicios.RepartidorServicio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repartidor")
public class ControladorRepartidor {
    @Autowired
    RepartidorServicio repartidorServicio;

    //guardar
    @PostMapping
    public ResponseEntity<?> guardarRepartidor(@RequestBody Repartidor datosRepartidor){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.repartidorServicio.guardarRepartidor(datosRepartidor));

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Buscar todos
    @GetMapping
    public ResponseEntity<?>buscarRepartidor(){
        try{
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.repartidorServicio.buscarTodosRepartidores());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.repartidorServicio.buscarRepartidorPorId(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarRepartidor(@PathVariable Integer id, @RequestBody Repartidor datosRepartidor){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.repartidorServicio.modificarRepartidor(id, datosRepartidor));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarRepartidor(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.repartidorServicio.eliminarRepartdor(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
