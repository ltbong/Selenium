package comparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class JukeBox {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new JukeBox().go();
	}
	public void go(){
		getSongs();
		System.out.println("Before Sorting : "+songList.toString());
		Collections.sort(songList);
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println("After Sorting using hash: "+songSet.toString());
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
		Song songNext = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		songList.add(songNext);
		
	}
}
