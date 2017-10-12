package corejava;

public class Swap1 {

	public static void swapValues(Value o1, Value o2){
		Value temp=new Value(o1.getNumber());		
		o1.setNumber(o2.getNumber());
		o2.setNumber(temp.getNumber());
	}
}
