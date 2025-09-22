interface Payment {
    void pay(double amount);
}

class CreditCardProcessor {
    private String cardNumber;
    private String holderName;
    private String expirationDate;

    public CreditCardProcessor(String cardNumber, String holderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
    }

    public void charge(double total) {
        System.out.println("Pagando con tarjeta de crédito (" + holderName + "): $" + total);
    }
}

class PayPalAPI {
    private String email;

    public PayPalAPI(String email) {
        this.email = email;
    }

    public void sendPayment(double quantity) {
        System.out.println("Pagando con PayPal (" + email + "): $" + quantity);
    }
}

class CryptoService {
    private String walletAddress;

    public CryptoService(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void transferCrypto(double value) {
        System.out.println("Pagando con criptomonedas (" + walletAddress + "): " + value + " BTC");
    }
}

class CreditCardAdapter implements Payment {
    private CreditCardProcessor processor;

    public CreditCardAdapter(CreditCardProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void pay(double amount) {
        processor.charge(amount);
    }
}

class PayPalAdapter implements Payment {
    private PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.sendPayment(amount); 
    }
}

class CryptoAdapter implements Payment {
    private CryptoService crypto;

    public CryptoAdapter(CryptoService crypto) {
        this.crypto = crypto;
    }

    @Override
    public void pay(double amount) {
        crypto.transferCrypto(amount); 
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardProcessor cardProcessor = new CreditCardProcessor("1234-5678-9999-0000", "Juan Pérez", "12/26");
        PayPalAPI paypalAPI = new PayPalAPI("juan@example.com");
        CryptoService cryptoService = new CryptoService("1ABCxyzWallet");

        Payment creditPayment = new CreditCardAdapter(cardProcessor);
        Payment paypalPayment = new PayPalAdapter(paypalAPI);
        Payment cryptoPayment = new CryptoAdapter(cryptoService);

        creditPayment.pay(100.0);
        paypalPayment.pay(50.5);
        cryptoPayment.pay(0.0025);
    }
}
