package dip;

public class MastercardImpl implements Mastercard{
    @Override
    public void efetuarTransacao() {
        System.out.println("Transação efetuada com sucesso via Mastercard!");
    }
}
