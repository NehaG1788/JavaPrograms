package JavaPrograms;

public class EvenandOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,3,5,6};
		
		int even_count=0;
		int odd_count = 0;
		
		
		for(int i = 0; i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				
				even_count++;
				
			}
			else 
			{
				odd_count++;
				
				
			}
		}
		
		System.out.println("even of array :" + even_count);
		
		System.out.println("odd of array :" + odd_count);
		
	}

}
