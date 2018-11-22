abstract class Resistor implements Electronics {

    @Override
    public double calculateCurrent(double resistanceValue, double voltageValue) {
        System.out.println("Ohm's law : Voltage = Current * Resistance");
        return voltageValue/resistanceValue;
    }

    public double calculateResistanceValue() {
        return 0.00d;
    }

    public String getToleranceValue() {
        return null;
    }

    public void printAllColors() {
        System.out.println("********************");
        System.out.println("Color list");
        System.out.println("BLACK");
        System.out.println("BROWN");
        System.out.println("RED");
        System.out.println("ORANGE");
        System.out.println("YELLOW");
        System.out.println("GREEN");
        System.out.println("BLUE");
        System.out.println("VIOLET");
        System.out.println("GREY");
        System.out.println("********************");
    }

    public void printAllTolerances() {
        System.out.println("********************");
        System.out.println("Tolerance list");
        System.out.println("GOLD");
        System.out.println("SILVER");
        System.out.println("********************");
    }

    public static int colorToValue(String color) {
        int value;
        switch (color) {
            case "black" : value = Color.BLACK;
                break;
            case "brown" : value = Color.BROWN;
                break;
            case "red" : value = Color.RED;
                break;
            case "orange" : value = Color.ORANGE;
                break;
            case "yellow" : value = Color.YELLOW;
                break;
            case "green" : value = Color.GREEN;
                break;
            case "blue" : value = Color.BLUE;
                break;
            case "violet" : value = Color.VIOLET;
                break;
            case "grey" : value = Color.GREY;
                break;
            case "white" : value = Color.WHITE;
                break;
            default: value = 999;
                break;
        }
        return value;
    }

    public static int colorToMultiplier(String color) {
        int value;
        switch (color) {
            case "black" : value = Multiplier.BLACK;
                break;
            case "brown" : value = Multiplier.BROWN;
                break;
            case "red" : value = Multiplier.RED;
                break;
            case "orange" : value = Multiplier.ORANGE;
                break;
            case "yellow" : value = Multiplier.YELLOW;
                break;
            case "green" : value = Multiplier.GREEN;
                break;
            case "blue" : value = Multiplier.BLUE;
                break;
            case "violet" : value = Multiplier.VIOLET;
                break;
            case "grey" : value = Multiplier.GREY;
                break;
            case "white" : value = Multiplier.WHITE;
                break;
            default: value = 999;
                break;
        }
        return value;
    }

    public static float colorToTolerance(String color) {
        float value;
        switch (color) {
            case "gold" : value = Tolerance.GOLD;
                break;
            case "silver" : value = Tolerance.SILVER;
                break;
            default: value = 999.99f;
                break;
        }
        return value;
    }

    public void printResistor(String c1,String c2,String c3,String c4) {
        String print =  "==[ " + c1.toUpperCase() + " " + c2.toUpperCase() + " " + c3.toUpperCase() + " " + c4.toUpperCase() + " ]==";
        System.out.println(print);
    }

    public void printResistor(String c1,String c2,String c3,String c4,String c5) {
        String print = "==[ " + c1.toUpperCase() + " " + c2.toUpperCase() + " " + c3.toUpperCase() + " " + c4.toUpperCase() + " " + c5.toUpperCase() + " ]==";
        System.out.println(print);
    }
}
