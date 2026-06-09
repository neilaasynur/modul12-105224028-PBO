public class ValidatorPenumpang {
    public static void validasiNik(String nik){
        if (nik == null | nik.length() != 16 || nik.matches("[0-9]+")){
            throw new DataPenumpangTidakValidException(" >> error: NIK harus berisi tepat 16 angka!");
        }
    }
}
