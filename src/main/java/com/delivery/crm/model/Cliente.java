/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

/**
 *
 * @author Frank
 */
public class Cliente {
    
    private Long id;
    
    private String nome;
    
    private String telefone;
    
    private Endereco endereco;
    
    public Cliente(){
    }
    
    public Cliente(String nome, String telefone, Endereco endereco){
        this.nome = nome;
        this.telefone = telefone;
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
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
}
