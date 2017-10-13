package corejava;
import java.util.Scanner;
public class SecondHeigest {
	public static void main(String[] args) {
		int size,num,max1,max2;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter size : ");
		size = sc.nextInt();
		System.out.print("\nEnter " + size + " numbers : ");
		num = sc.nextInt();
		max2=max1=num;
		for(int i=1;i<size;i++){
			num=sc.nextInt();
			if(num>max1){
				max2=max1;
				max1=num;
			}
			else if(num<max1 && (max1==max2 || num > max2)){
				max2=num;
			}						
		}
		//System.out.print("1st Max : " + max1);
		System.out.print("\n2nd Max : " + max2);		
		sc.close();
	}
}