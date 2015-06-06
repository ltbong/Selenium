package examplegen;

import java.awt.List;
import java.util.ArrayList;

public class TestGenerics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestGenerics1 ts = new TestGenerics1();
      ts.go();
	}
	/*public void go(){
		Animal[] animals = {new Dog(),new Cat(),new Dog()};
		Dog[] dogs = {new Dog(),new Dog(),new Dog()};
		takeanimals(animals);
		takeanimals(dogs);
	}*/
	
/*public void takeanimals(Animal[] animals){
	for(Animal a:animals){
		a.eat();
		
	}*/
	public void go(){
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		takeanimals(animals);
}
	public void takeanimals(ArrayList<Animal> animals){
		for(Animal a:animals){
			a.eat();
}
	}
}
