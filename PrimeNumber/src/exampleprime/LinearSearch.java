package exampleprime;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input;
int c;
//int array[];
Scanner inp = new Scanner(System.in);
System.out.println("Enter number of elements");
input = inp.nextInt();
int[] array = new int[]{input-1};
//array = new int[input];
System.out.println("Enter"+input+"Elements");
for(c=0;c<input;c++){
	array[c] = inp.nextInt();
}
System.out.println("Enter value to find");
int search = inp.nextInt();

for(c=0;c<input;c++){
	if(array[c]==search){
		System.out.println("Element found at "+(c+1)+"position");
		break;
	}
}
	if(c==input){
		System.out.println("Element not found");
	}

	}

}
