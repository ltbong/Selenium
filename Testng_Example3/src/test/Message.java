package test;

public class Message {
	 private String message;

	   //Constructor
	   //@param message to be printed
	   public Message(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
}
