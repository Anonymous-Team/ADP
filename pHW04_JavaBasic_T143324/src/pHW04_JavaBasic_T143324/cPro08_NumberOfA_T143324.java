/**
 * 
 */
package pHW04_JavaBasic_T143324;

import java.util.Scanner;

/**
 * @author Lam Nguyen (T143324)
 *
 */
public class cPro08_NumberOfA_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int count = 0;
		String a = new String();
		// input
		System.out.println("nhap chuoi ky tu: ");
		a = reader.nextLine();
		// begin loop
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'A') {
				count += 1;
			}
		}// end loop
		System.out.print("ky tu \"A\" xuat hien " + count + " lan.");// output

	}

}
