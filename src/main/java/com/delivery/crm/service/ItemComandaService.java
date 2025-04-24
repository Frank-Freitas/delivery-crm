/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.service;

/**
 *
 * @author Frank
 */

import com.delivery.crm.model.ItemComanda;

import java.util.ArrayList;
import java.util.List;

public class ItemComandaService {

    private List<ItemComanda> itens = new ArrayList<>();

    public void adicionarItem(ItemComanda item) {
        itens.add(item);
    }

    public void removerItem(long id) {
        itens.removeIf(item -> item.getId() == id);
    }

    public void atualizarQuantidade(long id, int novaQuantidade) {
        for (ItemComanda item : itens) {
            if (item.getId() == id) {
                item.setQuantidade(novaQuantidade);
                item.setSubtotal(item.getProduto().getPreco().multiply(
                    java.math.BigDecimal.valueOf(novaQuantidade)));
                break;
            }
        }
    }

    public List<ItemComanda> listarTodos() {
        return itens;
    }
}