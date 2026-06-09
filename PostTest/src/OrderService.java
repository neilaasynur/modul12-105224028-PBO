public class OrderService {
    private final PaymentMethod paymentMethod;
    private final EmailNotifier emailNotifier;

    public OrderService(PaymentMethod paymentMethod, EmailNotifier emailNotifier) {
        this.paymentMethod = paymentMethod;
        this.emailNotifier = emailNotifier;
    }

    public void checkoutOrder(double amount) {
        System.out.println("Menyimpan data pesanan pelanggan ke database.");

        paymentMethod.pay(amount);

        emailNotifier.sendEmail();
    }
}
