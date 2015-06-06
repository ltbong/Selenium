package exampleprime;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int array[];
		int c;
		int first;
		int last;
		int middle;
		int search;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number of elements");
		input = inp.nextInt();
		array = new int[input];
        System.out.println("Enter "+input+"elements");
        for(c=0;c<input;c++){
        array[c] = inp.nextInt();
        }
        System.out.println("Enter value to find");
        search = inp.nextInt();
        first=0;
        last=input-1;
        middle=(first+last)/2;       
        while( first <= last )
        {
          if (array[middle] < search)
            first = middle + 1;    
          else if (array[middle] == search) 
          {
            System.out.println(search + " found at location " + (middle + 1) + ".");
            break;
          }
          else
             last = middle - 1;
             middle = (first + last)/2;
       }
       if ( first > last )
          System.out.println(search + " is not present in the list.\n");     
	}
}
