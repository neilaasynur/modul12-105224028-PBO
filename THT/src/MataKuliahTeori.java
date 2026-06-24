public class MataKuliahTeori implements MataKuliah{
    private String kode;
    private String nama;
    private int sks;

    public MataKuliahTeori(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String getKode(){
        return this.kode;
    }
    public String getNama(){
        return this.nama;
    }
    public int getSks(){
        return this.sks;
    }
    public boolean validasiPrasyarat(String nim){
        System.out.println("Memeriksa prasyarat teori untuk mata kuliah " + this.nama);
        return true;
    }
}
