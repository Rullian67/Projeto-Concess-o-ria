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
public class Marca {
    private String nome;
    private String paisOrigem;
    private String[] modelosAssociados;

    public Marca(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.modelosAssociados = new String[0]; 
   }

   public void adicionarModelo(String modelo) {
        String[] novoArray = new String[modelosAssociados.length + 1];

        for (int i = 0; i < modelosAssociados.length; i++) {
            novoArray[i] = modelosAssociados[i];
        }

        novoArray[modelosAssociados.length] = modelo;

        this.modelosAssociados = novoArray;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getModelosAssociados() {
        return modelosAssociados;
    }

    public void setModelosAssociados(String modelosAssociados) {
        this.modelosAssociados = modelosAssociados;
    }
     public void exibirInformacoes() {
        System.out.println("Nome da marca: " + nome);
        System.out.println("Pais de origem: " + paisOrigem);
        System.out.println("Modelos associados: " + String.join(", ", modelosAssociados));
    }
    
}
