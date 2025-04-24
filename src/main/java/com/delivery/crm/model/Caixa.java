/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Frank
 */
public class Caixa {

    private long id;
    
    private LocalDateTime dataAbertura;
    
    private LocalDateTime dataFechamento;
    
    private List<Comanda> comandasFechadas;
    
    private BigDecimal totalRecebido;
    
    private boolean aberto;

    public Caixa() {
        this.comandasFechadas = new ArrayList<>();
        this.totalRecebido = BigDecimal.ZERO;
        this.aberto = true;
        this.dataAbertura = LocalDateTime.now();
    }

    public void fecharCaixa() {
        this.dataFechamento = LocalDateTime.now();
        this.aberto = false;
        calcularTotalRecebido();
    }

    private void calcularTotalRecebido() {
        this.totalRecebido = comandasFechadas.stream()
                .map(Comanda::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void registrarComanda(Comanda comanda) {
        if (aberto && comanda.getStatus() == com.delivery.crm.model.enumm.StatusComanda.FECHADA) {
            comandasFechadas.add(comanda);
            calcularTotalRecebido();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public List<Comanda> getComandasFechadas() {
        return comandasFechadas;
    }

    public BigDecimal getTotalRecebido() {
        return totalRecebido;
    }

    public boolean isAberto() {
        return aberto;
    }
}
