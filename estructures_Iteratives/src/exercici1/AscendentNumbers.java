package exercici1;

/**
 * Program.java        1.0  29/10/2025
 *
 * Determinar en ordre ascendent els nombres dins d'un interval.
 *
 * Copyright 2025 Sebastian Villanueva Miranda.
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class AscendentNumbers {
    
    public void writeAscNumbers(int n1, int n2) {
        int i = n1;
        while (i <= n2) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AscendentNumbers p = new AscendentNumbers();
        p.writeAscNumbers(1, 5);
    }
}
