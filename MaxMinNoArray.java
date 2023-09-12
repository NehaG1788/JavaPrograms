package JavaPrograms;

public class MaxMinNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {18,34,5,6};
		
		
		//int max = a[0];
		int min = a[0];
		
		for(int i = 1; i<a.length;i++)
		{
			//if(a[i]>max)
			if(a[i]<min)
			{
				
				//max = a[i];
				
				min = a[i];
			}
			
		}
		
		//System.out.println("Max  of array :" + max);
		System.out.println("Max  of array :" + min);
	}

}
