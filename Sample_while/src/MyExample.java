
public class MyExample {
	private Dog[] dog = new Dog[5];
	private int nextIndex = 0;
	
public void add(Dog d){
	if(nextIndex < dog.length){
		dog[nextIndex] = d;
		System.out.println("Dog added at "+nextIndex);
		nextIndex++;
		
	}
}
}
