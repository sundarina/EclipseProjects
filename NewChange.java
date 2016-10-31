import java.io.*;
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
	
		public static void main(String[] args){
			 	/*String fileName = "/home/sundarina/M.txt";
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
		        
		    
			/* 5. Даны положительные числа A, B, C. На прямоугольнике размера A×B
			 * размещено максимально возможное количество квадратов со стороной C
			 * (без наложений). Найти количество квадратов, размещенных на
			 * прямоугольнике. Операции умножения и деления не использовать.
			 */
			
			Scanner scA = new Scanner(System.in);
			System.out.println("Ведите число A: ");
			double numA = scA.nextDouble();
			Scanner scB = new Scanner(System.in);
			System.out.println("Ведите число B: ");
			double numB = scB.nextDouble();
			Scanner scC = new Scanner(System.in);
			System.out.println("Ведите число C: ");
			double numC = scC.nextDouble();
			int totalRes = 0;
			int cRa = 0;
			int cRb = 0;
			int xA = -1;
			int xB = -1;
			do{
				xA += numC;
				cRa++;
				
			} while (xA < numA);
			do{
				xB +=numC;
				cRb++;
			}while(xB < numB);
			
			for(double t = cRb; t <= cRa; t++){
				totalRes += t;
			}
			System.out.println(totalRes); 
			
			
			
			
	}
}
		

	
	
