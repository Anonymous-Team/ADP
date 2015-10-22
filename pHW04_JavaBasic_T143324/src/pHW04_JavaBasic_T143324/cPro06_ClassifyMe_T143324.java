/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro06_ClassifyMe_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int n, i, s = 0;
		int num = 0;
		// tao vung nho
		Scanner reader = new Scanner(System.in);
		System.out.print("Nhap so n : ");
		n = reader.nextInt();
		// tinh toan
		if (n > 0) {

			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					num = num + i;

				}
			}
			// System.out.println("Tong cac uoc so la : "+num);

			if (num == 2 * n) {
				// output
				System.out.println(+n + " is perfect number .");

			}
			if (num > 2 * n) {
				// output
				System.out.println(+n + " is abudant number .");
			}
			if (num < 2 * n) {
				// output
				System.out.println(+n + " is deficient number .");
			}

		} else
			System.out.print("INVALID INPUT ");

	}
}