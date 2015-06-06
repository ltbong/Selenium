package ArrayExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Lists {

	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //new Lists().go();
 Lists li = new Lists();
 li.go();
		
	}
public void go(){
	getSongs();
	System.out.println("Before Sorting : "+songList);
	Collections.sort(songList);
	
	System.out.println("After Sorting : "+songList);
}
void getSongs(){
	try{
		File file = new File("C:\\Users\\Raviteja\\Desktop\\SongList.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while((line=reader.readLine())!=null){
			addSong(line);
		}
		reader.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
}
void addSong(String lineToParse){
	String[] tokens = lineToParse.split("/");
	songList.add(tokens[0]);
}
}
