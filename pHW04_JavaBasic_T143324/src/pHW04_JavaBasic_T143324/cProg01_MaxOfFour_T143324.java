/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cProg01_MaxOfFour_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao cac bien

		double a, b, c, d, u, v;
		Scanner reader = new Scanner(System.in);
		System.out.print("Nhập số a : ");
		a = reader.nextDouble();
		System.out.print("Nhập số b : ");
		b = reader.nextDouble();
		System.out.print("Nhập số c : ");
		c = reader.nextDouble();
		System.out.print("Nhập số d : ");
		d = reader.nextDouble();
		// calculate
		if (a > b) {
			u = a;

		} else
			u = b;
		if (c > d) {
			v = c;
		} else
			v = d;
		//
		if (u > v) {
			// output
			System.out.println("Max = " + u);
		} else
			// output
			System.out.println("Max = " + v);

	}

}
