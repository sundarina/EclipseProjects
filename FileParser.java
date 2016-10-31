import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.*;

public class FileParser {
	private String filePath;
	public FileParser(String path){
		this.filePath = path; //this явно
	}
	public int mailCount(){
		try(FileInputStream fin = new FileInputStream(this.filePath)) {
	         //  System.out.println("Размер файла: " + fin.available() + " байт(а)");
	        byte[] buffer = new byte[fin.available()];
	        // считаем файл в буфер
	         fin.read(buffer, 0, fin.available());
	         String fileContent =  new String(buffer);
	         
	         int position = -1; //will start at zero position, with position + 1
	         int count = 0;
	         
	         do {
	        	 position = fileContent.indexOf("@gmail", position + 1);
	        	 if(position >= 0) {
	        		 count++; //каждая иттерация цикла наращивает счетчик
	        	 }
	         } while(position != -1); 
	         
	         return count;
	        } catch(IOException ex){
	             return -1;
	        //   System.out.println(ex.getMessage());
	    }
	}
		//return -1; метод должен всегда возвращать значение (временно для проверки компиляции)
		
	public int mailCountNew(){
		try {
			File file = new File(this.filePath);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = null; //изнач значение
            int count = 0;
            do {
            	line = reader.readLine();
            	if (line != null){
	            	int position = -1; 
	    	       
			         do {
			        	 position = line.indexOf("@gmail", position + 1);
			        	 if(position >= 0) {
			        		 count++; 
			        	 }
			         } while(position != -1);
			         
		         
	            	
		        // считываем остальные строки в цикле
            	}      
            } while (line != null); //пока не будет конец строки
            reader.close();
            return count;
         
        } catch (FileNotFoundException e) {
          //  e.printStackTrace(); 
        	return -1;
        } catch (IOException e) {
          //  e.printStackTrace();
        	return -1;
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	return -1;
        }
	
		//return -1;
		
		
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

            String replacedtext = oldtext.replaceAll(p, "" + d);

            FileWriter writer = new FileWriter(this.filePath);
            writer.write(replacedtext);
            writer.close();

        } catch (IOException ioex) {
                 ioex.printStackTrace();
                 return false;
        }   
    
        return true;
	}
	public boolean changeTextFileNew(String p, String d) { //передем части на замену в метод
        try {
            String tmpFile = this.filePath + "_tmp"; //создаем временный файл типа стринг
            FileWriter writer = new FileWriter(tmpFile); //обьект для записи в временный файл
            BufferedReader reader = new BufferedReader(new FileReader(this.filePath)); //считывание в буфер 
            String line;//, oldtext = "";
            while((line = reader.readLine()) != null){ //считывание построчно
                //oldtext += line + "\r\n";
            	line = line.replaceAll(p, d) + "\r\n"; //замена
            	writer.write(line); //запись в временный файл
            }
            
            reader.close();//закрытие буфера

            //String replacedtext  = oldtext.replaceAll(p, "" + d);

            
            //writer.write(replacedtext);
            
            writer.close();//закрытие веменного файла
            Files.move(Paths.get(tmpFile), Paths.get(this.filePath), REPLACE_EXISTING);//замена временного на нужный
            

        } catch (IOException ioex) {
                 ioex.printStackTrace();
                 return false;
        }   
    
        return true;
	}


	public void regexSearch() throws FileNotFoundException, IOException {
		File file = new File(this.filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line = reader.readLine()) != null){ 
        	Pattern p = Pattern.compile("[a-z]{2,10}@[a-z.]{2,10}");  
        	Matcher m = p.matcher(line);   
        	if (m.find()) {
        		System.out.println(m.group());
        	}
        }
        reader.close();// return m.matches();
	}
	
	
	public List<String> ipValidation() throws FileNotFoundException, IOException {
		File file = new File(this.filePath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        List<String> result = new ArrayList<String>();
        
        while((line = reader.readLine()) != null){ 
        	Pattern p = Pattern.compile("((([0-9]{1,2})|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-9]{1,2})|(1[0-9]{2})|(2[0-4][0-9])|(25[0-5]))");  
        	Matcher m = p.matcher(line);
        	while (m.find()) {
        		result.add(m.group());
        	}
        }
        reader.close();// return m.matches();
        
        return result;
	}
	
}
	/*import java.io.*;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.DataInput;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.Scanner;

	public class NewChange {
	 * 
	 * String fileName = "/home/sundarina/M.txt";
String search = "@gmail.com";
String replace = "@ukr.net";
Charset charset = StandardCharsets.UTF_8; //кодировка константа
Path path = Paths.get(fileName); //превращает ссылку в обьект класса Path 

try {
    Files.write(path,
        new String(Files.readAllBytes(path), charset).replace(search, replace)
            .getBytes(charset)); 
    // метод write класса Files (куда записывать (обьект Class Charset),
    // что записывать ( масив байтов ( new String (считыват все байты с файла обьекта Path c кодировкой и записывает в масив). замена строки на нужную(replace(search, replace).
    // в конце: переобразование  строки в масив байтов в правильной кодировке getBytes(charset)
    //cчитывает весь файл в память с 7 java 
} catch (IOException ioe) {
		ioe.printStackTrace(); 
	}*/

  
