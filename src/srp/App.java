package srp;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1.0, 2.0));
        System.out.println(calculadora.subtrair(1.0, 2.0));
        System.out.println(calculadora.multiplicar(1.0, 2.0));
        System.out.println(calculadora.dividir(1.0, 2.0));
    }
}
