package JavaPrograms;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = scn.nextInt();
		
		int org_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse number :" + rev);
		
		if(org_num == rev)
		{
			
			System.out.println("its palindrome");
		}
		else
		{
			
			System.out.println("its not palindrome");
			
		}
	}

}
