import java.util.*;

public class Reservasi {
    private final KeretaRepository repoKereta;
    private final TransaksiRepository repoTransaksi;

    public Reservasi(KeretaRepository repoKereta, TransaksiRepository repoTransaksi){
        this.repoKereta = repoKereta;
        this.repoTransaksi = repoTransaksi;
    }

    public void pesanTiket (String kodeKereta, String nik, String namaPenumpang, int jumlah)throws RuteTidakDitemukanException, TiketHabisException{
        new ValidatorPenumpang().validasiNik(nik);

        KeretaApi target = repoKereta.mencariKodeKereta(kodeKereta);
        if(target == null){
            throw new RuteTidakDitemukanException(" >> error: Rute perjalan tidak ditemukan!");
        }

        target.kurangiKursi(jumlah);
        PesanTiket transaksiBaru = new PesanTiket(target.kodeKereta, nik, namaPenumpang, jumlah);
        repoTransaksi.simpan(transaksiBaru);
    }
}
