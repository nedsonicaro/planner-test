package dip;

public class App {
    public static void main(String[] args) {
        MaquinaCartao maquinaCartao = new MaquinaCartao();
        MastercardImpl mastercard = new MastercardImpl();
        VisaImpl visa = new VisaImpl();

        maquinaCartao.efetuarTransacao(mastercard);
        maquinaCartao.efetuarTransacao(visa);

    }
}
