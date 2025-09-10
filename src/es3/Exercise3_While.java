package es3;

import java.util.Scanner;

class Exercise3_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa (digita (:q) per uscire)");

        while (true) {
            input = scanner.nextLine();

            if (input.equals(":q")) {
                break;
            }

            String[] Parole = input.split("");

            String ParoleConLaVirgola = String.join(",", Parole);

            System.out.println(ParoleConLaVirgola);
        }

        scanner.close();
        System.out.println("Programma terminato.");
    }
}