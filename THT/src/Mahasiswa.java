public class Mahasiswa {
    private String nim;
    private String nama;
    private String tipeJalur;

    public Mahasiswa (String nim, String nama, String tipeJalur){
        this.nim = nim;
        this.nama = nama;
        this.tipeJalur = tipeJalur;
    }

    public String getNim (){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getTipeJalur(){
        return tipeJalur;
    }
}
