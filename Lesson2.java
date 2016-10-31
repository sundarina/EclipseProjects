import java.util.*;

public class Lesson2 {

	public static void main(String[] args) {

		// 1. Ввести число, и определить – чётное оно, или нет.
		Scanner sc = new Scanner(System.in);
		System.out.println("ВВедите число: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Число четное.");
		} else {
			System.out.println("Число нечетное.");
		}
		sc.close();

		// 2. Ввести три числа и найти наименьшее среди них.

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ведите три числа через проблел: ");
		String threeNumber = sc2.nextLine();
		String[] array = threeNumber.split(" ");
		int[] num = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			num[i] = Integer.parseInt(array[i]); // приведение типов со String
													// to int
		}
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) { // поиск индекса минимального
				min = num[i];
			}

		}
		System.out.println("Min: " + min);

		int[] list = { 15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30 };

		int mn = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i] < mn)
				mn = list[i];
		}

		System.out.println("Min is " + mn);
		sc2.close();

		// 3. Ввести число, и выяснить - положительное оно, отрицательное, или
		// равно нулю?

		Scanner sc3 = new Scanner(System.in);
		System.out.println("ВВедите число: ");
		int numb = sc3.nextInt();
		sc3.close();
		if (numb == 0) {
			System.out.println("Число " + numb + " - равно нулю");
		} else if (numb > 0) {
			System.out.println("Число " + numb + " - положительное");
		} else {
			System.out.println("Число " + numb + " - отритцательное");
		}

		// 5. Ввести с клавиатуры число и проверить, принадлежит ли это число
		// диапазону от N до M (включительно).

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Введите число: ");
		int chislo = Integer.parseInt(sc5.nextLine());

		/*
		 * cчитывание числа, введенного пользователем как строка и сразу
		 * предедение в число, чтобы избежать считывания лишних символов, типа
		 * /n
		 */

		System.out.println("Введите диапазон чисел в формате a-b : ");
		String diapason = sc5.nextLine();
		String[] arr = diapason.split("-");
		int one = Integer.parseInt(arr[0]);
		int two = Integer.parseInt(arr[1]);

		int minn = one < two ? one : two;
		int max = one < two ? two : one;
		if (chislo >= minn && max >= chislo) {
			System.out.println("Число входит в диапазон");
		} else
			System.out.println("Число не входит в диапазон");

		// 6. Написать программу для проверки кратности числа X числу Y (оба
		// числа вводятся с клавиатуры).

		Scanner numer = new Scanner(System.in);
		System.out.print("Укажите  число X");
		int x = numer.nextInt();

		System.out.print("Укажите число Y");
		int y = numer.nextInt();
		if (y % x == 0) {
			System.out.println("a кратное b");
		} else
			System.out.println("a не кратное b");
		numer.close();

		// 7. Ввести число и определить кратно ли оно 3, 5, и 7 одновременно.

		Scanner n = new Scanner(System.in);
		System.out.print("Укажите  число X");
		int xx = n.nextInt();
		if (xx % 3 == 0 && xx % 5 == 0 && xx % 7 == 0) {
			System.out.println("a кратное b");
		} else {
			System.out.println("a не кратное b");
		}
		n.close();

		// 8. Показать модуль введённого числа.
		// Math.abs(a)

		Scanner sc55 = new Scanner(System.in);
		System.out.println("Введите число: ");
		int mod = sc55.nextInt();
		if (mod >= 0) {
			System.out.println("Ваше число по модулю: |" + mod + "|");
		} else if (mod < 0) {
			mod += -2 * mod;
			System.out.println("Ваше число по модулю: |" + mod + "|");
		}
		sc55.close();
		
		// 9.Вводится целое число (не более 4 разрядов!). Определить количество
		// цифр в нём.

		Scanner sc9 = new Scanner(System.in);
		System.out.println("Введите целое число");
		String nummerUser = sc9.next();
		System.out.println(nummerUser.length());
		sc9.close();

		// 10. Ввести с клавиатуры пятизначное число и определить,
		// является ли оно палиндромом (т.е. одинаково читается в обоих
		// направлениях - например, 12321 будет палиндромом, а 12345 – не
		// палиндром).

		Scanner sc10 = new Scanner(System.in);
		System.out.println("Введите число");
		String nU = sc10.next();
		sc10.close();
		boolean allTrue = true;
		for (int i = 0; i < (nU.length() / 2); i++) {
			if (nU.charAt(i) != nU.charAt(nU.length() - i - 1)) {
				allTrue = false;
				break;
			}
		}

		if (allTrue) {
			System.out.println("This is polyndrom");
		} else {
			System.out.println("This is not a polyndrom");
		}

		// 11. Найти максимальное значение среди 4 переменных, используя
		// тернарный оператор.

		int o = 0;
		int k = 4;
		int v = 99;
		int g = -1;
		if (o == k && v == g && k == v) {
			System.out.println("Числа равны");
		} else {
			int maxx = o > k ? o : k;
			maxx = maxx > v ? maxx : v;
			maxx = maxx > g ? maxx : g;
			System.out.println(maxx);

		}

		// 2. Проверить, имеет ли введённое число вещественную часть.
		// Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и
		// 10.0 – нет.

		Scanner scn1 = new Scanner(System.in);
		System.out.println("Введите число: ");
		double numB = scn1.nextDouble();
		scn1.close();
		numB = (numB - (int) numB) == 0 ? 0 : 1;
		// if (numB == 0){
		// System.out.println("Число не имеет вещественную часть");
		// } else if (numB == 1){
		// System.out.println("Число имеет вещественную часть");
		// }

		System.out.println(numB == 0 ? "Число не имеет вещественную часть" : "Число имеет вещественную часть");

		// 3. Написать программу, которая предлагает пользователю ввести номер
		// дня недели,
		// и в ответ показывает название этого дня (например, 6 – это суббота).
		// Решить с использованием switch.

		Scanner scnR = new Scanner(System.in);
		System.out.println("Введите число: ");
		int day = scnR.nextInt();
		String dayString;
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wensday";
			break;
		case 4:
			dayString = "Tuesday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Suturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
			break;
		}
		System.out.println(dayString);
		scnR.close();

		// 4.4. Указать с клавиатуры текущее время (количество часов, минут,
		// секунд).
		// Проверить корректность введённых значений.

		Scanner scneR = new Scanner(System.in);
		System.out.println("Укажите текущее время (количество часов:минут:секунд): ");
		String time = scneR.nextLine();
		String[] T = time.split(":");
		int h = Integer.parseInt(T[0]);
		int m = Integer.parseInt(T[1]);
		int s = Integer.parseInt(T[2]);
		if ((h < 24 && h >= 0) && (m < 60 && m >= 0) && (s < 60 && m >= 0)) {
			System.out.println("Формат времени корректен");

		} else {
			System.out.println("Формат времени не корректен");

		}
		scneR.close();

		// 4. Ввести с клавиатуры символ. Определить, чем он является: цифрой,
		// буквой или символом.

		while (true) {
			boolean hasNumbers = false;
			boolean hasSymbols = false;
			String numbers = "0123456789";
			String symbols = "!@#$%^&*()_+=-;':<>?/.,\\";
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Please, enter your's password");
			String password = sc4.nextLine();
			sc4.close();
			for (int i = 0; i < password.length(); i++) {
				for (int j = 0; j < numbers.length(); j++) {
					if (password.charAt(i) == numbers.charAt(j)) {
						hasNumbers = true;
					}
				}
				for (int j = 0; j < symbols.length(); j++) {
					if (password.charAt(i) == symbols.charAt(j)) {
						hasSymbols = true;
					}
				}
			}
			if (hasNumbers) {
				System.out.println("Это цифра");
			} else if (hasSymbols) {
				System.out.println("Это символ");
			} else
				System.out.println("Это буква");
		}

	}
}
