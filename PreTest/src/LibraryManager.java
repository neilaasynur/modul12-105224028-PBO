public class LibraryManager {
    private final BookRepository bookRepository;
    private final FineCalculator fineCalculator;
    private final ReceiptFormatter receiptFormatter;

    public LibraryManager (BookRepository bookRepository, FineCalculator fineCalculator, ReceiptFormatter receiptFormatter){
        this.bookRepository = bookRepository;
        this.fineCalculator = fineCalculator;
        this.receiptFormatter = receiptFormatter;
    }

    public void processLoan (String memberId, String judulBuku){
        Book book = bookRepository.mencariJudul(judulBuku);
    }

    public void processReturn (String memberName, String bookTitle, int daysLate){
        double fine = fineCalculator.calculateFine(daysLate);
        if (fine > 0){
            String receipt = receiptFormatter.formatReceipt(fine, memberName, bookTitle);
            System.out.println(receipt);
        }
    }
}
