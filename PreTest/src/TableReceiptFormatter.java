public class TableReceiptFormatter implements ReceiptFormatter{
    @Override
    public String formatReceipt (double fineAmount, String judulBuku, String namaPengguna){
        return "| " + namaPengguna + " | " + judulBuku + " | " + fineAmount + " | ";
    }
}
