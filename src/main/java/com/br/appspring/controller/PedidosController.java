package com.br.appspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidosController {


    @GetMapping("/pedidos")
    public String createPedido() {
        return "Pedidos encontrados!";
    }

    @PostMapping()
    public String buscarPedido(){
        return "Pedido em busca";
    }

}
