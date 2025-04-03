package com.example.NutriGoApp.controladores;

import com.example.NutriGoApp.ayudas.enums.PedidoEstado;
import com.example.NutriGoApp.servicios.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class ControladorPedido {
    @Autowired
    PedidoServicio pedidoServicio;
}
