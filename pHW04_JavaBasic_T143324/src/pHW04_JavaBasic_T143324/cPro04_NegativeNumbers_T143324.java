/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro04_NegativeNumbers_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, count = 0;
		// input
		System.out.print("Nhap n: ");
		n = in.nextInt();
		// xu ly thong tin
		if (n > 0) {
			int b[] = new int[n];
			for (int i = 0; i < n; i++) { // begin loop
				System.out.print("nhap so thu " + (i + 1) + " : ");
				b[i] = in.nextInt();
				if (b[i] < 0) {
					count += 1;
				}
			}// end loop
				// output
			System.out.print("NoNS = " + count);
		} else {
			System.out.println("INVALID INPUT");
		}

	}

}
