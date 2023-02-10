package util;

public class CurrencyConverter {

    public static final double converter = 6;
    public static double totalReais(double dollar, double quantity){
        return dollar * quantity + dollar * quantity * converter / 100;
    }
}
