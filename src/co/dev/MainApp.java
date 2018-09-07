package co.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

	public static void main(String[] args) throws IOException  {		
			FileInputStream fis= new FileInputStream("in.txt");
			BufferedReader  br = new BufferedReader(new InputStreamReader(fis));
		    String line;
		   while((line=br.readLine())!=null) {
			   System.out.println(line);
		      }
		   br.close();
	   }
	}


