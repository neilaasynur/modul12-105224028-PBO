import java.util.*;

public class KRS {
    private List<MataKuliah> daftarMataKuliah;

    public KRS(){
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah matkul){
        this.daftarMataKuliah.add(matkul);
    }

    public List<MataKuliah> getDaftarMataKuliah(){
        return this.daftarMataKuliah;
    }
}