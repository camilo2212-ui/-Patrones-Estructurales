public class CryptoService {
    private String walletAddress;

    public CryptoService(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void transferCrypto(double value) {
        System.out.println("Transfiriendo " + value + " en criptomonedas a " + walletAddress);
    }
}
