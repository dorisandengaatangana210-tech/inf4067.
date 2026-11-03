public class Main {

    public static void main(String[] args) {

        PaymentProcessor mobileProcessor =
            new PaymentProcessor(new MobilePayment());
        mobileProcessor.processPayment(1500);

        PaymentProcessor cardProcessor =
            new PaymentProcessor(new CreditCardPayment());
        cardProcessor.processPayment(6500);

        PaymentProcessor paypalProcessor =
            new PaymentProcessor(new PayPalPayment());
        paypalProcessor.processPayment(4500);

        PaymentProcessor cryptoProcessor =
            new PaymentProcessor(new CryptoPayment());
        cryptoProcessor.processPayment(2000);
    }
}
