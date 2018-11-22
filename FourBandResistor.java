public class FourBandResistor extends Resistor {

    private int band1;
    private int band2;
    private int band3;
    private float band4;
    private double resistanceValue;

    public FourBandResistor() {
        System.out.println("********************");
        System.out.println("4 Band Resister has 4 colors");
        System.out.println("1 and 2 are value");
        System.out.println("3 is multiplier");
        System.out.println("4 is tolerance");
        System.out.println("********************");
    }

    public int getBand1() {
        return band1;
    }

    public void setBand1(int band1) {
        this.band1 = band1;
    }

    public int getBand2() {
        return band2;
    }

    public void setBand2(int band2) {
        this.band2 = band2;
    }

    public int getBand3() {
        return band3;
    }

    public void setBand3(int band3) {
        this.band3 = band3;
    }

    public float getBand4() {
        return band4;
    }

    public void setBand4(float band4) {
        this.band4 = band4;
    }

    @Override
    public double calculateResistanceValue() {
        resistanceValue = ((band1*10)+band2) * band3;
        return resistanceValue;
    }

    @Override
    public String getToleranceValue() {
        return "+/- " + band4 + "% ";
    }

}
