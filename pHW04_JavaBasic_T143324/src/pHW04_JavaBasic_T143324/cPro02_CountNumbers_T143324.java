/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro02_CountNumbers_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int n, a, b, i, num = 0;

		Scanner reader = new Scanner(System.in);
		System.out.print("Nhap so n duong : ");
		n = reader.nextInt();
		if (n > 0) {
			// true
			System.out.print("Nhap " + n + " so : ");

			int[] s = new int[n];
			for (i = 0; i < n; i++) {
				s[i] = reader.nextInt();
				num = num + s[i];
			}

			// calculate

			System.out.print("Cac so chia het cho 2 la :");
			for (i = 0; i < n; i++) {
				if (s[i] % 2 == 0) {
					// output
					System.out.println(" " + s[i]);
				}

			}
			System.out.println("Cac so chia het cho 3 la :");
			for (i = 0; i < n; i++) {
				if (s[i] % 3 == 0) {
					// output
					System.out.print(" " + s[i]);
				}
			}

		} else
			System.out.print("Invalid Input");

	}

}
