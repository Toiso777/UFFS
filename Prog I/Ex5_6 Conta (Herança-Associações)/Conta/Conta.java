package Conta;

import java.util.ArrayList;

abstract class Conta {
    protected int num;
    protected double saldo;
    public Cliente cliente;
    protected ArrayList<Movimentacao> extrato = new ArrayList<Movimentacao>();

    Conta(int num, double saldo) {
        this.num = num;
        this.saldo = saldo;

    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        this.extrato.add(new Movimentacao("", valor, 'C'));
        System.out.println("Depósito Concluído");
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Depósito Concluído");
            extrato.add(new Movimentacao("", valor, 'D'));
        }
    }

    public void resumoExtrato() {
        System.out.println("Extrato\n||-----------------------------------|| ");
        System.out.println("Saldo da conta " + getSaldo());
    }

    public void extrato() {
        for (Movimentacao movimenta : extrato) {
            movimenta.toString();
        }
    }

    public void fazMan() {

    }

    // -------------------------------------------------------------------//

    public double getSaldo() {
        return saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return extrato;
    }
}