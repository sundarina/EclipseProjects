import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FileApp {
		

	public static void main(String[] args) throws FileNotFoundException, IOException{
	 
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Введите адрес файла: ");
	//String path = sc.nextLine();
	//String path =  "/home/sundarina/MailArray.txt";
	String path =  "/home/sundarina/resume.txt";
	FileParser fp = new FileParser(path);
	fp.regexSearch();
	
	String p = "/home/sundarina/M.txt";
	FileParser fpS = new FileParser(p);
	List<String> ls = fpS.ipValidation();
	for(int i = 0; i < ls.size(); i++){
	//for (String s : ls){
	System.out.println(ls.get(i));
	}
	
	
	/*System.out.print("old text: ");
    Scanner sp = new Scanner(System.in);
    String p = sp.nextLine();

    System.out.print("new text: ");
    Scanner sd = new Scanner(System.in);
    String d = sd.nextLine();
	
	ChangeFile cf = new ChangeFile(path);
	
    
	if (fp.changeTextFileNew(p,d)){
		System.out.println("Life is good");
	} else {
		System.out.println("Bad, very bad...");
	}
	
	//sc.close();
	// 1
	int count = fp.mailCount();
	System.out.println(count);
//	// 2
	int c = fp.mailCountNew();
	System.out.println(c);
	*/
	}
}
