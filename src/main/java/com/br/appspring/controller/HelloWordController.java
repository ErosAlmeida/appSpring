package com.br.appspring.controller;

import com.br.appspring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world ")
//@Controller
//@ResponseBody
public class HelloWordController {

    @Autowired// automaticamente injetada na minha classe
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "value" ) String filtrer ,@RequestBody User body) {
        return "Post Hello World!" + body.getName() + id;
    }
}
