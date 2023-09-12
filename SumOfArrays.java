package JavaPrograms;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,3,5,6};
		
		int sum = 0 ;
		
		
		for(int i = 0; i<a.length;i++)
		{
			
			sum = sum + a[i];
			
		}
		
		System.out.println("Sum of array :" + sum);
		
		
		
	}

}
