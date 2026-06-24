public class App {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("105224028", "Neila Asynur", "REGULER");

        KRS krsNeila = new KRS();
        krsNeila.tambahMataKuliah(new MataKuliahTeori("CS201", "Struktur Data", 3));
        
        MataKuliahPraktikum praktikumPbo = new MataKuliahPraktikum("CS201L", "Praktikum PBO", 1);
        krsNeila.tambahMataKuliah(praktikumPbo);

        System.out.println(" >> Memproses KRS untuk: " + mhs1.getNama());
        
        for (MataKuliah matkul : krsNeila.getDaftarMataKuliah()) {
            matkul.validasiPrasyarat(mhs1.getNim());
            
            if (matkul instanceof KebutuhanPraktikum) {
                KebutuhanPraktikum prak = (KebutuhanPraktikum) matkul;
                prak.cekPeralatanPraktikum();
                prak.alokasiAsistenLab();
            }
        }

        PenghitunganUKT uktNeila = new UKTReguler(8000000.0);
        double totalUKTNeila = uktNeila.hitungUKT();
        System.out.println("Total Biaya yang harus dibayar " + mhs1.getNama() + " Rp" + totalUKTNeila);
        System.out.println("-----------------------------------------------------------------\n");

        Mahasiswa mhs2 = new Mahasiswa("105224019", "Fatin Atin", "KARYAWAN");
        
        KRS krsAtin = new KRS();
        krsAtin.tambahMataKuliah(new MataKuliahTeori("AK101", "Pengantar Akuntansi", 3));

        System.out.println(" >> Memproses KRS untuk: " + mhs2.getNama());
        
        for (MataKuliah matkul : krsAtin.getDaftarMataKuliah()) {
            matkul.validasiPrasyarat(mhs2.getNim());
        }

        PenghitunganUKT uktAtin = new UKTKaryawan(5000000.0, 1500000.0);
        double totalUKTAtin = uktAtin.hitungUKT();
        System.out.println("Total Biaya yang harus dibayar" + mhs2.getNama() + ": Rp" + totalUKTAtin);
        System.out.println("-----------------------------------------------------------------\n");

        Mahasiswa mhs3 = new Mahasiswa("105224050", "Iya Hayatul", "MBKM");
        
        KRS krsIya = new KRS();

        krsIya.tambahMataKuliah(new MataKuliahMBKM("MBKM01", "Magang Bersertifikat", 6));

        System.out.println(" >> Memproses KRS untuk: " + mhs3.getNama());
        
        for (MataKuliah matkul : krsIya.getDaftarMataKuliah()) {
            matkul.validasiPrasyarat(mhs3.getNim());
        }

        PenghitunganUKT uktIya = new UKTBidikMisi();
        double totalUKTIya = uktIya.hitungUKT();
        System.out.println("Total Biaya yang harus dibayar " + mhs3.getNama() + ": Rp" + totalUKTIya);
        System.out.println("-----------------------------------------------------------------\n");
    }
}