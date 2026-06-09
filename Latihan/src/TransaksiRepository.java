import java.util.*;

public class TransaksiRepository {
    private final List<PesanTiket> riwayatTransaksi = new ArrayList<>();

    public void simpan(PesanTiket transaksi){
        riwayatTransaksi.add(transaksi);
    }

    public List<PesanTiket> getRiwayatTransaksi(){
        return Collections.unmodifiableList(riwayatTransaksi);
    }
}
