package exampleprime;

import java.util.Collections;
import java.util.HashSet;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hash = new HashSet();
hash.add(new Long("322655"));
hash.add(new Long("665999"));
hash.add(new Long("558787"));
long obj = Collections.min(hash);
System.out.println(obj);
	}

}
