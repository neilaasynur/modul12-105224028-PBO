public class EmailSystem implements EmailNotifier{
    @Override
    public void sendEmail(){
        System.out.println("Mengirimkan notifikasi resi via Email");
    }
}
