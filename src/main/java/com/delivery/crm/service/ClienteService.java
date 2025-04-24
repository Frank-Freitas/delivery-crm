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

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;

public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }

    public Optional<Cliente> buscarPorId(long id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst();
    }

    public void removerCliente(long id) {
        clientes.removeIf(c -> c.getId() == id);
    }

    public void atualizarCliente(long id, Cliente novoCliente) {
        buscarPorId(id).ifPresent(cliente -> {
            cliente.setNome(novoCliente.getNome());
            cliente.setTelefone(novoCliente.getTelefone());
            cliente.setEndereco(novoCliente.getEndereco());
        });
    }
}
