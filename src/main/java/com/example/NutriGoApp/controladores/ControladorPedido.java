package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.ayudas.enums.PedidoEstado;
import com.example.NutriGoApp.modelos.Pedido;
import com.example.NutriGoApp.modelos.Producto;
import com.example.NutriGoApp.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class ControladorPedido {
    @Autowired
    PedidoServicio pedidoServicio;

//guardar

    @PostMapping
    public ResponseEntity<?> guardarPedido(@RequestBody Pedido datosPedido){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED).body(this.pedidoServicio.guardarPedido(datosPedido));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar todos
    @GetMapping
    public  ResponseEntity<?> buscarTodosPedidos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pedidoServicio.buscarPedido());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdPedido(@RequestBody Integer id_pedido){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pedidoServicio.buscarPedidoPorId(id_pedido));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarPedido(@PathVariable Integer id_pedido, @RequestBody Pedido datosPedido){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pedidoServicio.modificarPedido(id_pedido,datosPedido));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPedido(@PathVariable Integer id_pedido){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.pedidoServicio.eliminarPedido(id_pedido));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
