public class CreditCard implements PaymentMethod, RefundablePayment {
    @Override
    public void pay(double amount){
        System.out.println("Mengeksekusi API Bank untuk pembayaran " + amount);
    }
    public void refund(double amount){
        System.out.println("Refund ke Credit Card sebesar " + amount);
    }
}
