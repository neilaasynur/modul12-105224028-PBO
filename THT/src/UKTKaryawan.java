public class UKTKaryawan implements PenghitunganUKT {
    private double tarifJurusan;
    private double biayaKelasMalam;

    public UKTKaryawan(double tarifJurusan, double biayaKelasMalam){
        this.tarifJurusan = tarifJurusan;
    }

    @Override
    public double hitungUKT (){
        System.out.println("Bayar ukt untuk kelas karyawan");
        return this.tarifJurusan + this.biayaKelasMalam;
    }
}
