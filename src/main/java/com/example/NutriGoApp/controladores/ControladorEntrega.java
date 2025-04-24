package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Entrega;
import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.servicios.EntregaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrega")
public class ControladorEntrega {
    EntregaServicio entregaServicio;
    //guardar

    @PostMapping
    public ResponseEntity<?> guardarEntrega(@RequestBody Entrega datosEntrega){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED).body(this.entregaServicio.guardarEntrega(datosEntrega));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar todos
    @GetMapping
    public  ResponseEntity<?> buscarTodosEntrega(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.entregaServicio.buscarEntrega());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdEntrega(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.entregaServicio.buscarEntregaPorId(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarEntrega(@PathVariable Integer id, @RequestBody Entrega datosEntrega){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.entregaServicio.modificarEntrega(id, datosEntrega));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEntrega(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.entregaServicio.eliminarEntrega(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
