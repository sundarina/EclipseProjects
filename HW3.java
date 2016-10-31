import java.util.*;
public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


	/*	1. Выведите  10 раз фразу "You are welcome!"
	  */
		
		//String s = "You are welcome!";
		int counter;
			for (counter = 0; counter <= 10; counter++) {    //счетчик
				String s = String.valueOf(counter);                // обьявила переменную в цикле, String переобразовали в in;
				System.out.println("You are welcome!");
		}
		
		
		
		/* 2. Найти сумму натуральных чисел от a до b, где a и b вводит 
		пользователь. В случае некорректных a и b (например, a>b) вывести 
		сообщение 'Сумма не существует'.*/ 
		
		// формула суммы натуральных чисел x = b*(a+b)/2
		
			/*Scanner sc = new Scanner(System.in); 
			System.out.print("Укажите натуральное число А");
			long a = sc.nextInt();
			System.out.print("Укажите натуральное число B");
			long b = sc.nextInt();
			long sum = 0;
			
			if (a < b && b%2 == 0)
			{
				sum = (b/ 2) * (a+b);
				System.out.println("Сумма натуральных чисел равна " + sum);
			}else if (a >= b)
			{
				System.out.println("Суммы не существует");
			}
			*/
				
			Scanner sc = new Scanner(System.in); 
			System.out.print("Укажите натуральное число А");
			long a = sc.nextLong();
			System.out.print("Укажите натуральное число B");
			long b = sc.nextLong();
			long sum = 0;
			if (a > b){
				System.out.println("Суммы не существует");
			} else {
				for (long i = a; i <= b; i++){
					sum+=i;
				}
				System.out.println("Сумма натуральных чисел равна " + sum);
			
			}
			
		// 3. Вывести все числа, меньшие 100, которые не делятся на 5. 
					for (int i = 0; i < 100; i++) {
						 if (i%5 != 0) {
						System.out.println(i + " ");
						}
					}
		
		/*4. Вывести на экран все шестизначные счастливые билеты. Билет называется 
					счастливым, если сумма первых трех цифр в номере билета равна сумме 
					последних трех цифр. Найдите количество счастливых билетов и  процент от 
					общего числа билетов.*/
					
				int luckyCounter = 0;
				int sum1 = 0;
				for (int i = 0; i <= 999; i++) {
						int num1 = i/100;
						int num2 = (i%100)/10;
						int num3 = i%10;
						sum1 = num1+num2+num3; //сумма sum1
						
						int sum2 = 0;
						
						for (int j = 0; j <= 999; j++) {
							
							int num1_1 = j/100;
							int num1_2 = (j%100)/10;
							int num1_3 = j%10;
							sum2 = num1_1+num1_2+num1_3;
							
							if (sum1 == sum2){
								//System.out.print(i);
								//System.out.print(" ");
								//System.out.println(j);
								luckyCounter++;
							}	
						}	
						
					}
						
				System.out.println(luckyCounter);
				double allTickets = 999999.0;
				double percentageLucky = (luckyCounter*100)/allTickets;
				System.out.println(percentageLucky); 
				
		
			/*5. Пользователь вводит свой возраст. Если он больше 80 лет, то вывести 
		'Здравствуйте, уважаемый', иначе 'Успехов!'. Сделать при помощи формы.*/
		
		Scanner e = new Scanner(System.in); 
		System.out.print("Пожалуйста, введите свой возраст");
		int a1 = e.nextInt();
		if (a1 > 80){
			System.out.println("Здравствуйте, уважаемый");
		}else if(a1<=80){
			System.out.println("Успехов");
		}
			
		/*6. Вывести все числа, меньшие 100, которые делятся на 3 и на 5 без 
		остачи.
		*/

		for (int j = 0; j < 100; j++) {
			 if (j%5 == 0 & j%3 == 0) {
			System.out.print(j + " ");
			}
		}
		
		// 7. Вывести на экран все возможные варианты системы координат, где x от 0 до 56, а у от 0 до 28. 
		
		for (int x = 0; x <= 56; x++)  {
			for (int y = 0; y <= 28; y++) {
				System.out.print("(");
				System.out.print(x + "," + y);
				System.out.println(")");
				
			}
		}
	}
}
