package isp;

public class Lamborghini implements CarroConversivel {

    @Override
    public void virarEsquerda() {
        System.out.println("Virando para a esquerda");
    }

    @Override
    public void virarDireita() {
        System.out.println("Virando para a direita");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }

    @Override
    public void trocarMarcha() {
        System.out.println("Trocando a marcha do carro");
    }

    @Override
    public void abrirTetoSolar() {
        System.out.println("Abrindo teto solar");
    }
}


