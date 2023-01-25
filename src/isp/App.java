package isp;

public class App {

        public static void main(String[] args) {

            Fusca fusca = new Fusca();
            Lamborghini lamborghini = new Lamborghini();

            fusca.ligar();
            fusca.acelerar();
            lamborghini.ligar();
            lamborghini.abrirTetoSolar();
        }
}
