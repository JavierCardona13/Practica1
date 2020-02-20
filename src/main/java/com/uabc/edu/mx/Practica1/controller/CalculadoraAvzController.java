package com.uabc.edu.mx.Practica1.controller;

import com.uabc.edu.mx.Practica1.model.Operacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraAvzController {
    @PostMapping(name="ops")
    public Operacion operaciones(@RequestParam(name="operacion") Operacion operacion){
        switch (operacion.getOp()){
            case SUMA:
                operacion.setResultado(operacion.getN1()+operacion.getN2());
                break;
            case RESTA:
                operacion.setResultado(operacion.getN1()-operacion.getN2());
                break;
            case MULTIPICACION:
                operacion.setResultado(operacion.getN1()+operacion.getN2());
                break;
        }
        return operacion;
    }
}
