import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.util.Scanner;

	public class ChangeFile {
		private String filePath;
		public ChangeFile(String path){
			this.filePath = path; //this явно
		}
		
		public boolean changeTextFile(String p, String d) {
	        try {
	            File file = new File(this.filePath);
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            String line = "", oldtext = "";
	            while((line = reader.readLine()) != null)
	            {
	                oldtext += line + "\r\n";
	            }
	            reader.close();
	
	            String replacedtext  = oldtext.replaceAll(p, "" + d);
	
	            FileWriter writer = new FileWriter(this.filePath);
	            writer.write(replacedtext);
	            writer.close();
	
	        } catch (IOException ioex) {
	                 ioex.printStackTrace();
	                 return false;
	        }   
	    
	        return true;
		}
}

