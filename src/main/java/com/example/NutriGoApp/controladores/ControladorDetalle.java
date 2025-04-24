package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Detalle;
import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.servicios.DetalleServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalle")
public class ControladorDetalle {
    DetalleServicio detalleServicio;
    // Guardar
    @PostMapping
    public ResponseEntity<?> guardarDetalle(@RequestBody Detalle datosDetalle) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.detalleServicio.guardarDetalle(datosDetalle));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Buscar todos
    @GetMapping
    public ResponseEntity<?> buscarTodosDetalle() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.detalleServicio.buscarDetalle());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdDetalle(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.detalleServicio.buscarDetallePorId(id));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarDetalle(@PathVariable Integer id, @RequestBody Detalle datosDetalle) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.detalleServicio.modificarDetalle(id, datosDetalle));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDetalle(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.detalleServicio.eliminarDetalle(id));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
