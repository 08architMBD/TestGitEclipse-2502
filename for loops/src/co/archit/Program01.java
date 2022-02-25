package co.archit;

import java.util.Scanner;

public class Program01 {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.print("Enter a number");
		num=sc.nextInt();
		
		boolean isprime=true;
		
		for(int i=2,limit=num/2;i<=limit;i++) {
			if(num%i==0) {
			isprime=false;
			break;
			}
	}
		
	
		if(isprime) {
			System.out.println(num +"num is prime number :");
		}
		else {
		System.out.println(num +"num is not a prime :");
		}
		sc.close();

}
}
