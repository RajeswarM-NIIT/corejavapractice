package corejava;

import java.util.Scanner;

public class Amicable2 {

	public static void main(String[] args){
		int range,factsum1,factsum2,i,j;
		Scanner sc = new Scanner(System.in);
		range = sc.nextInt();
		factsum1=0;
		for(i=1;i<=range;i++){			
			for(int k=1;k<=(i+1)/2;k++){
				if(i%k==0){
					factsum1+=k;	
				}
			}			
			for(j=1;j<=range;j++){
				factsum2=0;
				for(int k=1;k<=(j+1)/2;k++){
					if(j%k==0){
						factsum2+=k;	
					}
					if(factsum2>i)
						break;
				}
				if(i==factsum2 && j==factsum1){
					System.out.print("    [ "+ i + ", " + j + " ]");
				}
			}			
		}
	}
}
