/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.service;

/**
 *
 * @author Frank
 */

import com.delivery.crm.model.Categoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoriaService {

    private final List<Categoria> categorias = new ArrayList<>();

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public List<Categoria> listarCategorias() {
        return new ArrayList<>(categorias);
    }

    public Optional<Categoria> buscarPorId(long id) {
        return categorias.stream().filter(c -> c.getId() == id).findFirst();
    }

    public void removerCategoria(long id) {
        categorias.removeIf(c -> c.getId() == id);
    }

    public void atualizarCategoria(long id, Categoria novaCategoria) {
        buscarPorId(id).ifPresent(categoria -> {
            categoria.setNome(novaCategoria.getNome());
        });
    }
}

