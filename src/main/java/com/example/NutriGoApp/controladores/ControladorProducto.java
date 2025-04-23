package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.modelos.Producto;
import com.example.NutriGoApp.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    @Autowired
    ProductoServicio productoServicio;

    //guardar

    @PostMapping
    public ResponseEntity<?> guardarProducto(@RequestBody Producto datosProducto){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED).body(this.productoServicio.guardarProducto(datosProducto));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar todos
    @GetMapping
    public  ResponseEntity<?> buscarTodosProductos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.productoServicio.buscarProducto());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarIdProducto(@RequestBody Integer id_producto){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.productoServicio.buscarProductoPorId(id_producto));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Modificar
    @PutMapping("/{id}")
    public ResponseEntity<?> modificarProducto(@PathVariable Integer id_producto, @RequestBody Producto datosProducto){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.productoServicio.modificarProducto(id_producto,datosProducto));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable Integer id_producto){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.productoServicio.eliminarProducto(id_producto));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
