package example;
public class TestSort {
static int fibonacci(int n){
	int p=0;
	int c= 1;
	int r=0;
	for(int i=0;i<n;i++)
	{
		 r=p+c;
		 p=c;
		 c=r;
	 }
	return r;
}
public static void main (String args[]){
	System.out.println(fibonacci(4));
	}
}