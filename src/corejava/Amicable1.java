package corejava;

import java.util.Scanner;

public class Amicable1 {

	public static void main(String[] args){
		int num1,num2,factsum1,factsum2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		factsum1=factsum2=0;
		
		
		for(int i =1 ; i<=(num1+1)/2 ; i++){
			if(num1%i==0)
				factsum1+=i;
		}
		
		for(int i =1 ; i<=(num2+1)/2 ; i++){
			if(num2%i==0)
				factsum2+=i;
		}
		
		
		
		System.out.print("\nSum of factors for " + num1 + " : " + factsum1);
		System.out.print("\nSum of factors for " + num2 + " : " + factsum2);
		if(num1==factsum2 && num2==factsum1)
			System.out.print("\n"+ num1 + " and " + num2 + " are Amicables");
		else
			System.out.print("\n"+ num1 + " and " + num2 + " are not Amicables");
	} 
}
