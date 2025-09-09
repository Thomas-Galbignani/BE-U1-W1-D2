package es3;

import java.util.Scanner;

class Exercise3_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa (digita (:q) per uscire)");

        while (true) {
            input = scanner.nextLine();

            String spaceString = input.replace("", ",");

            System.out.println(spaceString);
            if (input.equals(":q")) {
                break;
            }


        }

        scanner.close();
        System.out.println("Programma terminato.");
    }
}
