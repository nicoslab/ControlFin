/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.poo.models;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Conta {
    String nome;
    BigDecimal saldo;
    List<Registro> registros;
    BigDecimal rendimento;
    BigDecimal objetivo;
    
    public BigDecimal calculaSaldo(){
        return BigDecimal.ZERO;
    }
}
