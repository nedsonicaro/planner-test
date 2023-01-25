package ocp;

public class FolhaPagamento {


    private Double saldo;

    public void calcularSalario(Contrato contrato) {
        this.saldo = contrato.calcularRemuneracao();
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
