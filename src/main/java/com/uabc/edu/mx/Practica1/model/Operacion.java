package com.uabc.edu.mx.Practica1.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Operacion implements Serializable {

    @Getter@Setter
    private double n1;
    @Getter@Setter
    private double n2;
    @Getter@Setter
    private double resultado;
    @Getter@Setter
    private OPERACIONES op;
}
