/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

import java.math.BigDecimal;

import java.time.LocalDate;

import java.util.List;

/**
 *
 * @author Frank
 */
public class RelatorioVenda {

    private long id;
    
    private LocalDate data;
    
    private int totalComandas;
    
    private BigDecimal totalVendas;
    
    private List<ItemComanda> itensMaisVendidos;

    public RelatorioVenda(LocalDate data, int totalComandas, BigDecimal totalVendas, List<ItemComanda> itensMaisVendidos) {
        this.data = data;
        this.totalComandas = totalComandas;
        this.totalVendas = totalVendas;
        this.itensMaisVendidos = itensMaisVendidos;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Vendas do Dia: " + data);
        System.out.println("Total de Comandas: " + totalComandas);
        System.out.println("Valor Total das Vendas: " + totalVendas);
        System.out.println("Itens Mais Vendidos: " + itensMaisVendidos);
    }

    public long getId(){
        return id;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getTotalComandas() {
        return totalComandas;
    }

    public void setTotalComandas(int totalComandas) {
        this.totalComandas = totalComandas;
    }

    public BigDecimal getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(BigDecimal totalVendas) {
        this.totalVendas = totalVendas;
    }

    public List<ItemComanda> getItensMaisVendidos() {
        return itensMaisVendidos;
    }

    public void setItensMaisVendidos(List<ItemComanda> itensMaisVendidos) {
        this.itensMaisVendidos = itensMaisVendidos;
    }
}
