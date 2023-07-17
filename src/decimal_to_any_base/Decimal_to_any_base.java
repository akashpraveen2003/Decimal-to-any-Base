package decimal_to_any_base;

import java.util.Scanner;

/*
 * Given a decimal number A and a base B, convert it into its equivalent number in base B.
 */

public class Decimal_to_any_base {
	
	private static void decimal_to_base(int n, int bit) {
		
		String s=Integer.toString(n,bit);			// convert the number into string with required base
		System.out.println(Integer.parseInt(s));	// convert back to decimal
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int bit=scanner.nextInt();
		decimal_to_base(n,bit);

	}

	

}
/*
	Input
	A = 4
	B = 3

	Output
	11
	
	Input
	A = 4
	B = 2

	Output
	100
*/