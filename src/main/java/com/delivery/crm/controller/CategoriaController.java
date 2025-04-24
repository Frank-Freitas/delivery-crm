/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.controller;

/**
 *
 * @author Frank
 */

import com.delivery.crm.model.Categoria;

import com.delivery.crm.service.CategoriaService;

import java.util.List;

import java.util.Optional;

public class CategoriaController {

    private final CategoriaService categoriaService;
    
    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    };

    public void criarCategoria(Categoria categoria) {
        categoriaService.adicionarCategoria(categoria);
    }

    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    public Optional<Categoria> buscarCategoriaPorId(long id) {
        return categoriaService.buscarPorId(id);
    }

    public void deletarCategoria(long id) {
        categoriaService.removerCategoria(id);
    }

    public void editarCategoria(long id, Categoria categoriaAtualizada) {
        categoriaService.atualizarCategoria(id, categoriaAtualizada);
    }
}

