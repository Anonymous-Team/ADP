/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro03_Loop_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao vung nho ,khai bao bien
		Scanner in2 = new Scanner(System.in);
		int n;
		double a, b, x;
		System.out.print("nhap n: ");
		n = in2.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				// input
				System.out.print("nhap he so a:");
				a = in2.nextDouble();
				System.out.print("nhap he so b:");
				b = in2.nextDouble();
				// calculate
				if ((a - 2) == 0) {

					if ((b + 3) == 0) {
						// output
						System.out.println("VSN");
					} else {
						System.out.println("VN");
					}
				} else {
					x = (-(b + 3)) / (a - 2);
					// output
					System.out.println("pt co nghiem duy nhat la: " + x);
				}
			}
		} else
			System.out.print("Invalid Input");
	}

}
