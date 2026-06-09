import java.util.*;

public class KeretaRepository {
    private final List<KeretaApi> daftarKereta;

    public KeretaRepository(){
        this.daftarKereta = new ArrayList<>();
        initDataAwal();
    }

    private void initDataAwal(){
        daftarKereta.add(new KeretaApi("Argo Bromo", "K01", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("Parahyangan", "K02", "JKT - BDG", 15));
    }

    public List<KeretaApi> getDaftarKereta(){
        return Collections.unmodifiableList(daftarKereta);
    }

    public KeretaApi mencariKodeKereta(String kodeKereta){
        for (KeretaApi kereta : daftarKereta){
            if (kereta.kodeKereta.equalsIgnoreCase(kodeKereta)){
                return kereta;
            }
        }
        return null;
    }
}
