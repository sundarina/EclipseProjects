

// Розумняк Дарья
// Задания на занятии 13.10.2016, тема 7

import java.util.Scanner;

public class ForWhileMore {

	public void task1() {
		/*
		 * 1. Сказать, является ли заданное число числом Фибоначчи, если
		 * является, то найти следущее и предидущее
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		int fibonnacci = scanner.nextInt();
		int n0 = 1, n1 = 1, n2;
		if (fibonnacci >= 0) {
			do {
				n2 = n0 + n1;
				n0 = n1;
				n1 = n2;

			} while (n2 < fibonnacci);
			if (n2 == fibonnacci) {
				System.out.println("Число Фибоначчи");
				System.out.println("Предыдущее: " + n0);
				System.out.println("Следующее: " + (n0 + n1));

			} else {
				System.out.println("Число не являеться Фибоначчи");
			}

		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}

		scanner.close();
	}

	public void task2() {

		/* 2. Посчитать количество счастливых билетиков от 0 до 999999. */

		int luckyCounter = 0;
		int sum1 = 0;
		for (int i = 0; i <= 999; i++) {
			int num1 = i / 100;
			int num2 = (i % 100) / 10;
			int num3 = i % 10;
			sum1 = num1 + num2 + num3; // сумма sum1

			int sum2 = 0;

			for (int j = 0; j <= 999; j++) {

				int num1_1 = j / 100;
				int num1_2 = (j % 100) / 10;
				int num1_3 = j % 10;
				sum2 = num1_1 + num1_2 + num1_3;

				if (sum1 == sum2) {
					// System.out.print(i);
					// System.out.print(" ");
					// System.out.println(j);
					luckyCounter++;
				}
			}

		}

		System.out.println(luckyCounter);
	}

	public void task3() {
		/*
		 * 3. Найти наибольший общий делитель и наименьшее общее кратное двух
		 * чисел.
		 * 
		 * Наибольший общий делитель (НОД) двух данных чисел a и b — это
		 * наибольшее число, на которое оба числа a и b делятся без остатка.
		 * 
		 * Наименьшим общим кратным (НОК) двух и более натуральных чисел
		 * называется наименьшее натуральное число, которое само делится нацело
		 * на каждое из этих чисел
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите число: ");
		int a = scanner.nextInt();
		System.out.println("Ведите число: ");
		int b = scanner.nextInt();
		int k = a;
		int g = b;
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		System.out.println("НОД " + a);
		a = (k * g) / a;
		System.out.println("НОК " + a);
		scanner.close();
	}

	public void task4() {

		/*
		 * 4. За один цикл вычислить значение функции F(n) = 1!*2!*3!...*n!.,
		 * где n! = 1*2*3*…*n.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		double n = scanner.nextDouble();
		double s = 1.0;
		double t = 1.0;
		if (n > 0) {
			for (double i = 1.0; i <= n; i++) {
				t = (t * i);
				s = (s * t);
			}
		} else {
			System.out.println("Данное число не соответствует заданому диапазону, пожалуйста, введите корректное ");
		}
		System.out.println(s);
		scanner.close();
	}

	public static void main(String[] args) {

		ForWhileMore fw = new ForWhileMore();
		// fw.task1();
		// fw.task2();
		// fw.task3();
		//fw.task4();
	}

}
