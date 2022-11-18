package Conta;

import java.util.ArrayList;

public class CarteiraPrime extends Cliente {

    private ArrayList<Cliente> clientesPrime = new ArrayList<Cliente>();

    public void adicionar(Cliente cliente) {
        clientesPrime.add(cliente);
    }

    public void listarPrime() {
        for (Cliente cliente : clientesPrime) {
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("\nNome: " + cliente.getNome());
            System.out.println("Saldo: " + String.format("%.2f", cliente.getConta().getSaldo()));
            System.out.println("Número da conta: " + cliente.getConta().getNum());
        }
    }
}