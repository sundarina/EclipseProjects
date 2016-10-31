
// Розумняк Дарья
//Домашнее задание, тема 5


import java.util.Scanner;

public class IfSwitchTest {

	public void task5n1() {
		/*
		 * 1. Дано целое число. Если оно является положительным, то прибавить к
		 * нему 1; в противном случае не изменять его. Вывести полученное число.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = scanner.nextInt();
		if (a > 0) {
			a += 1;
			System.out.println(a);
		} else {
			System.out.println(a);
		}
		scanner.close();
	}

	public void task5n2() {

		/*
		 * 2. Дано целое число. Если оно является положительным, то прибавить к
		 * нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
		 * заменить его на 10. Вывести полученное число.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = scanner.nextInt();
		if (a > 0) {
			a += 1;
		} else if (a < 0) {
			a -= 2;
		} else {
			a = 10;
		}
		System.out.println(a);
		scanner.close();
	}

	public void task5n3() {

		/*
		 * 3. Даны три целых числа. Найти количество положительных чисел в
		 * исходном наборе.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = scanner.nextInt();
		System.out.println("Введите число: ");
		int b = scanner.nextInt();
		System.out.println("Введите число: ");
		int c = scanner.nextInt();
		int count = 0;
		if (a > 0) {
			count = 1;
		} if (b > 0) {
			count++;
		} if (c > 0) {
			count++;
		}
		System.out.println(count);
		scanner.close();
	}

	public void task5n4() {

		/*
		 * 4. Даны три целых числа. Найти количество положительных и количество
		 * отрицательных чисел в исходном наборе.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = scanner.nextInt();
		System.out.println("Введите число: ");
		int b = scanner.nextInt();
		System.out.println("Введите число: ");
		int c = scanner.nextInt();
		int posit = 0;
		int negat = 0;
		int countNull = 0;
		if (a > 0) {
			posit = 1;
		} else if (a < 0) {
			negat = 1;
		} else
			countNull = 1;
		if (b > 0) {
			posit++;
		} else if (b < 0) {
			negat++;
		} else
			countNull++;

		if (c > 0) {
			posit++;
		} else if (c < 0) {
			negat++;
		} else
			countNull++;
		System.out.println("Положительных чисел: " + posit + ". Отритцательных чисел: " + negat + ". Количество нулей: "
				+ countNull);
		scanner.close();

	}

	public void task5n5() {

		/* 5°. Даны три числа. Найти наименьшее из них. */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = scanner.nextInt();
		System.out.println("Введите число: ");
		int b = scanner.nextInt();
		System.out.println("Введите число: ");
		int c = scanner.nextInt();
		scanner.close();

		if ((a <= b) & (a <= c)) {
			System.out.println("Num 1: " + a);
		} else if ((b >= c) & (a >= c)) {
			System.out.println("Num 3: " + c);
		} else {
			System.out.println("Num 2: " + b);
		}
		if (a == b & b == c) {
			System.out.println("Числа равны");
		}

	}

	public void task5n6() {

		/*
		 * 6. Дан номер года (положительное целое число). Определить количество
		 * дней в этом году, учитывая, что обычный год насчитывает 365 дней, а
		 * високосный — 366 дней. Високосным считается год, делящийся на 4, за
		 * исключением тех годов, которые делятся на 100 и не делятся на 400
		 * (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и
		 * 2000 — являются).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите год н.э: ");
		int year = scanner.nextInt();
		scanner.close();
		if (year > 0) {
			if (year % 4 == 0) {
				if (year % 400 > 0 && year % 100 == 0) {
					System.out.println("Год не высокосный, в нем 365 дней");
				} else {
					System.out.println("Год высокосный, в нем 366 дней");
				}

			} else {
				System.out.println("Год не высокостный, в нем 365 дней");
			}
		} else
			System.out.println("Число не входит в требуемый диапазон");
	}

	public void task5n7() {

		/*
		 * 7. Дано целое число, лежащее в диапазоне 1–999. Вывести его
		 * строку-описание вида «четное двузначное число», «нечетное трехзначное
		 * число» и т. Д. }
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 1 до 999: ");
		int num = scanner.nextInt();
		scanner.close();
		if (num > 1 && num < 999) {
			if (num % 2 == 0) {
				if (num >= 100 && num <= 999) {
					System.out.println("Четное трехзначное");
				} else if (num >= 10 && num <= 99) {
					System.out.println("Четное двузначное");
				} else {
					System.out.println("Четная цыфра");
				}
			} else if (num >= 100 && num <= 999) {
				System.out.println("Нечетное трехзначное");
			} else if (num >= 10 && num <= 99) {
				System.out.println("Нечетное двузначное");
			} else {
				System.out.println("Нечетная цыфра");
			}
		} else
			System.out.println("Число не входит в требуемый диапазон");
	}

	public void task5n8() {

		/*
		 * 8. Дано целое число в диапазоне 1–7. Вывести строку — название дня
		 * недели, соответствующее данному числу (1 — «понедельник», 2 —
		 * «вторник» и т. д.).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число дня недели : ");
		int day = scanner.nextInt();
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
		scanner.close();
	}

	public void task5n9() {

		/*
		 * 9. Дано целое число K. Вывести строку-описание оценки,
		 * соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 —
		 * «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в
		 * диапазоне 1–5, то вывести строку «ошибка».
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 1 до 5: ");
		int k = scanner.nextInt();
		String kString;
		switch (k) {
		case 1:
			kString = "Плохо";
			break;
		case 2:
			kString = "Неудовлетворительно";
			break;
		case 3:
			kString = "удовлетворительно";
			break;
		case 4:
			kString = "Хорошо";
			break;
		case 5:
			kString = "Отлично";
			break;
		default:
			kString = "Ошибка";
			break;
		}
		System.out.println(kString);
		scanner.close();

	}

	public void task5n10() {

		/*
		 * 10. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 —
		 * километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер единицы
		 * длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах
		 * (вещественное число). Найти длину отрезка в метрах.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 1 до 5: ");
		int num = scanner.nextInt();
		System.out.println("Введите длинну отрезка: ");
		double line = scanner.nextDouble();
		scanner.close();
		switch (num) {
		case 1:
			System.out.println(line + " дециметров = " + (line * 0.1) + " м");
			break;
		case 2:
			System.out.println(line + " километров = " + (line * 1000) + " м");
			break;
		case 3:
			System.out.println(line + " метров = " + line + " м");
			break;
		case 4:
			System.out.println(line + " миллиметров = " + (line * 0.001) + " м");
			break;
		case 5:
			System.out.println(line + " сантиметров = " + (line * 0.01) + " м");
			break;
		default:
			System.out.println("Ошибка");
			break;
		}

	}

	public static void main(String[] args) {

		IfSwitchTest i = new IfSwitchTest();
		// i.task5n1();
		// i.task5n2();
		 i.task5n3();
		// i.task5n4();
		// i.task5n5();
		// i.task5n6();
		// i.task5n7();
		// i.task5n8();
		// i.task5n9();
		//i.task5n10();
	}

}
