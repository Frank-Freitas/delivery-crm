/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

/**
 *
 * @author Frank
 */
public class Endereco {

    private long id;

    private String estado;

    private String cidade;

    private String bairro;

    private String cep;

    private String rua;

    private String numeroCasa;

    private String referencia;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String cep, String rua,
            String numeroCasa, String referencia) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.referencia = referencia;
    }

    public long getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }
    
    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    public String getReferencia(){
        return referencia;
    }
    
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }
}
