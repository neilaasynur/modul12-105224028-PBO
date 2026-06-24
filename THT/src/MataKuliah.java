public interface MataKuliah {
    String getKode();
    String getNama();
    int getSks();
    
    boolean validasiPrasyarat (String nim);
}
