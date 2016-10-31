
// Розумняк Дарья
//Домашнее задание 11.10.2016, тема 6 и 7

import java.util.Scanner;

public class TestLesson {

	public void task6n1() {

		/*
		 * 1 Даны два целых числа A и B (A < B). Вывести в порядке возрастания
		 * все целые числа, расположенные между A и B (включая сами числа A и
		 * B), а также количество N этих чисел.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int firstNum = scanner.nextInt();
		System.out.println("Ведите число, больше чем предыдущее: ");
		int secondNum = scanner.nextInt();
		int counter = 0;
		if (firstNum < secondNum) {
			do {
				System.out.println(firstNum);
				firstNum++;
				counter++;
			} while (firstNum <= secondNum);

			System.out.println("Amount of numbers: " + counter);
			scanner.close();
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
	}

	public void task6n2() {

		/*
		 * 2. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
		 * целые числа, расположенные между A и B (не включая числа A и B), а
		 * также количество N этих чисел.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int fNum = scanner.nextInt();
		System.out.println("Ведите число, больше чем предыдущее: ");
		int sNum = scanner.nextInt();
		int counter1 = 0;
		if (fNum < sNum) {
			do {
				sNum--;
				counter1++;
				System.out.println(sNum);

			} while (fNum < sNum - 1);

			System.out.println(counter1);
			scanner.close();

		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
	}

	public void task6n3() {

		/*
		 * 3. Даны положительные числа A и B (A > B). На отрезке длины A
		 * размещено максимально возможное количество отрезков длины B (без
		 * наложений). Не используя операции умножения и деления, найти длину
		 * незанятой части отрезка A и количество отрезков B, размещенных на
		 * отрезке A.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int aa = scanner.nextInt();
		System.out.println("Ведите число меньше, чем предыдущее: ");
		int bb = scanner.nextInt();
		int count = 0;
		if (aa > bb) {
			while (aa >= bb) {
				aa -= bb;
				count++;
			}
			scanner.close();

			System.out.println(count);
			System.out.println(aa);
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}

	}

	public void task6n4() {

		/*
		 * 4. Дано целое число N (> 3). Если оно является степенью числа 3, то
		 * вывести True, если не является — вывести False.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число больше 3: ");
		int n = scanner.nextInt();
		if (n > 3) {
			while (n % 3 == 0) {
				n = n / 3;
			}
			if (n == 1) {
				System.out.println("true");
			} else
				System.out.println("false");
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
		scanner.close();
	}

	public void task6n5() {

		/*
		 * 5. Начальный вклад в банке равен 1000 руб. Через каждый месяц раз мер
		 * вклада увеличивается на P процентов от имеющейся суммы (P —
		 * вещественное число, 0 < P < 25). По данному P определить, через
		 * сколько месяцев размер вклада превысит 1100 руб., и вывести найденное
		 * количество месяцев K (целое число) и итоговый размер вклада S
		 * (вещественное число).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите процентную ставку с параметром 0 < P < 25: ");
		double p = scanner.nextDouble();
		int month = 0;
		double total = 1000;
		if (0 < p && p < 25) {
			do {
				total += total * (p / 100);
				month++;
			} while (total <= 1100.0);
			System.out.println(month);
			System.out.println(total); // Итоговая сумма
		} else {
			System.out.println(
					"Процентная ставка не соответствует заданому диапазону, пожалуйста, введите корректное число");
		}
		scanner.close();
	}

	public void task6n6() {

		/*
		 * 6. Дано целое число N (> 0). Используя операции деления нацело и
		 * взятия остатка от деления, найти число, полученное при прочтении
		 * числа N справа налево.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите целое число: ");
		int n = scanner.nextInt();
		if (n > 0) {
			while (n > 0) {
				System.out.print(n % 10);
				n /= 10;
			}
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
		System.out.println();
		scanner.close();
	}

	public void task6n7() {

		/* 7. Найти число Фибоначчи под номером N. */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		int fibonnacci = scanner.nextInt();
		if (fibonnacci >= 0) {
			int lo = 0; // 1
			int hi = 1; // 2
			int i = 0;
			while (i < fibonnacci) {
				hi = lo + hi;
				lo = hi - lo;
				i++;
			}
			System.out.println(lo);

		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}

		scanner.close();
	}

	public void task7n0() {

		// Найти сумму всех чисел от А до В включительно.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int a = scanner.nextInt();
		System.out.println("Ведите число: ");
		int b = scanner.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}

	public void task7n1() {

		/*
		 * 1. Дано целое число N (> 0). Найти значение выражения 1 – 2 + 3 – …
		 * (N слагаемых, знаки чередуются). Условный оператор не использовать.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число: ");
		int m = scanner.nextInt();
		int res = 0;
		if (m > 0) {
			for (int i = 1; i <= m; i++) {
				if (i % 2 == 0) {
					res -= i;
				} else {
					res += i;
				}
			}
			System.out.println(res);
		} else {
			System.out.println("Данное число не соответствует заданому диапазону,пожалуйста, введите корректное ");
		}
		scanner.close();
	}

	public void task7n2() {

		/*
		 * 2. Дано целое число N (> 0). Найти произведение N! = 1·2·…·N
		 * (N–факториал). Чтобы избежать целочисленного переполнения, вычислять
		 * это произведение с помощью вещественной переменной и вывести его как
		 * вещественное число.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		double q = scanner.nextDouble();
		double s = 1.0;
		if (q > 0) {
			for (double i = 1.0; i <= q; i++) {
				s = s * i;
			}
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
		System.out.println(s);
		scanner.close();
	}

	public void task7n3() {

		/*
		 * 3. Даны целые числа A и B (A < B). Вывести все целые числа от A до B
		 * включительно; при этом число A должно выводиться 1 раз, число A + 1
		 * должно выводиться 2 раза и т. д.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int h = scanner.nextInt();
		System.out.println("Ведите число, больше первого: ");
		int g = scanner.nextInt();
		if (h < g) {
			for (int i = h; i <= g; i++) {
				for (int j = h - 1; j < i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else {
			System.out.println("Данное число не соответствует задаyному диапазону, пожалуйста, введите корректное ");
		}
		scanner.close();
	}

	public void task7n4() {

		/*
		 * 4. Дано целое число N (> 1). Если оно является простым, то есть не
		 * имеет положительных делителей, кроме 1 и самого себя, то вывести
		 * True, иначе вывести False.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число, больше 1: ");
		double num = scanner.nextDouble();
		scanner.close();
		double j = 0;
		int u;
		if (num > 1) {
			for (u = 2; u < num; u++) {
				// j = num / u;
				if (num % u == 0) {

					System.out.println("False");
					return;
				}
			}
			System.out.println("True");

		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}

	}

	public void task7n5() {

		/*
		 * 5. Даны положительные числа A, B, C. На прямоугольнике размера A×B
		 * размещено максимально возможное количество квадратов со стороной C
		 * (без наложений). Найти количество квадратов, размещенных на
		 * прямоугольнике. Операции умножения и деления не использовать.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число A: ");
		int numA = scanner.nextInt();
		System.out.println("Ведите число B: ");
		int numB = scanner.nextInt();
		System.out.println("Ведите число C: ");
		int numC = scanner.nextInt();
		int counter = 0;
		for (int i = 0; i < numA; i += numC) {
			for (int j = 0; j < numB; j += numC) {
				counter++;
			}
		}

		System.out.println(counter);
		scanner.close();
	}

	public static void main(String[] args) {

		TestLesson testLesson = new TestLesson();

		// 6. Задачи на WHILE

		// testLesson.task6n1();
		// testLesson.task6n2();
		// testLesson.task6n3();
		// testLesson.task6n4();
		// testLesson.task6n5();
		// testLesson.task6n6();
		// testLesson.task6n7();
		// testLesson.task6n7();

		// 7. Задачи на FOR

		// testLesson.task7n0();
		// testLesson.task7n1();
		// testLesson.task7n2();
		// testLesson.task7n3();
		//testLesson.task7n4();
		// testLesson.task7n5();

	}
}
