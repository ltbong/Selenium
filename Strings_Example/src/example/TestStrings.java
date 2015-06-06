package example;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "java gg";
char[] ch ={'g','r','d'};
String s2 = new String(ch);
//length
System.out.println(s1.length());
System.out.println(s2.length());
//charAt
char c = s1.charAt(2);
System.out.println(c);
//String format
String cd = String.format("value %32.11f",32.5654);
System.out.println(cd);
//Substring.........start index starts with 0 and end index starts with 1
System.out.println(s1.substring(1));
System.out.println(s1.substring(1, 3));
//Contains
System.out.println("contains example" +s1.contains("gg"));
//Join
String joint = String.join("-", "Welcome","to","india");
System.out.println(joint);
//Equals
System.out.println(s1.equals(s2));
//is empty
System.out.println(s1.isEmpty());
//Concat
s1.concat("hello");
System.out.println(s1);
s1 = s1.concat(" home");
System.out.println(s1);
//char replace
String sf="javatpoint is a very good website";  
String replaceString=sf.replace('a','e');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString);
//charSequence replace
String sg="my name is khan my name is java";  
String replaceString1=sg.replace("is","was");//replaces all occurrences of "is" to "was"  
System.out.println(replaceString1);  
// trim: string with omitted leading and trailing spaces
String df = " Hello java  ";
System.out.println(df+"javapoint");
System.out.println(df.trim()+"javapoint");
//Split
String g1 = "Strike with bang";
String[] words = g1.split("\\s");//regular expression
for (String m:words){
	System.out.println(m);
}
	for(String m1:g1.split("\\s", 2)){
		System.out.println(m1);
	}
	
//indexof
	String sw1="this is index of example";  
	//passing substring  
	int index1=sw1.indexOf("dex o");//returns the index of is substring  
	int index2=sw1.indexOf("index");//returns the index of index substring  
	System.out.println(index1+"  "+index2);//2 8  
	  
	//passing substring with from index  
	int index3=sw1.indexOf("is",4);//returns the index of is substring after 4th index  
	System.out.println(index3);//5 i.e. the index of another is  
	  
	//passing char value  
	int index4=sw1.indexOf('x');//returns the index of s char value  
	System.out.println(index4);//3  
//To lower case
	String sf1="JAVATPOINT HELLO stRIng";  
	String s1lower=sf1.toLowerCase();  
	System.out.println(s1lower); 
//To upper case
	String sf2 ="john cenA";
	System.out.println(sf2.toUpperCase());
	}
}
