package exercici4;

/**
 * Program.java        1.0  29/10/2025
 *
 * Donat un nombre enter positiu, escriu els seus divisors positius.
 *
 *Llegeix un nombre enter n i n nombres enters i escriu el nombre més gran i el més petit d'ells. *
 *
 * Copyright 2025 Sebastian Villanueva Miranda.
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
 
import java.util.Scanner;
 public class Program {
	
    public static void main(String[] arg) {
		int n , min, max, numero;
		Scanner s = new Scanner(System.in);
		System.out.print("Quants numeros vols posar? : ");
		n = s.nextInt( );
		System.out.print("");
		numero = s.nextInt();
		min = numero;
		max = numero;
			for (int i = 1; i<= n - 1; i++) {
				System.out.print("");
				numero = s.nextInt();
				if (numero < min){
					min = numero;
				}else if (numero > max){
					max= numero;
				}
					max = numero > max ? numero : max;
					min = numero < min ? numero : min; 
				
				}

		System.out.print("El numero més petit és el : " + min);
		System.out.print("\nEl numero més gran és el : " + max);


	}
 } 
