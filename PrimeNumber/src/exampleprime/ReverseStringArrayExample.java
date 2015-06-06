package exampleprime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArrayExample {

	public static void main(String[] args) {

String[] strDays = new String[]{"Wednesday","Friday","Saturday","Monday"};

List<String> lis = Arrays.asList(strDays);
Collections.reverse(lis);
strDays = (String[])lis.toArray();
for(int i=0;i<strDays.length;i++){
	System.out.println(strDays[i]);
}
	}

}
