package lsp;

public class App {

    public static void main(String[] args) {

        Pai pai = new Pai();
        Filha filha = new Filha();
        Saudacao saudacao = new Saudacao();

        saudacao.imprimirSaudacao(pai);
        saudacao.imprimirSaudacao(filha);
    }}
