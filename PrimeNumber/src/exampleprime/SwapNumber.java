package exampleprime;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
Scanner inp = new Scanner(System.in);
System.out.println("Enter number 1");
int number1 = inp.nextInt();
Scanner inp1 = new Scanner(System.in);
System.out.println("Enter number 2");
int number2 = inp1.nextInt();
/*temp=number1;
number1=number2;
number2=temp;*/
number1=number1+number2;
number2=number1-number2;
number1=number1-number2;
System.out.println("After Swaping"+number1+number2);


	}

}
