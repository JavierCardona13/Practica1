package com.uabc.edu.mx.Practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @GetMapping("/")
    public String inicio(){
        return "Hasta la proxima";
    }

    @GetMapping("sumar")
    public int suma(@RequestParam(value="n1")int n1,@RequestParam(value="n2")int n2){
        return n1+n2;
    }

    @GetMapping("restar")
    public int resta(@RequestParam(value="n1")int n1,@RequestParam(value="n2")int n2){
        return n1-n2;
    }

    @GetMapping("multiplicar")
    public int multiplicacion(@RequestParam(value="n1")int n1,@RequestParam(value="n2")int n2){
        return n1*n2;
    }

    @GetMapping("dividir")
    public int dividir(@RequestParam(value="n1")int n1,@RequestParam(value="n2")int n2){
        return n1/n2;
    }

    @GetMapping("elevar")
    public int cuadrado(@RequestParam(value="n1")int n1){
        return n1*n1;
    }

    @GetMapping("porsiento")
    public int porsentaje(@RequestParam(value="n1")int n1,@RequestParam(value="n2")int n2){
        return (n1*n2)/100;
    }

}
