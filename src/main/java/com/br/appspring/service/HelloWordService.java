package com.br.appspring.service;

import com.br.appspring.exception.ExceptionUser;
import org.springframework.stereotype.Service;

@Service
public class HelloWordService {

    public String helloWorld(String name) {

        if (name == null || name.isBlank()) {
            throw new ExceptionUser();
        }

        return "Hello World! " + name;
    }

    public String pedidos(){
        return "Pedidos";

    }

}