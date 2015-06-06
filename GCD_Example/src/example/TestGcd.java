package example;

import java.util.Scanner;

public class TestGcd {
public static int gcd(int x, int y){
	int r=0;
	int a;
	int b;
	 a =(x>y)? x :y;
	 b = (x<y)?x:y;
	r=b;
	while(a%b!=0){
		r=a%b;
		a=b;
		b=r;
	}
	return r;
}
public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter number 1 :");
	int i = inp.nextInt();
	Scanner inp1 = new Scanner(System.in);
	System.out.println("Enter number 2 :");
	int j = inp1.nextInt();
	System.out.println("Gcd of 1st number and 2nd number is : "+gcd(i,j));
}
}
