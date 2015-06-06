package example;

public class TestException {

	 public static void main(String args[]){  
		   /*try{  
		    int a[]=new int[5];  
		    a[7]=30/0;  
		   }  
		   catch(ArithmeticException e)
		   {
			   System.out.println("task1 is completed");
			   System.out.println(e);
		   }  
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("task 2 completed");
		   }  
		   catch(Exception e)
		   {
			   System.out.println("common task completed");
		   }  
		   System.out.println("rest of the code...");  
		 }  
		 
*/		
		 try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){System.out.println(e);}  
			  finally{System.out.println("finally block is always executed");}  
			  System.out.println("rest of the code...");  
		 }  
}