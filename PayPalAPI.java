public class PayPalAPI {
    private String email;

    public PayPalAPI(String email) {
        this.email = email;
    }

    public void sendPayment(double quantity) {
        System.out.println("Enviando pago de " + quantity + " vía PayPal a " + email);
    }
}
