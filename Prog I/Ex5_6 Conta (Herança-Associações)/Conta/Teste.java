package Conta;

public class Teste {
    public static void main(String[] args) {
        Cliente Neymar = new Cliente("Neymar Junior", "40028922");
        ContaEspecial contaEspecial = new ContaEspecial(01, 500, 100000, 10);
        contaEspecial.setCliente(Neymar);
        Neymar.setConta(contaEspecial);

        // Populando conta investimento
        Cliente Cerriseti = new Cliente("Cerriseti", "8945621320");
        ContaInvestimento contaInvestimento = new ContaInvestimento(02, 2032, 0.15);
        contaInvestimento.setCliente(Cerriseti);
        Cerriseti.setConta(contaInvestimento);

        // Conta especial
        System.out.print("Teste de conta especial:");
        contaEspecial.resumoExtrato();

        contaEspecial.sacar(3000);
        contaEspecial.resumoExtrato();

        contaEspecial.sacar(102);
        contaEspecial.resumoExtrato();

        contaEspecial.sacar(80);
        contaEspecial.resumoExtrato();

        System.out.println("\nTeste de conta investimento:");
        contaInvestimento.resumoExtrato();

        contaInvestimento.sacar(129);
        contaInvestimento.resumoExtrato();

        contaInvestimento.depositar(40);
        contaInvestimento.resumoExtrato();

        contaInvestimento.sacar(79);
        contaInvestimento.resumoExtrato();

        contaInvestimento.fazMan();
        contaInvestimento.resumoExtrato();

        // CarteiraPrime
        CarteiraPrime clientesPrime = new CarteiraPrime();
        clientesPrime.adicionar(Neymar);
        clientesPrime.adicionar(Cerriseti);
        clientesPrime.listarPrime();

    }
}