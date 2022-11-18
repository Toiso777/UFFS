package Conta;

public class ContaInvestimento extends Conta {
    protected double taxaRend;

    public ContaInvestimento(int numero, double saldo, double taxaRend) {
        super(numero, saldo);
        this.taxaRend = taxaRend;
    }

    public double getTaxaRend() {
        return taxaRend;
    }

    public void setTaxaRend(double taxaRend) {
        this.taxaRend = taxaRend;
    }

    @Override
    public void fazMan() {
        double dec;
        dec = getTaxaRend() / 100;
        setSaldo(getSaldo() + (getSaldo() * dec));
        System.out.println("Manutenção realizada!");
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Sua conta está rendendo " + getTaxaRend() + "% a cada manutenção.");
    }

}
