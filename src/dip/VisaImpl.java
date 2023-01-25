package dip;

public class VisaImpl implements Visa{
    @Override
    public void efetuarTransacao() {
        System.out.println("Transação efetuada com sucesso via Visa!");
    }
}
