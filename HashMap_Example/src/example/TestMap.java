package example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Random order
//HashMap<Integer,String> hm = new HashMap<Integer,String>();
//Insertion order
//LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
//Ascending order
//TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
hm.put(50, "Roger");
hm.put(45, "Novak");
hm.put(34, "Rafa");
hm.put(34, "Rafa");
for(Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+""+m.getValue());
}
	}

}
