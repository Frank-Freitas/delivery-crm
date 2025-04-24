/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.service;

/**
 *
 * @author Frank
 */

import com.delivery.crm.model.Cliente;
import com.delivery.crm.model.Comanda;
import com.delivery.crm.model.ItemComanda;
import com.delivery.crm.model.enumm.StatusComanda;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class ComandaService {

    private List<Comanda> comandas = new ArrayList<>();
    private Map<Long, List<ItemComanda>> itensPorComanda = new HashMap<>();

    public void abrirComanda(Comanda comanda) {
        comanda.setStatus(StatusComanda.ABERTA);
        comanda.setDataAbertura(LocalDateTime.now());
        comanda.setValorTotal(BigDecimal.ZERO);
        comandas.add(comanda);
        itensPorComanda.put(comanda.getId(), new ArrayList<>());
    }

    public void fecharComanda(long id) {
        for (Comanda comanda : comandas) {
            if (comanda.getId() == id) {
                comanda.setStatus(StatusComanda.FECHADA);
                comanda.setDataFechamento(LocalDateTime.now());
                break;
            }
        }
    }

    public void adicionarItem(long comandaId, ItemComanda item) {
        List<ItemComanda> itens = itensPorComanda.get(comandaId);
        if (itens != null) {
            itens.add(item);
            atualizarValorTotal(comandaId);
        }
    }

    private void atualizarValorTotal(long comandaId) {
        List<ItemComanda> itens = itensPorComanda.get(comandaId);
        BigDecimal total = BigDecimal.ZERO;
        if (itens != null) {
            for (ItemComanda item : itens) {
                total = total.add(item.getSubtotal());
            }
        }

        for (Comanda comanda : comandas) {
            if (comanda.getId() == comandaId) {
                comanda.setValorTotal(total);
                break;
            }
        }
    }

    public Comanda buscarPorId(long id) {
        for (Comanda comanda : comandas) {
            if (comanda.getId() == id) return comanda;
        }
        return null;
    }

    public List<Comanda> listarTodas() {
        return comandas;
    }

    public List<Comanda> listarPorCliente(Cliente cliente) {
        List<Comanda> resultado = new ArrayList<>();
        for (Comanda comanda : comandas) {
            if (comanda.getCliente().equals(cliente)) {
                resultado.add(comanda);
            }
        }
        return resultado;
    }

    public List<ItemComanda> listarItensDaComanda(long comandaId) {
        return itensPorComanda.getOrDefault(comandaId, new ArrayList<>());
    }
}

