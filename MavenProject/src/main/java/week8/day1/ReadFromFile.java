package week8.day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		String txt="./File/Files.txt";
		//File fs=new File(txt);
		//fs.createNewFile();
FileWriter fw=new FileWriter(txt);
BufferedWriter bw=new BufferedWriter(fw);
bw.write("Hello First line");
bw.newLine();
bw.write("Hello Second Line");
bw.close();
FileReader fr=new FileReader(txt);
BufferedReader br=new BufferedReader(fr);
String content="";
while ((content=br.readLine())!=null) {
	//String news=br.readLine();
	
	
	System.out.println(content);
}






br.close();
	}

}
