public class Main {
    public static void main(String[] args) {
        // Objetos de sistemas externos
        CreditCardProcesor ccProcessor = new CreditCardProcesor("1234-5678-9012-3456", "Juan Pérez", "12/28");
        PayPalAPI ppApi = new PayPalAPI("user@email.com");
        CryptoService cryptoService = new CryptoService("wallet123");

        // Adaptadores
        Payment creditCardPayment = new CreditCardAdapter(ccProcessor);
        Payment payPalPayment = new PayPalAdapter(ppApi);
        Payment cryptoPayment = new CryptoAdapter(cryptoService);

        // Usar todos con la misma interfaz
        creditCardPayment.pay(150.0);
        payPalPayment.pay(200.0);
        cryptoPayment.pay(0.5);
    }
}
