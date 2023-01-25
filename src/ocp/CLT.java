package ocp;

public class CLT implements Contrato {

    private static final Double SALARIO_MINIMO = 1302.00;

    @Override
    public Double calcularRemuneracao() {
        return SALARIO_MINIMO;
    }

}
