package poly;

public class Vet {
public void giveShot(Animal a){
	a.makeNoise();
	System.out.println(a.eatFood("flesh"));
	System.out.println("Method oveloading "+a.eatFood(5));
}
}
