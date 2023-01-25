package ocp;

public class App {

    public static void main(String[] args) {
        CLT funcionarioClt = new CLT();
        Estagio estagiario = new Estagio();

        var remuneracaoEstagiario = estagiario.calcularRemuneracao();
        System.out.println(remuneracaoEstagiario);

        var remuneracaoFuncionarioClt = funcionarioClt.calcularRemuneracao();
        System.out.println(remuneracaoFuncionarioClt);
    }

}
