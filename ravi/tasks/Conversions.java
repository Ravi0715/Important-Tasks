package ravi.tasks;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int n=in.nextInt();
		Integer obj=new Integer(n);
		System.out.println("Decimal to binary:"+obj.toBinaryString(n));
		System.out.println("Decimal to octal:"+obj.toOctalString(n));
		System.out.println("Decimal to Hexa Decimal:"+obj.toHexString(n));

	}

}
