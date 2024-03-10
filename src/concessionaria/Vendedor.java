/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author rulli
 */
public class Vendedor {
    private String nome;
    private double comissao;
    private String historicoDeVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getHistoricoDeVendas() {
        return historicoDeVendas;
    }

    public void setHistoricoDeVendas(String historicoDeVendas) {
        this.historicoDeVendas = historicoDeVendas;
    }
    
    public double calcularComissao(Venda venda){
        double receber = venda.getValorVenda() * (this.comissao / 100);
        return receber;
    }
}
