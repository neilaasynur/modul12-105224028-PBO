public class UKTReguler implements PenghitunganUKT{
    private double tarifJurusan;

    public UKTReguler (double tarifJurusan){
        this.tarifJurusan = tarifJurusan;
    }

    @Override
    public double hitungUKT (){
        System.out.println("Bayar ukt untuk kelas reguler");
        return this.tarifJurusan;
    }
}
