package exampleprime;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number= 426;
int reverse = 0;
int temp=0;
while(number >0){
	temp = number%10;
	reverse = reverse*10+temp;
	number=number/10;
}
System.out.println("Reversed number "+reverse);
	}

}
