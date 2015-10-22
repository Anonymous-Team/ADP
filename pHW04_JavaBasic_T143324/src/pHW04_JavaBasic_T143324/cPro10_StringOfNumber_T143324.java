/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro10_StringOfNumber_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int count = 0;
		boolean t = false;
		String b = new String();
		// input
		System.out.println("nhap chuoi ky tu: ");
		b = reader.nextLine();
		b = b.trim();// chuan hoa chuoi(xoa ky tu trang)
		// xu ly thong tin
		if (count == 0) {
			// begin loop
			for (int i = 0; i < b.length(); i++) {

				if ((b.charAt(i) != '0') && (b.charAt(i) != '1')
						&& (b.charAt(i) != '2') && (b.charAt(i) != '3')
						&& (b.charAt(i) != '4') && (b.charAt(i) != '5')
						&& (b.charAt(i) != '6') && (b.charAt(i) != '7')
						&& (b.charAt(i) != '8') && (b.charAt(i) != '9')) {
					count = 1;
				}
			}// end loop
		}
		// output
		if (count != 0) {
			System.out.print("NO");
		} else {
			System.out.print("YES");
		}
	}

}
