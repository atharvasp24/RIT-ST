package activity;

public class WeightConverter {

    public static double Converter(double pounds){
        double kilo = pounds * 2.2;
        System.out.println("Pounds = " + pounds);
        System.out.println("Kilo = " + kilo);   
        return kilo;
        



    }

    public static void main(String[] args) {
        
        double total = Converter(45) + Converter(69);
        System.out.println("");
        System.out.println("Total = " + total);

        
    }

}
