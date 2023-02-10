package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.totalReais(dollar,quantity));


        sc.close();
    }
}
