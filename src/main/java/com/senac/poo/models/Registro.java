/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.poo.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Registro {
    Date data;
    String operacao;
    String comentario;
    BigDecimal valor;
    List<Tag> tags;
}
