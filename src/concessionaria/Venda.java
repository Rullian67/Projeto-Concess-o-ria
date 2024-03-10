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
public class Venda {
    private boolean veiculoVendido;
    private String clienteAssociado;
    private String dataVenda;
    private double valorVenda;

    public boolean isVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(boolean veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public String getClienteAssociado() {
        return clienteAssociado;
    }

    public void setClienteAssociado(String clienteAssociado) {
        this.clienteAssociado = clienteAssociado;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public void historicoCliente(Cliente cliente){
        System.out.println("Historico de clientes");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Telefone de contato: " + cliente.getTelefone());
        System.out.println("Historico de compras: " + cliente.getHistoricoDeCompras());
    }
}
