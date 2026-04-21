package exercici5;

/**
 * Program.java      1.0 07/11/2025
 *
 * Donats el valor de la base, un nombre enter i l’exponent,
 * un nombre enter no negatiu, calcula el valor de la potència a b .
 * No emprar la funció Math.pow().
 *
 * Copyright 2025 Sebastian Villanueva Miranda
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
public class Program {

    public void myPow(int a, int b) {
        int potencia = 1;
        for (int i = 1; i <= b; i++) {
			potencia = potencia * a;
        }

        System.out.println("El producte de la potència :" + potencia);
    }

    public static void main(String[] args) {
        Program p = new Program();
        p.myPow(4, 3);
    }
}
