public class OVO implements PaymentMethod, RefundablePayment {
    @Override
    public void pay(double amount){
        System.out.println("Mengeksekusi API OVO untuk pembayaran " + amount);
    }
    public void refund(double amount){
        System.out.println("Refund ke OVO sebesar " + amount);
    }
}

