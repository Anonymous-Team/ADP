/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro07_PrimeNumber_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n, i, s = 0;
		double num = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Nhap n : ");
		n = reader.nextDouble();
		if (n > 0) {
			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					num = num + 1;
					System.out.print(" " + i);

				}
				if (i == 2) {
					s++;

				}// else
					// System.out.print(+n+"is normal number.");

			}
			System.out.print("So uoc so bang 2 : " + s);
		}
	}
}
