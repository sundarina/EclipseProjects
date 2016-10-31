import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class webReader {
	public List<String> emailSearch(String filePath) throws FileNotFoundException, IOException {
		 URL url = new URL(filePath);
	        URLConnection yc = url.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
        String line;
        List<String> result = new ArrayList<>();
        while((line = in.readLine()) != null){ 
        	Pattern p = Pattern.compile("\\w+[\\w.]*@[\\w.]+\\.\\w+");  
        	Matcher m = p.matcher(line);
        	while (m.find()) {
        		result.add(m.group());
        	/* #1	Set<String> hs = new HashSet<>();
        		hs.addAll(result);
        		result.clear();
        		result.addAll(hs);*/
        		
        	/*#2	for (int i = 1; i < result.size(); i++) {
                    String a1 = result.get(i);
                    String a2 = result.get(i-1);
                    if (a1.equals(a2)) {
                        result.remove(a1);
                    }
                }*/
        		
        	}
        }
        result = new ArrayList<String>(new HashSet<String>(result)); //или LinkedHashSet
        in.close();// return m.matches();
        return result;
	}
}
