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
public class Veiculo {
    private String modelo;
    private int ano;
    private double preco;
    private String estado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void exibirInformacoevendaveiculos() {
        System.out.println("Informações do Veículo:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Estado: " + this.getEstado());
    }   
    
}
