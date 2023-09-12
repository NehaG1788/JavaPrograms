package JavaPrograms;

import java.util.Arrays;

public class EqualsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,3,5,6};
		
		int a2[] = {1,3,5,6};
		
		boolean status = Arrays.equals(a1, a2);
		if(status == true)
			
		{
			
			System.out.println("equals of array");
			
		}
		else
		{
			
			System.out.println("Not equals of array");
			
		}
	}

}
