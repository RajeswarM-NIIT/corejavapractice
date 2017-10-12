package corejava;

public class SwapMain {

	public static void main(String[] args) {
		
		int a,b;
		a=10;
		b=20;
		System.out.print("\nBefore swaping : ");
		System.out.print("\na : " + a);
		System.out.print("\nb : " + b);
		
		Swap.swapNumbers(a, b);
		
		System.out.print("\nAfter swaping : ");
		System.out.print("\na : " + a);
		System.out.print("\nb : " + b);		
		
		Integer n1 = new Integer(a);
		Integer n2 = new Integer(b);
		
		Swap.swapNumbers(n1,n2);
		System.out.print("\nAfter swaping 1 : ");
		System.out.print("\na : " + n1);
		System.out.print("\nb : " + n2);		
		
	}

}
