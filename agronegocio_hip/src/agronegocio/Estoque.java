/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agronegocio;

/**
 *
 * @author 13304611690
 */
public class Estoque {
    private Vendavel vendavel;
    private int quantidade;

    public Estoque(Vendavel vendavel, int quantidade) {
        this.vendavel = vendavel;
        this.quantidade = quantidade;
    }

    public Vendavel getVendavel() {
        return vendavel;
    }

    public int getQuantidade() {
        return quantidade;
    }
}