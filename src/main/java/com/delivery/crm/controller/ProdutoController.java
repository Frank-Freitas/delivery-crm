/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.controller;

import com.delivery.crm.model.Produto;

import com.delivery.crm.service.ProdutoService;

import java.util.List;

import java.util.Optional;

/**
 *
 * @author Frank
 */
public class ProdutoController {
    
     private final ProdutoService produtoService;

     public ProdutoController(ProdutoService produtoService){
         this.produtoService = produtoService;
     }
    public void criarProduto(Produto produto) {
        produtoService.adicionarProduto(produto);
    }

    public List<Produto> obterTodos() {
        return produtoService.listarProdutos();
    }

    public Optional<Produto> buscarPorId(long id) {
        return produtoService.buscarPorId(id);
    }

    public void deletarProduto(long id) {
        produtoService.removerProduto(id);
    }

    public void editarProduto(long id, Produto produtoAtualizado) {
        produtoService.atualizarProduto(id, produtoAtualizado);
    }
    
}
