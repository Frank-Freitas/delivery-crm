/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.delivery.crm.model;

import java.math.BigDecimal;

/**
 *
 * @author Frank
 */

/*
representa a associaçãode um produto com a quantidade comprada, 
e calcula o subtotal do item (quantidade * preço). 
 */
public class ItemComanda {

    private long id;

    private Produto produto;

    private int quantidade;   // Quantidade de produtos comprados

    private BigDecimal subValorTotal;  // Valor total para esse item (quantidade * preço dos produtos)

    public ItemComanda() {
    }

    public ItemComanda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.subValorTotal = produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
    }

    public long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        atualizarSubtotal();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        atualizarSubtotal();
    }

    public BigDecimal getSubtotal() {
        return subValorTotal;
    }
    
     public void setSubtotal(BigDecimal subtotal) {
        this.subValorTotal = subtotal;
    }

    private void atualizarSubtotal() {
        if (produto != null) {
            this.subValorTotal = produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
        }
    }

}
