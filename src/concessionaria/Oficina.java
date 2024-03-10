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
public class Oficina {
    private String listaVeiculosManuntencao;
    private String listaReparos;
    private final String listaVeiculosManutencao;
    
    public Oficina() {
        this.listaVeiculosManutencao = "";
        this.listaReparos = "";
    }

    public String getListaVeiculosManuntencao() {
        return listaVeiculosManuntencao;
    }

    public void setListaVeiculosManuntencao(String listaVeiculosManuntencao) {
        this.listaVeiculosManuntencao = listaVeiculosManuntencao;
    }

    public String getListaReparos() {
        return listaReparos;
    }

    public void setListaReparos(String listaReparos) {
        this.listaReparos = listaReparos;
    }

    public void realizarManutencao(String veiculo) {
        System.out.println("Manutenção realizada no veículo: " + veiculo);
    }

    public void adicionarReparo(String reparo) {
        this.listaReparos += reparo + "\n";
        System.out.println("Reparo adicionado à lista de reparos: " + reparo);
    }

    public void realizarReparo(String reparo) {
        System.out.println("Reparo realizado: " + reparo);
    }
}
