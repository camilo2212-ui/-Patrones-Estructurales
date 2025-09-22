public class CryptoAdapter implements Payment {
    private CryptoService cryptoService;

    public CryptoAdapter(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @Override
    public void pay(double amount) {
        cryptoService.transferCrypto(amount);
    }
}
