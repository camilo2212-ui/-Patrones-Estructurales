public class CreditCardProcesor {
    private String cardNumber;
    private String holderName;
    private String expirationDate;

    public CreditCardProcesor(String cardNumber, String holderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
    }

    public void charge(double total) {
        System.out.println("Cobrando " + total + " a tarjeta " + cardNumber +
                " de " + holderName + " expira " + expirationDate);
    }
}
