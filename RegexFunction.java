import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.BufferedReader;
import java.io.DataInput;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


public class RegexFunction {
	//1. Выполнить задачу по проверке сложности пароля с использованием регулярных выражений  !1Ff  
	//принять ввод с клавиатуры, передать в метод, вернуть тру, или фолсе, сложный/простой
	
	public boolean passwordValidation(String password){
		//Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,15})");  
		Pattern p = Pattern.compile("[0-9a-zA-Z!&@#$%^*./=+-_()]{6,15}");
    	Matcher m = p.matcher(password);   
    	return m.matches();
	}
	// 2. Выполнить поиск IP адресов (например 192.168.0.1) в строке, вернуть массив, 
	// оформит как функцию передать в метод путь к файлу, где хранятся айпи, 
	//выдернуть и вернуть в виде массива строк
	
	
	public List<String> ipValidation(String filePath) throws FileNotFoundException, IOException {
		File file = new File(filePath);
		BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        List<String> result = new ArrayList<String>();
        while((line = reader.readLine()) != null){ 
        	Pattern p = Pattern.compile("([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])");  
        	Matcher m = p.matcher(line);
        	while (m.find()) {
        		result.add(m.group());
        	}
        }
        reader.close();// return m.matches();
        return result;
	}
	/*3. Напишите программу, которая посчитает количество смайликов в заданном тексте.
	Смайликом будем считать последовательность символов, удовлетворяющую условиям:
	первым символом является либо ; (точка с запятой) либо : (двоеточие) ровно один раз
	далее может идти символ – (минус) сколько угодно раз (в том числе символ минус может идти ноль раз)
	в конце обязательно идет некоторое количество (не меньше одной) одинаковых скобок из следующего набора: (, ), [, ].
	внутри смайлика не может встречаться никаких других символов.*/
	public int smileCount(String fileURL) throws FileNotFoundException, IOException {
		File file = new File(fileURL);
		BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int groupC = 0;
		while((line = reader.readLine()) != null){
			Pattern p = Pattern.compile("((;|:){1}-*((\\(|\\)|\\[|\\])+))");
			Matcher m = p.matcher(line);
			while(m.find()){
				groupC = m.groupCount();
				System.out.println(m.group());
			}
		}
		reader.close();
		return groupC;
	}
	
	//4. Ссылки в MarkDown
	//Преобразовать MarkDown ссылки в HTML. Выглядят вот так: [text](http://example.com)
	//	[Basic link](http://example.com) => <a href="http://example.com">Basic link</a>
	// 
	public boolean changeMarkDown(String filePath) { 
        try {
            String tmpFile = filePath + "_tmp"; //создаем временный файл типа стринг
            FileWriter writer = new FileWriter(tmpFile); //обьект для записи в временный файл
            BufferedReader reader = new BufferedReader(new FileReader(filePath)); //считывание в буфер 
            String line;
            while((line = reader.readLine()) != null){ //считывание построчно
            	//Pattern p = Pattern.compile("(\\[.+\\])(\\(.+\\))");
    			//Matcher m = p.matcher(line);
    			//while(m.find()){
    				line = line.replaceAll("\\[(.+)\\]\\((.+)\\)", "<a href=\"$1\">$2</a>"); // экранирование кавычки \, $1
    			//}
            	writer.write(line + "\n"); //запись в временный файл
            }
            
            reader.close();//закрытие буфера
            writer.close();//закрытие веменного файла
            Files.move(Paths.get(tmpFile), Paths.get(filePath), REPLACE_EXISTING);//замена временного на нужный
            

        } catch (IOException ioex) {
                 ioex.printStackTrace();
                 return false;
        }   
    
        return true;
	}
}
