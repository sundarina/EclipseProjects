import java.util.*;
import java.io.PrintStream;
public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	//	1. Написать программу, которая находит среднее арифметическое значение 
	// 		 трёх вещественных чисел.
	 	Scanner sc = new Scanner(System.in);
		System.out.print("Укажите несколько чисел через пробел:");
		String str = sc.nextLine();
		String[]array = str.split(" ");
		int[]num = new int[array.length];
			for (int i = 0; i < array.length; i++){
				num[i] = Integer.parseInt(array[i]);
			}
			int sum = 0;
				for (int i = 0; i < num.length; i++){
					sum +=num[i];
				}
		System.out.println("Среднее арифметическое: " + sum/num.length);
		
		// 2. Написать программу, которая находит корень линейного уравнения ax + b = 0.
		
		Scanner numer = new Scanner(System.in); 
		System.out.print("Укажите  число А");
		double a = numer.nextDouble();
		System.out.print("Укажите число B");
		double b = numer.nextDouble();
		double x = -b/a;
		System.out.println((x));
		
		// 3. Пользователь вводит число и степень. 
		// Программа вычисляет указанную степень этого числа.
		
		Scanner scaner = new Scanner(System.in); 
		System.out.print("Укажите  число А: ");
		double j = scaner.nextDouble();
		System.out.print("Укажите cтепень числа А: ");
		double y = scaner.nextDouble();
		double result = Math.pow(j, y);
		System.out.println((result));
		
		
		
		// 4. Написать программу, которая  предлагает пользователю ввести радиус окружности,
		// а затем считает площадь и длину этой окружности. Число Pi задать в программе как вещественную константу.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Укажите радиус круга: ");
		double radius = scan.nextDouble();
		double lng = 2*radius*Math.PI; // длинна окружности
		double s = Math.PI * Math.pow(radius, 2.0); // площадь круга
		System.out.printf("Длинна окружности: %.2f\n" ,lng);
		System.out.printf("Площадь круга: %.2f\n" , s);
		
		// 5. Написать программу, которая  предоставляет пользователю возможность 
		// ввести с клавиатуры количество гривен, и переводит его в доллары, евро и рубли.
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Введите гривны: ");
		double value = s1.nextDouble();
		double usd = value*26.67;
		double eur = value*29.68;
		double rus = value*0.339;
		System.out.printf("USD: %.2f\n", usd); 
		System.out.printf("EUR: %.2f\n", eur); 
		System.out.printf("RUS: %.2f\n", rus); 
		
//6. Написать программу, которая переводит километры в сухопутные и морские мили. 
 
		Scanner s2 = new Scanner(System.in);
		System.out.println("Введите километры:");
		double km = s2.nextDouble();
		System.out.println("Морская миля:" + km*1.852 + ". Сухопутная миля: " + km*1.609 + ".");
		
//7. Написать программу, которая находит процент P от суммы S. 
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Укажите несколько чисел через пробел:");
		String str1 = sc1.nextLine();
		System.out.println( "Укажите процент от суммы");
		double p = sc1.nextDouble();
		String[]array1 = str1.split(" ");
		int[]num1 = new int[array1.length];
			for (int i = 0; i < array1.length; i++){
				num1[i] = Integer.parseInt(array1[i]);
			}
			int sum1 = 0;
				for (int i = 0; i < num1.length; i++){
					sum1 +=num1[i]; 
					p = p*sum1/100;
				}		
		System.out.println(p);
		
		
//8. Написать программу для определения диаметра окружности, которую можно получить из отрезка проволоки длиной Х (X задает пользователь с клавиатуры).
		
	Scanner scanner1 = new Scanner(System.in);
	System.out.println("Укажите длинну проволоки: ");
	double lon = scanner1.nextDouble();
	double diametr = lon/Math.PI;
	System.out.printf("%.3f\n", diametr);
	
//9. Написать программу, которая переводит указанное количество градусов по Цельсию в градусы по шкале Фаренгейта, Кельвина, Реомюра и Делиля. 
//   Затем реализовать перевод из градусов по Фаренгейту в градусы по Цельсию.
		
	Scanner vvod = new Scanner(System.in);
	System.out.println("Укажите градусы в Цельсиях: ");
	double userVvod = vvod.nextDouble();
	System.out.println("Keivin: " + (userVvod + 273) + ", Fahrenheit: " + (userVvod*1.8 + 32) + ", Reaumur: " + (userVvod*1.25) + ", Delisle: " + (userVvod*2/3));
	System.out.println("Fahrenheit: " + (userVvod*1.8 + 32) + ", Celsius: " + ((userVvod*1.8 + 32) - 32)/1.8);

	
//10. Поменять местами значения переменных a и b, сначала с использованием дополнительной третьей переменной, а затем – без.
	
	
	int ar = 4;
	int br = 5;
	int newA = br;
	br = ar;
	ar = newA;
	System.out.println("new a = " + ar + " new b = " + br);
	
	int aa = 51;
	int bb = 45;
	aa = aa+bb;
	bb = aa-bb;
	aa = aa-bb;
	System.out.println("new aa = " + aa + " new bb = " + bb);
	
		
		//  11. Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры (например, ввести 357  и 702 – получить и вывести числа  307 и 752).
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Укажите первое трехзначное число: ");
		int first = sca.nextInt();
		System.out.println("Укажите второе трехзначное число: ");
		int second = sca.nextInt();
		
		int nnum1 = first/100;
		int nnum2 = (first%100)/10;
		int nnum3 = first%10;
		
		int sNum1 = second/100;
		int sNum2 = (second%100)/10;
		int sNum3 = second%10;
		
		System.out.println("" + nnum1 + sNum2 + nnum3 + " " + sNum1 + nnum2 + sNum3);
		//+ " " + sNum1 + num2 + sNum3);
		 
		
		// 12. Ввести 4-значное число и подсчитать сумму первой и третьей цифры и разность второй и четвертой цифры.
		
		Scanner sC = new Scanner(System.in);
		System.out.println("Укажите 4-значное число: ");
		int numb = sC.nextInt();
		
		int n1 = numb/1000;
		int n2 = (numb%1000)/100;
		int n3 = (numb%100)/10;
		int n4 = numb%10;
		System.out.println(numb);
		System.out.println("Сумма первой и третьей цифры: " + (n1 + n3));
		System.out.println("Разность второй и четвертой: " + (n2 - n4));
		sc.close();
		
		
		//13. Ввести с клавиатуры 3-значное число и удалить из него среднюю цифру (например, ввести 3, 5, 7 – получить и вывести число 37).
		
		Scanner scN = new Scanner(System.in);
		System.out.println("Укажите 3-значное число: ");
		int nu = scN.nextInt();
		int nu1 = nu/100;
		int nu2 = (nu%100)/10;
		int nu3 = nu%10;
		System.out.println("Result: " + nu1 + nu3);
		
		
		
		//14. Написать программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, 
		//а также процент годовых, которые выплачивает банк. 
		//Определить сумму денег, выплачиваемых банком вкладчику каждый месяц.
		
		Scanner scaner1 = new Scanner(System.in);
		System.out.println("Введите гривны: ");
		int uan = scaner1.nextInt();
		System.out.println("Введите процент годовых: ");
		int persent = scaner1.nextInt();
		double res = (uan / 100 * persent) / 12;
		System.out.println("сумму денег, выплачиваемых банком вкладчику каждый месяц: " + res);
		
		
		//15. Сколько товара ценой Y можно купить на Х гривен и сколько получить сдачи?
		Scanner scaner2 = new Scanner(System.in);
		System.out.println("Введите гривны: ");
		int xx = scaner2.nextInt();
		System.out.println("Введите цену товара: ");
		int yy = scaner2.nextInt();
		System.out.println("amount= " + (xx / yy) + "; oddMoney = " + (double)(xx%yy));
		
	
		//16. Написать программу, которая переводит фунты в килограммы. Один фунт – 405.9 грамма задается в программе как константа. 
		//Затем, реализовать обратный перевод – из килограммов в фунты.
		
		final double lb = 405.9; // 1 фунт в граммах
		Scanner scaner3 = new Scanner(System.in);
		System.out.println("Введите килограммы: ");
		double kg = scaner3.nextDouble();
		System.out.println(kg*lb/1000);
		
		//17. Ввести длину, ширину и высоту комнаты. Подсчитать, сколько краски уйдет на покраску стен этой комнаты, 
		//если на 1м2 стены приходится N литров краски и M% поверхности стен занимают окна и двери. 
		// Также, рассчитать общую стоимость краски, с учётом того, что один литр краски стоит R гривен. 
		
		Scanner scanParametrs =  new Scanner(System.in);
		System.out.println("Введите длинну: ");
		double l = scanParametrs.nextDouble();
		System.out.println("Введите ширину: ");
		double w = scanParametrs.nextDouble();
		System.out.println("Введите высоту: ");
		double h = scanParametrs.nextDouble();
		System.out.println("Введите количество краски на 1 м2: ");
		double n = scanParametrs.nextDouble();
		System.out.println("Введите площадь окон и дверей  в процентах: ");
		double m = scanParametrs.nextDouble();
		System.out.println("Введите стимость краски: ");
		double r = scanParametrs.nextDouble();
		double arreaWall = 2 * h * (w + l);
		m = arreaWall/ 100 * m;
		n = n * (arreaWall - m);
		System.out.println("Нужно литров краски: " + n + "Нужно денег: " + (n * r));
		
		
		//18. Ввести с клавиатуры 3-значное число и «перевернуть» его (например, ввести 357 – получить и вывести 753).
		
		Scanner scNr = new Scanner(System.in);
		System.out.println("Укажите 3-значное число с разными цифрами: ");
		int nU = scNr.nextInt();
		int nU1 = nU/100;
		int nU2 = (nU%100)/10;
		int nU3 = nU%10;
		if (nU1 == nU2 || nU2 == nU3){
			System.out.println( "Ошибка! Введите другое число: ");
		} else {
				System.out.println("Число наоборот: " + nU3 + nU2 + nU1);
			} 
		
		
		StringBuffer sb = new StringBuffer("abc");
		sb.replace(0, 1, "def");
		// с какого по какой, на что менять
		System.out.println(sb);
		
		
		//19. Ввести пятизначное число и сдвинуть его циклически вправо на N разрядов (например, ввести число 12345, и 2 разряда – получить и вывести на экран 45123).
		
		Scanner scannerNum = new Scanner(System.in);
		System.out.println("Укажите число : ");
		String nummer = scannerNum.nextLine();
		System.out.println("Укажите число розрядов, на которое нужно циклически сдвинуть: ");
		int discharge = scannerNum.nextInt();
		String nummer1 = nummer.substring(0, (nummer.length() - discharge)); 
		System.out.println((nummer.substring((nummer.length() - discharge), nummer.length())) + nummer1);
		
		/*//1.1 
		
		Scanner scannerNumer =  new Scanner(System.in);
		System.out.println("Enter a few numbers separated by a space: ");
		String stringNum = scannerNumer.nextLine();
		String[]numerFromScanner = stringNum.split(" ");
		int[]numArray = new int[numerFromScanner.length];
			for(int i = 0; i < numerFromScanner.length; i++){
				numArray[i] = Integer.parseInt(numerFromScanner[i]);
			}
			int sumNumber = 0;
			for (int i = 0; i < numArray.length; i++){
				sumNumber +=numArray[i];
			}
		System.out.println("Average of " + numArray.length + " numbers = " + sumNumber/numArray.length);
		
		
		//2.2 
		
		
		Scanner scanner1_2 = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a1 = scanner1_2.nextDouble();
		Scanner scanner2_2 = new Scanner(System.in);
		System.out.println("Enter b: ");
		double b1 = scanner2_2.nextDouble();
		double x1 = b/a1 * -1;
		System.out.println(a + "x + " + b + " = 0; x = " + x);
		
		

		//3.3
		
		Scanner scanner1_3 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a3 = scanner1_3.nextDouble();
		Scanner scanner2_3 = new Scanner(System.in);
		System.out.println("Enter degree: ");
		double b3 = scanner2_3.nextDouble();
		double c3 = Math.pow(a3, b3);
		System.out.println("Result : " + c3);
		
		//4.4
		
		
		Scanner scanner1_4 = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double a4 = scanner1_4.nextDouble();
		double s4 = Math.pow(a4, 2)*Math.PI;
		double l1 = 2*Math.PI*a4;
		System.out.printf("Длинна окружности: %.2f\n" ,l1);
		System.out.printf("Площадь круга: %.2f\n" , s4);
		
		
		//5.5
		Scanner scanner1_5 = new Scanner(System.in);
		System.out.println("Enter UAH: ");
		double a5 = scanner1_5.nextDouble();
		System.out.printf("USD: %.2f\n" ,a5*24.91);
		System.out.printf("EUR: %.2f\n" , a5*28.05);
		System.out.printf("RUS: %.2f\n" ,a5*0.382);
		
		
		
		//10.10
		
		int a7 = 15;
		int b7 = 10;
		int c = a7-b7;
		b = b7+c;
		a = a7-c;
		System.out.println(a7 + ", "+ 7);
		
		int k = 7;
		int f = 1;
		k = f - k; // k = 3
		f = k + f; // f = 12
		f = f-2*k; // f = 6
		k = k + f; // k = 3
		System.out.println(k + ", "+ f);
		
		//13.13
		 Scanner sc7 = new Scanner(System.in);
		 System.out.println("Enter three-digit number: ");
		 int i = sc7.nextInt();
		 int i1 = i/100; //847/100  = 8
		 int i2 = (i1%100)/10; // 47/10 остаток 4 
		 int i3 = i%10; //7
		 System.out.println("Resalt: " + i1 + i3);
		 
		*/
	}
}