package examplemap;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> scores = new HashMap<String, Integer>();
		scores.put("Ravi", 90);
		scores.put("teja",85);
		System.out.println(scores);
		System.out.println(scores.get("Ravi"));

	}

}
