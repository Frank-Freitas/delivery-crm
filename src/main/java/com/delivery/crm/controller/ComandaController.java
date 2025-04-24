/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.controller;

/**
 *
 * @author Frank
 */

import com.delivery.crm.model.Cliente;
import com.delivery.crm.model.Comanda;
import com.delivery.crm.model.ItemComanda;
import com.delivery.crm.service.ComandaService;

import java.util.List;

public class ComandaController {

    private final ComandaService comandaService;

    public ComandaController() {
        this.comandaService = new ComandaService();
    }

    public void abrirComanda(Comanda comanda) {
        comandaService.abrirComanda(comanda);
    }

    public void fecharComanda(long id) {
        comandaService.fecharComanda(id);
    }

    public void adicionarItem(long comandaId, ItemComanda item) {
        comandaService.adicionarItem(comandaId, item);
    }

    public Comanda buscarPorId(long id) {
        return comandaService.buscarPorId(id);
    }

    public List<Comanda> listarTodas() {
        return comandaService.listarTodas();
    }

    public List<Comanda> listarPorCliente(Cliente cliente) {
        return comandaService.listarPorCliente(cliente);
    }
}

