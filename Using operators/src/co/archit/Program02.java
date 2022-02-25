package co.archit;

public class Program02 {
	public static void main(String[] args) {
		int n1 , n2 , sum ;
		n1=10;
		n2=-5;
		
		int x=-n2;
		System.out.println("x="+ x);
		
		sum=n1-n2;
		System.out.println("sum =" +sum);
		
		sum=n1*n2;
		System.out.println("sum =" +sum);
		
		sum=n1/n2;
		System.out.println("sum =" +sum);
		
		sum=n1%n2;
		System.out.println("sum =" +sum);
		
		n1 +=10;
		System.out.println("n1="+n1);
		
		System.out.println(n1>9?"do it":"stop");
		
		n1=10;
		System.out.println(n1>5?"greater than 5":"Lesser than 5");
		
		n2=n1>5?100:1000;
		System.out.println("n1<n2 is " +(n1<n2));
		
	}

}
