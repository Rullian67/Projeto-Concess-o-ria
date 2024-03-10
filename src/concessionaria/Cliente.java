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
public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String historicoDeCompras;

   public Cliente() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
        this.historicoDeCompras = "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHistoricoDeCompras() {
        return historicoDeCompras;
    }

    public void setHistoricoDeCompras(String historicoDeCompras) {
        this.historicoDeCompras = historicoDeCompras;
    }
    
     public void adicionarCompra(Venda venda, Veiculo veiculo) {
        String novaCompra = "Veículo: " + veiculo.getModelo() + ", Valor: " + venda.getValorVenda() + "\n";
        this.historicoDeCompras += novaCompra;
    }

    
    public void status() {
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("Endereço do cliente: " + this.getEndereco());
        System.out.println("Telefone do cliente: " + this.getTelefone());
        System.out.println("Histórico de compras: ");
        exibirHistoricoDeCompras();
    }


    private void exibirHistoricoDeCompras() {
        System.out.println(this.historicoDeCompras);
    }
}
