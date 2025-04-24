package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Direccion;
import com.example.NutriGoApp.servicios.DireccionServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/direccion")
public class ControladorDireccion {
    DireccionServicio direccionServicio;


    // Guardar
    @PostMapping
    public ResponseEntity<?> guardarDireccion(@RequestBody Direccion datosDireccion) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(this.direccionServicio.guardarDireccion(datosDireccion));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Buscar todos
    @GetMapping
    public ResponseEntity<?> buscarTodosDireccion() {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.direccionServicio.buscarDireccion());
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdDireccion(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.direccionServicio.buscarDireccionPorId(id));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarDireccion(@PathVariable Integer id, @RequestBody Direccion datosDireccion) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.direccionServicio.modificarDireccion(id, datosDireccion));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDireccion(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(this.direccionServicio.eliminarDireccion(id));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
