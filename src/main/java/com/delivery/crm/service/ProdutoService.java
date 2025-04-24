/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.service;

import com.delivery.crm.model.Produto;

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;

/**
 *
 * @author Frank
 */
public class ProdutoService {
    
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    public Optional<Produto> buscarPorId(long id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public void removerProduto(long id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    public void atualizarProduto(long id, Produto novoProduto) {
        buscarPorId(id).ifPresent(produto -> {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            produto.setCategoria(novoProduto.getCategoria());
        });
    }
}
