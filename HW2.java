import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	/*	char ch = 'a';
		ch++;
		System.out.println(ch);

		String s = "abc";
		s = s.replace('a', 'b');
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("abc");
		s1.replace(0, 1, "def");
		// с какого по какой, на что менять
		System.out.println(s1);
		
		char[] chs = {'a','b', 'c', 'e', 'z', 'k'};
		String str = new String(chs, 3, 2);
		System.out.println(str);
		
		
		String str2 = "2*12=";
		str2 = str2 + 24;
		System.out.println(str2);
		
		/*String s3 = "Hello my dear Misha";
	    s3 = s3.split(" ").length();
	 	System.out.println(s3);
	 	*/
	 	
	 /*	StringBuffer s5 = "hgfitlu";
	 	s5 = (new StringBuffer(s5.substring(0,5))).reverse() + s5.substring(6);
	 	System.out.println(s5);
	 	*/
	 	
		
	
	 	/*1. Дана строка. Если она начинается на 'abc', то заменить их на 'www', 
	 	иначе добавить в конец строки 'zzz'. */
		
		String r = "oooghkmmmmm";
			if (r.substring(0,3).equals("abc")) {
			r = r.replace((r.substring(0,3)),"www");
			System.out.println(r);	
			} else {
			 r += "zzz";
			 System.out.println(r);	
			}
		
		/* 2. Дана строка. Если ее длина больше 10, то оставить в строке только 
		 первые 6 символов, иначе дополнить строку символами 'o' до длины 12.*/
			
		r = "poiuk";
		if (r.length()> 10){
			System.out.println(r.substring(0,6));
		} else {
			do {
				r += 'o';
			} while(r.length() < 12);
		}
		System.out.println(r);	
		
		// 3. В данной строке найти количество цифр.
		
	
		String st = "fdh0djg37jh1cjh8hjgd1g";
		String numbers = "0123456789";
		int counter = 0;
		for (int i = 0; i < st.length(); i++){
			for (int j = 0; j < numbers.length(); j++){
				
				char c = st.charAt(i);
				char num = numbers.charAt(j);
				
				if(c == num) {
					counter++;
				}
			}
		}
	System.out.println(counter);
		
	
		
		//4. Замените в строке все вхождения 'word' на 'letter'.
	
	String h = "wordffdgdfjghdword";
	h = h.replaceAll("word","letter");
	System.out.println(h);

	
	// 5. Удалите в строке все буквы 'x', за которыми следует 'abc'.
	
	String str5 = "xabcfhdfjgfabcjhsbdxabcjffjxabc";
	str5 = str5.replace("xabc", "abc");
	System.out.println(str5);
	
	
	
		// 6. Найдите количество вхождения 'aba' в строку.
	
	String str6 = "xabafhdfjgfjhsbdxabcjffjxaba";
	int counter1 = 0;
	int t = 0; 
	
	
	while(true) {
		t = str6.indexOf("aba", t);
		if(t == -1) {
			break;
		} else {
			t += 1;
			counter1++;
		}
	}
		System.out.println(counter1);
		
	//	t = str6.indexOf("aba");
	//	do{
	//		counter1++;
	//		t = str6.indexOf("aba",t)+1;
	//	} while (t!= 0);
	
	
	//	7. Дана строка. Преобразовать все символы кроме первого в нижний 
	//	регистр
		
		String s32 = "AAjvhfIHH";
		s32 = s32.substring(0,1) + (s32.substring(1)).toLowerCase();
		System.out.println(s32);
	
//		8. Исключить из строки группы символов, расположенные между символами 
//		«/*», «*/» включая границы .
		
		String dd = "fdkjkdfg /*fewfewfwe*/  efwewfew /*fewfeffgfwfwe*/ sfddsfsdf";
		int z1 = 0;
		int z2 = 0;
		while(true) {
			z1 = dd.indexOf("/*");
			z2 = dd.indexOf("*/")+ 2;
			if(z1 == -1) {
				break;
			} else {
				String vv = dd.substring(z1,z2);
				dd = dd.replace(vv, "");
			}
		}
		System.out.println(dd);
		
		

		Scanner sc1 = new Scanner(System.in);
		String s1, s2;
		s1 = sc1.nextLine();//первая строка
		s2 = sc1.nextLine();//2я строка
		System.out.println(s1 + s2); //конкастенация строк ( не сумма )

		System.out.println(System.getProperty("java.runtime.version"));		

	}
}
