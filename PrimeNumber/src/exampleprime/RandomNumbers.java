package exampleprime;

public class RandomNumbers {

	public static void main(String[] args) {
	
		int i;// TODO Auto-generated method stub
for(i=0;i<8;i++){
	System.out.println("Random numbers ["+(i+1)+"] :"+Math.random());
}
for (i=0;i<5;i++){
	System.out.println("Random numbers ["+(i+1)+"] :"+ (int)(Math.random()*100));
}
}
}
