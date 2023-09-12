package JavaPrograms;

public class Swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping of a " +a);
		
		System.out.println("Before Swapping of b " +b);
		
		//Logic 1
		
		/*
		 * int c;
		 * 
		 * c = a; a = b; b= c;
		 * 
		 * System.out.println("After Swapping of a " +a);
		 * 
		 * System.out.println("After Swapping of b " +b);
		 */
		
		/*
		 * //Logic 2
		 * 
		 * a = a+b; b = a-b; a = a-b;
		 */
		
		/*
		 * //Logic 3 a = a*b; b = a/b; a = a/b;
		 */
		
		//Logic 4 
		b = a+b - (a=b);
		
		System.out.println("After Swapping of a " +a);
		
		System.out.println("After Swapping of b " +b);
		
	}

}
