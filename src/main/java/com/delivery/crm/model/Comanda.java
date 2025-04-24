/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

import com.delivery.crm.model.enumm.StatusComanda;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Frank
 */
public class Comanda {

    private long id;

    private Cliente cliente;

    private List<ItemComanda> itensComanda;

    private StatusComanda status;

    private BigDecimal valorTotal;

    private LocalDateTime dataAbertura;

    private LocalDateTime dataFechamento;

    public Comanda() {
        this.itensComanda = new ArrayList<>();
        this.status = StatusComanda.ABERTA;
        this.valorTotal = BigDecimal.ZERO;
        this.dataAbertura = LocalDateTime.now();
    }

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItemComanda(ItemComanda item) {
        this.itensComanda.add(item);
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = itensComanda.stream()
                .map(ItemComanda::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    
    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemComanda> getItensComanda() {
        return itensComanda;
    }

    public void setItensComanda(List<ItemComanda> itensComanda) {
        this.itensComanda = itensComanda;
        calcularValorTotal();
    }

    public StatusComanda getStatus() {
        return status;
    }

    public void setStatus(StatusComanda status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
}
