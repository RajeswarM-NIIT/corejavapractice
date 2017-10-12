package corejava;

public class Swap {
	public static void swapNumbers(int num1, int num2){
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;	
		System.out.print("\nWithin swap() : ");
		System.out.print("\nFirst value :  " + num1);
		System.out.print("\nSecond value :  " + num2);		
	}
	
	public static void swapNumbers(Integer num1, Integer num2){
		Integer temp = new Integer(num1);
		//temp=num1;
		//num1=num2;
		//num2=temp;	
		Integer n1 = new Integer(num2);
		Integer n2 = new Integer(temp);
		System.out.print("\nWithin swap() 1: ");
		System.out.print("\nFirst value :  " + n1);
		System.out.print("\nSecond value :  " + n2);		
	}
}
