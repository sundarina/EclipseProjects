import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class RegexTest {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
	
	
	
		
		RegexFunction reFu = new RegexFunction();
		String s = "/home/sundarina/M.txt";
		List<String> ls = reFu.ipValidation(s);
		for(int i = 0; i < ls.size(); i++){
		//for (String s : ls){
		System.out.println(ls.get(i));
		}
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String line = sc.nextLine();
		
		boolean b = reFu.passwordValidation(line);
		if (b == true){
			System.out.println("The password is valid! Congratulation!");
		} else {	
    		 System.out.println("The password is incorrect! Please, try again!");
		}
		
		int count = reFu.smileCount(s);
		System.out.println(count);
		
	//	reFu.changeMarkDown(s);
		if (reFu.changeMarkDown(s)){
			System.out.println("Life is good");
		} else {
			System.out.println("Bad, very bad...");
		}
		
		
		webReader wr = new webReader();
		String s1 = "http://spalah.com/";
		List<String> lst = wr.emailSearch(s1);
		for(int i = 0; i < lst.size(); i++){
			System.out.println(lst.get(i));
		}
		
	}
}