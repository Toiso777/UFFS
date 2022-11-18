package Conta;

public class Movimentacao {
    private String data;
    private double valor;
    private char tipo;

    Movimentacao() {
    }

    Movimentacao(String data, double valor, char tipo) {
        this.setData(data);
        this.setValor(valor);
        this.setTipo(tipo);
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public double setValor(double valor) {
        return this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public char setTipo(char tipo) {
        return this.tipo = tipo;
    }

    public char getTipo() {
        return this.tipo;
    }

}
