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
public class Financeiro {
    private double fluxoCaixa;
    private String contasPagar;
    private  String contasReceber; 
    
    public Financeiro(double fluxoCaixa, String contasPagar, String contasReceber) {
        this.fluxoCaixa = fluxoCaixa;
        this.contasPagar = contasPagar;
        this.contasReceber = contasReceber;
    }

    public double getFluxoCaixa() {
        return fluxoCaixa;
    }

    public void setFluxoCaixa(double fluxoCaixa) {
        this.fluxoCaixa = fluxoCaixa;
    }

    public String getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(String contasPagar) {
        this.contasPagar = contasPagar;
    }

    public String getContasReceber() {
        return contasReceber;
    }

    public void setContasReceber(String contasReceber) {
        this.contasReceber = contasReceber;
    }
    
     public void pagarComissao(Vendedor vendedor, Venda venda) {
        double comissao = vendedor.calcularComissao(venda);
        this.fluxoCaixa -= comissao;
        System.out.println("Comissão paga ao vendedor: " + comissao);
    }

    public void registrarVenda(Venda venda) {
        this.fluxoCaixa += venda.getValorVenda();
        System.out.println("Venda registrada. Fluxo de caixa atual: " + this.fluxoCaixa);
    }
}
