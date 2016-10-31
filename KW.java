
import java.util.Scanner;
import java.util.Arrays;

public class KW {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1. Есть две переменные $n и $x, найти их разницу (-) и деление (/), выведите на экран.
		
		int n = 6;
		int x = 2;
		int dif = n - x;
		int div = n/x;
		System.out.println (dif + "," + div);
		//System.out.println((n - x) + "," + (n/x));
		
// 2. Найти решение выражения (2*a)^4 + (a/7) - 13 + sin(y) * sqrt(a^2+y^2)
		
		double a = 1.0;
		double y = 2.0;
		double result = Math.pow((2*a), 4) + (a/7) - 13 + (Math.sin(y) * Math.sqrt(Math.pow(a, 2) + Math.pow(y , 2)));
		System.out.println(result);
	
		
// 3. Есть два массива $arr1 и $arr2, создать третий массив $arr3 который будет содержать элементы массивов $arr1 и $arr2
		
	//	public static <T> T[] addAll(T[] array1, T... array2)
		int[]array1 = {2, 4, 6, 8, 9};
		int[]array2 = {55, 77, 66};
		int[]array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[i + array1.length] = array2[i];
		}
		//array3 = Arrays.copyOf(array1, array1.length);
		//array3 = Arrays.copyOf(array2, array2.length);
		//System.arraycopy(array2, 0, array3, 3, 3);
		
		for (int i = 0; i < array3.length; i++){ 
		System.out.println(array3[i]);
		}
		
		
		//int[] array3 = ArrayUtils.addAll(array1, array2);
				//+ (arr2, 0, arr3, 0, arr2.lenght));
		
// 4. Пользователь вводит пароль. Определите уровень сложности пароля. (в  пароле есть цифры, буквы нижнего и верхнего регистра, спецсимволы)
		
		while(true){
			boolean hasNumbers = false;
			boolean hasLowerCase = false;
			boolean hasUpperCase = false;
			boolean hasSymbols = false;
			String numbers = "0123456789";
			String symbols = "!@#$%^&*()_+=-;':<>?/.,\\";
			Scanner sc = new Scanner(System.in); 
			System.out.println("Please, enter your's password");
			String password = sc.nextLine();
			hasUpperCase = !password.toLowerCase().equals(password);
			hasLowerCase = !password.toUpperCase().equals(password);
			for (int i = 0; i < password.length(); i++){
				for ( int j = 0; j < numbers.length(); j++){
					if (password.charAt(i) == numbers.charAt(j)){
						hasNumbers = true;
					}
				}
				for ( int j = 0; j < symbols.length(); j++){
					if (password.charAt(i) == symbols.charAt(j)){
						hasSymbols = true;
					}
				}
			}
			if (hasLowerCase && hasNumbers && hasSymbols && hasUpperCase){
				System.out.println("Your's password is good!");
				break;
			} else {
				System.out.println("Your's password is bad, please, write another one.");
			}
		}
			
		
// 5. Дан массив размера n. После каждого отрицательного элемента массива вставить элемент (3 шт) с нулевым значением.

		int[]arr = { 3, -1, -8, 5};
		int counter = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < 0){
			counter++;
			} 
			//arr[i] = Arrays.binarySearch(arr, i);
		//	for (int i = 0; i < arr.length; i++)
			//System.out.println(arr[1]);  
		} 
		 int z = 3; 
		 int[]arr1 = new int [arr.length + counter*z];
		 for (int i = 0 , j = 0; i < arr.length; i++, j++){
			 arr1[j] = arr[i];
			 if (arr[i] < 0){
				for ( int l = 0; l < z; l++) {
					j++;
					arr1[j] = 0;
				}
				 
				// System.arraycopy(arr, 0, arr1, i, arr1.length);
			 }
		 }
		 for (int i = 0; i < arr1.length; i++){	 
			 System.out.print(arr1[i] + " ");
		 } 
		
// 6. В строке записаны слова (разделены пробелом), найти каждое слово которое начинается на "aba" и записать в строку 2, 
// а также найти слова  которые содержат "abc", и записать их в строку 3.*/

		String s = "aback dog abcd fish ababcate abavvv sfsdfsabcewrewr";
		String [] words = s.split(" ");
		System.out.println(words.length);
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < words.length; i++){
			if (words[i].substring(0, 3).equals("aba")){
				s1 += words[i] + " ";
			}
			if (words[i].indexOf("abc") != -1){
				s2 += words[i] + " ";
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
