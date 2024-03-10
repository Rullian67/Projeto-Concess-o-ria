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
public class TesteDeVendas2 {
    public static void main(String[] args) {
        
        Financeiro financeiro = new Financeiro(100000.0, "", "");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("João Vendedor");
        vendedor.setComissao(10.0);

        Venda venda = new Venda();
        venda.setValorVenda(25000.0);

        // Pagar comissão ao vendedor
        financeiro.pagarComissao(vendedor, venda);

        // Registrar venda no financeiro
        financeiro.registrarVenda(venda);

        // Criando uma instância da classe Marca
        Marca marca = new Marca("Toyota", "Japão");
        marca.adicionarModelo("Corolla");
        marca.adicionarModelo("Camry");

        // Exibindo informações da marca
        marca.exibirInformacoes();

        // Criando uma instância da classe Oficina
        Oficina oficina = new Oficina();


        // Exibindo lista de veículos em manutenção
        System.out.println("Lista de veículos em manutenção:\n" + oficina.getListaVeiculosManuntencao());

        // Realizando manutenção em um veículo
        oficina.realizarManutencao("Carro A");

        // Adicionando reparos à lista de reparos
        oficina.adicionarReparo("Troca de óleo");
        oficina.adicionarReparo("Troca de pneus");

        // Exibindo lista de reparos
        System.out.println("Lista de reparos:\n" + oficina.getListaReparos());
    }
}

