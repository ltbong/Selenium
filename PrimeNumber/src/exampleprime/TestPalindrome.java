package exampleprime;

import java.util.Scanner;

public class TestPalindrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inp = new Scanner(System.in);
System.out.println("Enter String");
String input = inp.nextLine();
int length = input.length();
String reverse ="";
for (int i = length-1;i>=0;i--){
	reverse = reverse+input.charAt(i);
	
}
if(input.equals(reverse)){
	System.out.println("Palindrome");
}
else{
	System.out.println("not a palindrome");
}

	}
}
