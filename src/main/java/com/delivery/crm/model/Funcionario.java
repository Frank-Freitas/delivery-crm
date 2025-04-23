/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

/**
 *
 * @author Frank
 */
public class Funcionario {
    
    private long id;
    
    private String nome;
    
    private String cpf;
    
    private String telefone;
    
    private String cargo;
    
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String telefone, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.salario = salario;
    }

    public long getId() {
        return id;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public String getCpf() {
        return cpf;
    };

    public void setCpf(String cpf) {
        this.cpf = cpf;
    };

    public String getTelefone() {
        return telefone;
    };

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    };

    public String getCargo() {
        return cargo;
    };

    public void setCargo(String cargo) {
        this.cargo = cargo;
    };

    public double getSalario() {
        return salario;
    };

    public void setSalario(double salario) {
        this.salario = salario;
    };
}
