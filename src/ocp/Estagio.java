package ocp;

public class Estagio implements Contrato {

    private static final Double BOLSA_ESTAGIO = 9999.00;
    private static final Double VALE_ALIMENTACAO = 20.00;

    @Override
    public Double calcularRemuneracao() {
        return BOLSA_ESTAGIO + VALE_ALIMENTACAO;
    }

}
