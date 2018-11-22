public class FiveBandResistor extends Resistor {

    private int band1;
    private int band2;
    private int band3;
    private int band4;
    private float band5;
    private double resistanceValue;

    public FiveBandResistor() {
        System.out.println("********************");
        System.out.println("5 Band Resister has 5 colors");
        System.out.println("1 , 2 and 3 are value");
        System.out.println("4 is multiplier");
        System.out.println("5 is tolerance");
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

    public int getBand4() {
        return band4;
    }

    public void setBand4(int band4) {
        this.band4 = band4;
    }

    public float getBand5() {
        return band5;
    }

    public void setBand5(float band5) {
        this.band5 = band5;
    }

    @Override
    public double calculateResistanceValue() {
        resistanceValue = ((band1*100)+(band2*10)+(band3)) * band4;
        return resistanceValue;
    }

    @Override
    public String getToleranceValue() {
        return "+/- " + band5 + "% ";
    }
}
