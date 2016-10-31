import java.io.*;
import java.util.*;
import java.nio.*;
import com.opencsv.CSVReader;


public class CSVFileParser {

	
//	/home/sundarina/birthday.csv
	
	
	
	public List<String[]> run(String filePath) throws FileNotFoundException, IOException {
		List <String[]> people = new ArrayList<String[]>();
		//String [] birthday = new String [0];
		BufferedReader br = new BufferedReader(new FileReader (filePath));
		String line = "";
		//br.readLine();
		int counter = 0;
		while((line = br.readLine()) != null && !line.isEmpty()) { 
			counter ++;
			if (counter == 1){
				continue;
			}
	    people.add(line.split(","));
			
			//String [] birthday = line.split(",");
	       	//for(String birthdays : birthday) {
	       	//	  System.out.println(birthdays);
	       	//}
			//people = new ArrayList<String>();
			//Collections.addAll(people, birthday);
	    } br.close();	
	    return people; 
	}
	
	
	public List<Title> userInfo(String filePath) throws FileNotFoundException, IOException {
		List<Title> userData = new ArrayList<Title>();
		BufferedReader br = new BufferedReader(new FileReader (filePath));
		String line = br.readLine();									//ignoring the first line
		while((line = br.readLine()) != null && !line.isEmpty()) { 
			 String[] fields = line.split(",");
	         Title tl = new Title(fields[0], fields[1], fields[2]);
	         userData.add(tl);
		} br.close();	
	    return userData;	
	}
	
	
	public void read(String filePath) throws FileNotFoundException, IOException {
	CSVReader csvReader = new CSVReader(new FileReader(filePath));
	String[] row = null;
		while((row = csvReader.readNext()) != null) {
			System.out.println(row[0]
					+ "  " + row[1]
							+ "   " + row[2]);
			}
	csvReader.close();
	}	
}

