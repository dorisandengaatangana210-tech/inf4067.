// Contrat commun à tous les modes de paiement
interface PaymentMethod {
    void pay(double amount);
}

// Paiement mobile
class MobilePayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Processing mobile payment: " + amount + " CFA"
        );
        // Logique spécifique aux paiements mobiles
    }
}

// Paiement par carte bancaire
class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Processing credit card payment: " + amount + " CFA"
        );
        // Logique spécifique aux cartes bancaires
    }
}

// Paiement par PayPal
class PayPalPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Processing PayPal payment: " + amount + " CFA"
        );
        // Logique spécifique à PayPal
    }
}

// Paiement en cryptomonnaie
class CryptoPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Processing crypto payment: " + amount + " CFA"
        );
        // Logique spécifique aux cryptomonnaies
    }
}

// Processeur dépendant du contrat PaymentMethod
public class PaymentProcessor {

    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
