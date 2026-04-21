package tui;

import java.util.Scanner;

public class ProgramTUI {

    // Mètode suma
    public static int suma(String cadena) {
        int sumaTotal = 0;

        // Separem els nombres per espais
        String[] numeros = cadena.split(" ");

        // Recorrem l'array
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += Integer.parseInt(numeros[i]);
        }

        return sumaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;

        do {
            // Menú
            System.out.println("===== MENU =====");
            System.out.println("1. Sumar nombres");
            System.out.println("2. Sortir");
            System.out.print("Escull una opció: ");

            opcio = sc.nextInt();
            sc.nextLine(); // netejar buffer

            if (opcio == 1) {
                System.out.print("Introdueix nombres separats per espais: ");
                String entrada = sc.nextLine();

                int resultat = suma(entrada);

                System.out.println("La suma és: " + resultat);
            } else if (opcio == 2) {
                System.out.println("Sortint del programa...");
            } else {
                System.out.println("Opció no vàlida");
            }

        } while (opcio != 2);

        sc.close();
    }
}