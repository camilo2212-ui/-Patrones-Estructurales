public class PayPalAdapter implements Payment {
    private PayPalAPI paypalAPI;

    public PayPalAdapter(PayPalAPI paypalAPI) {
        this.paypalAPI = paypalAPI;
    }

    @Override
    public void pay(double amount) {
        paypalAPI.sendPayment(amount);
    }
}
