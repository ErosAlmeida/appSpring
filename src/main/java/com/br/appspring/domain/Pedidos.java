package com.br.appspring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pedidos {
    private String id;
    private String status;
    private String nome;
    private String descricao;
}
