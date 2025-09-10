package es1;

public class Exercise1_if {
    public static void main(String[] args) {
        Exercise1_if controllo = new Exercise1_if();

        String First = "ciao";
        String Second = "belli";

        System.out.println("La stringa \"" + First + "\" ha una lunghezza pari? " + controllo.stringaPariDispari(First));
        System.out.println("La stringa \"" + Second + "\" ha una lunghezza pari? " + controllo.stringaPariDispari(Second));


        int Anno1 = 2000;
        int Anno2 = 2024;
        int Anno3 = 1999;

        System.out.println("l'anno \"" + Anno1 + "\" è un anno bisestile?  " + annoBisestile(Anno1));
        System.out.println("l'anno \"" + Anno2 + "\" è un anno bisestile?  " + annoBisestile(Anno2));
        System.out.println("l'anno \"" + Anno3 + "\" è un anno bisestile?  " + annoBisestile(Anno3));

    }

    public static boolean annoBisestile(int num) {
        if (num % 400 == 0) {
            return true;
        } else if (num % 100 == 0) {
            return false;
        } else return num % 4 == 0;
    }

    public boolean stringaPariDispari(String text) {
        return text.length() % 2 == 0;

    }

}
