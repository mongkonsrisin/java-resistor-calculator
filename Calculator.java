import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static Resistor resistor;
    static FourBandResistor fourBandResistor;
    static FiveBandResistor fiveBandResistor;
    static Scanner scanner = new Scanner(System.in);
    static double resistanceValue;
    static double voltageValue;
    static double currentValue;
    static String toleranceValue;

    public static void main(String[] args) {
        int selection;
        System.out.println("Welcome to Resistor Calculator");
        System.out.println("Please select a resistor type");
        System.out.println("1. 4 Band Resistor");
        System.out.println("2. 5 Band Resistor");
        System.out.print("Your choice : ");
        try {
            selection = scanner.nextInt();
            switch(selection){
                case 1 : calculateWithFourBand();
                    break;
                case 2 : calculateWithFiveBand();
                    break;
                default: error("Invalid input");
                    break;
            }
        } catch(InputMismatchException e) {
            error("Invalid input");
        }
    }

    private static void calculateWithFourBand() {
        scanner.nextLine();
        fourBandResistor = new FourBandResistor();
        System.out.println("You selected 4 Band Resistor");
        fourBandResistor.printAllColors();
        String[] selections = new String[4];
        //*****
        System.out.print("Please input your band 1 color :");
        selections[0] = scanner.nextLine();
        selections[0] = selections[0].toLowerCase();
        fourBandResistor.setBand1(Resistor.colorToValue(selections[0]));
        //*****
        System.out.print("Please input your band 2 color :");
        selections[1] = scanner.nextLine();
        selections[1] = selections[1].toLowerCase();
        fourBandResistor.setBand2(Resistor.colorToValue(selections[1]));
        //*****
        System.out.print("Please input your band 3 color :");
        selections[2] = scanner.nextLine();
        selections[2] = selections[2].toLowerCase();
        fourBandResistor.setBand3(Resistor.colorToMultiplier(selections[2]));
        //*****
        fourBandResistor.printAllTolerances();
        System.out.print("Please input your band 4 color :");
        selections[3] = scanner.nextLine();
        selections[3] = selections[3].toLowerCase();
        fourBandResistor.setBand4(Resistor.colorToTolerance(selections[3]));
        //*****
        if(fourBandResistor.getBand1() == 999 ||
                fourBandResistor.getBand2() == 999 ||
                fourBandResistor.getBand3() == 999 ||
                fourBandResistor.getBand4() == 999.99f) {
            error("Invalid color");
        }
        //*****
        fourBandResistor.printResistor(selections[0],selections[1],selections[2],selections[3]);
        resistanceValue = fourBandResistor.calculateResistanceValue();
        toleranceValue = fourBandResistor.getToleranceValue();
        result(fourBandResistor,resistanceValue,toleranceValue);
    }

    private static void calculateWithFiveBand() {
        scanner.nextLine();
        fiveBandResistor = new FiveBandResistor();
        System.out.println("You selected 5 Band Resistor");
        fiveBandResistor.printAllColors();
        String[] selections = new String[5];
        //*****
        System.out.print("Please input your band 1 color :");
        selections[0] = scanner.nextLine();
        selections[0] = selections[0].toLowerCase();
        fiveBandResistor.setBand1(Resistor.colorToValue(selections[0]));
        //*****
        System.out.print("Please input your band 2 color :");
        selections[1] = scanner.nextLine();
        selections[1] = selections[1].toLowerCase();
        fiveBandResistor.setBand2(Resistor.colorToValue(selections[1]));
        //*****
        System.out.print("Please input your band 3 color :");
        selections[2] = scanner.nextLine();
        selections[2] = selections[2].toLowerCase();
        fiveBandResistor.setBand3(Resistor.colorToValue(selections[2]));
        //*****
        System.out.print("Please input your band 4 color :");
        selections[3] = scanner.nextLine();
        selections[3] = selections[3].toLowerCase();
        fiveBandResistor.setBand4(Resistor.colorToMultiplier(selections[3]));
        //*****
        fiveBandResistor.printAllTolerances();
        System.out.print("Please input your band 5 color :");
        selections[4] = scanner.nextLine();
        selections[4] = selections[4].toLowerCase();
        fiveBandResistor.setBand5(Resistor.colorToTolerance(selections[4]));
        //*****
        if(fiveBandResistor.getBand1() == 999 ||
                fiveBandResistor.getBand2() == 999 ||
                fiveBandResistor.getBand3() == 999 ||
                fiveBandResistor.getBand4() == 999 ||
                fiveBandResistor.getBand5() == 999.99f) {
            error("Invalid color");
        }
        //*****
        fiveBandResistor.printResistor(selections[0],selections[1],selections[2],selections[3],selections[4]);
        resistanceValue = fiveBandResistor.calculateResistanceValue();
        toleranceValue = fiveBandResistor.getToleranceValue();
        result(fiveBandResistor,resistanceValue,toleranceValue);
    }

    private static void error(String e) {
        System.out.println("Error : " + e);
        System.exit(1);
    }

    private static void result(Resistor resistor,double resistanceValue,String toleranceValue) {
        System.out.println("This resister has a resistance value " + resistanceValue + " Ohms");
        System.out.println("This resister has " + toleranceValue + " tolerance");
        //*****
        System.out.print("Please input your power source (voltage) :");
        voltageValue = scanner.nextDouble();
        currentValue = resistor.calculateCurrent(resistanceValue,voltageValue);
        DecimalFormat df = new DecimalFormat("#.##########");
        System.out.println("This circuit will draw " + df.format(currentValue) + " Amperes , if you're connecting to " + voltageValue + " Volts power source");
    }

}
