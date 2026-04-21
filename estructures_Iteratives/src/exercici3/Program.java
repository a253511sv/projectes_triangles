package exercici3;


/**
 * Program.java        1.0  29/10/2025
 *
 * Donats dos nombre enters n 1 i n 2 amb n 1 < n 2 ,
 * escriu els nombres enters parells que hi ha dins l’interval [n 1 , n 2 ] en ordre creixent.
 *
 * El nombre zero es considera parell.
 *
 * Copyright 2025 Sebastian Villanueva Miranda.
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
public class Program {

    public void writerEvenNumber(int n1, int n2) {
        int i;
        for (i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] arg) {
        Program p = new Program();
        p.writerEvenNumber(1, 20);
    }
}
