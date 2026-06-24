public class UKTInternasional implements PenghitunganUKT{
     private double tarifInternasional;

    public UKTInternasional(double tarifInternasional){
        this.tarifInternasional = tarifInternasional;
    }

    @Override
    public double hitungUKT (){
        System.out.println("Bayar ukt untuk kelas internasional");
        return this.tarifInternasional;
    }
}
