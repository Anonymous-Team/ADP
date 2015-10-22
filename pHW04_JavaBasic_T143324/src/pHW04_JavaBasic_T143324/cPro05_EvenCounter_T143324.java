/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro05_EvenCounter_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao vung nho va mang
		Scanner in = new Scanner(System.in);
		int c[] = new int[1000];
		// khai bao bien
		int i = 0;
		int khoa = 1, count2 = 0, count3 = 0, count1 = 0;
		System.out.println("nhap so khong am: ");
		// calculate
		while (khoa != 0) {

			c[i] = in.nextInt();
			if (c[i] < 0) {
				khoa = 0;
				count1 = i;
			}
			i += 1;
		}

		for (int j = 0; j < count1; j++) {
			if (c[j] % 2 == 0) {
				count2 += 1;
			} else {
				count3 += 1;
			}
		}
		// output
		System.out.println("Total Number = " + count1);
		System.out.println("Even Numbers = " + count2);
		System.out.println("Odd Numbers = " + count3);
	}

}
