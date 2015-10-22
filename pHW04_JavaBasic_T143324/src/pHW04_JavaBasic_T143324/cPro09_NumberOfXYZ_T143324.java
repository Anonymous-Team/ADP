/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro09_NumberOfXYZ_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int count = 0;
		String b = new String();
		// input
		System.out.println("nhap chuoi ky tu: ");
		b = reader.nextLine();
		// begin loop
		for (int i = 0; i < b.length(); i++) {
			if ((b.charAt(i) == 'x') | (b.charAt(i) == 'y')
					| (b.charAt(i) == 'z') | (b.charAt(i) == 'X')
					| (b.charAt(i) == 'Y') | (b.charAt(i) == 'Z')) {
				count += 1;
			}
		}// end loop
		System.out.print("ket qua:" + count);// output

	}

}
