/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

/**
 *
 * @author Frank
 */
public class Categoria { //pizza, bebida, sobremesa

    private long id;

    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
