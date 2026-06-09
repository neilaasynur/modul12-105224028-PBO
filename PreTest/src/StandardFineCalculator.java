public class StandardFineCalculator implements FineCalculator{
    @Override
    public double calculateFine(int hariKeterlambatan){
        return hariKeterlambatan * 2000;
    }
}
