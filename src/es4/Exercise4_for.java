package es4;

import java.util.Scanner;

public class Exercise4_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("scrivi un numero intero per far partire il conto alla rovescia");

        int NumeroDiPartenza = scanner.nextInt();

        scanner.close();

        System.out.println("inizio il conto alla rovescia");

        for (int i = NumeroDiPartenza; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Lancio!");
    }
}
