package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Pago;
import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.servicios.PagoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pago")
public class ControladorPago {
    @Autowired
    PagoServicio pagoServicio;

    //guardar

    @PostMapping
    public ResponseEntity<?> guardarPago(@RequestBody Pago datosPago){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED).body(this.pagoServicio.guardarPago(datosPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar todos
    @GetMapping
    public  ResponseEntity<?> buscarTodosPagos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pagoServicio.buscarTodosPagos());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdPago(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pagoServicio.buscarPago(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarPago(@PathVariable Integer id, @RequestBody Pago datosPago){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pagoServicio.modificarPorId(id,datosPago));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPago(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pagoServicio.eliminarPorId(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
