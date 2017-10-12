package corejava;

public class SwapMain1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(20);
		System.out.print("\nBefore swaping : ");
		System.out.print("\nv1 : " + v1.getNumber());
		System.out.print("\nv2 : " + v2.getNumber());
		Swap1.swapValues(v1, v2);
		System.out.print("\nAfter swaping : ");
		System.out.print("\nv1 : " + v1.getNumber());
		System.out.print("\nv2 : " + v2.getNumber());
		
		

	}

}
