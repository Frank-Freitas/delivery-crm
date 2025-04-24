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

import com.delivery.crm.service.ClienteService;

import java.util.List;

import java.util.Optional;

public class ClienteController {

    private final ClienteService clienteService;
    
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    public void criarCliente(Cliente cliente) {
        clienteService.adicionarCliente(cliente);
    }

    public List<Cliente> obterTodosClientes() {
        return clienteService.listarClientes();
    }

    public Optional<Cliente> buscarClientePorId(long id) {
        return clienteService.buscarPorId(id);
    }

    public void deletarCliente(long id) {
        clienteService.removerCliente(id);
    }

    public void editarCliente(long id, Cliente clienteAtualizado) {
        clienteService.atualizarCliente(id, clienteAtualizado);
    }
}
