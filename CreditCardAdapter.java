public class CreditCardAdapter implements Payment {
    private CreditCardProcesor creditCardProcessor;

    public CreditCardAdapter(CreditCardProcesor creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    @Override
    public void pay(double amount) {
        creditCardProcessor.charge(amount);
    }
}
