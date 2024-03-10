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
public class Concessionaria {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelefone("123456789");

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Modelo XYZ");
        veiculo.setAno(2022);
        veiculo.setPreco(25000.0);
        veiculo.setEstado("Novo");

        Venda venda = new Venda();
        venda.setVeiculoVendido(true);
        venda.setClienteAssociado(cliente.getNome());
        venda.setDataVenda("07/03/2024");
        venda.setValorVenda(veiculo.getPreco());

        
        cliente.adicionarCompra(venda, veiculo);

        veiculo.exibirInformacoevendaveiculos();

        venda.historicoCliente(cliente);
    }
}
