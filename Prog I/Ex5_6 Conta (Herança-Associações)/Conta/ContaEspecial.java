package Conta;

public class ContaEspecial extends Conta {
    protected double limite;
    protected double taxMax;

    public ContaEspecial(int numero, double saldo, double limite, double taxMax) {
        super(numero, saldo);
        this.limite = limite;
        this.taxMax = taxMax;
    }

    public void setLimite(double lim) {
        this.limite = lim;
    }

    public void setTaxMax(double tax) {
        this.taxMax = tax;
    }

    public double getLimite() {
        return limite;
    }

    public double getTaxMax() {
        return taxMax;
    }

    @Override
    public void sacar(double val) {
        double saldo = getSaldo();
        double limite = getLimite();

        if (val <= this.saldo) {
            setSaldo(saldo - val);
            System.out.println("Saque concluído");

        }
        if (val > saldo) {
            double ney;
            ney = val - saldo;
            if (ney > limite) {
                System.out.println("Opa, parece que você não possuí saldo nem limite para o saque");
            } else {
                setSaldo(0);
                setLimite(limite - ney);
                System.out.println("Saque concluído");
            }
        }
    }

    @Override
    public void fazMan() {
        double desconto = (getTaxMax() / 100);
        double saldo = getSaldo();

        setSaldo(saldo - (desconto * saldo));
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Limite extra: " + getLimite());
        System.out.println("Taxa de manutenção: " + getTaxMax() + "%");

    }
}
