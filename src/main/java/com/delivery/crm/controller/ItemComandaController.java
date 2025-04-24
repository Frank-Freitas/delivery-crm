/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.controller;

/**
 *
 * @author Frank
 */
import com.delivery.crm.model.ItemComanda;
import com.delivery.crm.service.ItemComandaService;

import java.util.List;

public class ItemComandaController {

    private final ItemComandaService itemComandaService;

    public ItemComandaController( ItemComandaService itemComandaService) {
        this.itemComandaService = itemComandaService;
    }

    public void adicionarItem(ItemComanda item) {
        itemComandaService.adicionarItem(item);
    }

    public void removerItem(long id) {
        itemComandaService.removerItem(id);
    }

    public void atualizarQuantidade(long id, int quantidade) {
        itemComandaService.atualizarQuantidade(id, quantidade);
    }

    public List<ItemComanda> listarItens() {
        return itemComandaService.listarTodos();
    }
}
