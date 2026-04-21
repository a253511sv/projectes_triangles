package exercici2;
/**
 * Program.java      1.0 07/11/2025
 *
 * Donat un nombre enter positiu, escriu els nombres de Fibonacci (Lleonard de Pisa)
 * inferiors o iguals a ell. Els nombres de Fibonacci es defineixen de la manera següent:
 * El primer és 0, el segon és 1, el següent és la suma dels dos
 * anteriors i així successivament.
 *
 * Copyright 2025 Sebastian Villanueva Miranda
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Fibonacci {

    public void fibonacci(int n) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;

        if (n == 0) {
            System.out.println(t1);
        } else {
            System.out.print(t1 + " " + t2 + " ");

            // mentre t3 < n
            t3 = t1 + t2;
            while (t3 <= n) {
                System.out.print(t3 + " ");
                t1 = t2;
                t2 = t3;
                t3 = t1 + t2;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Fibonacci p = new Fibonacci();
        p.fibonacci(50);
    }
}
