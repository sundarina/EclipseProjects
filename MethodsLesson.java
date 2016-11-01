//Розумняк дарья
//Методы

import java.util.Scanner;

public class MethodsLesson {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Ведите число а: ");
		double a = scanner.nextDouble();
		System.out.println(" Ведите число б: ");
		double b = scanner.nextDouble();
		System.out.println("Введите действие, где 1 (/) 2 (*) 3 (-) 4 (+) : ");
		int num = scanner.nextInt();
		double sum = 0;
		switch (num) {
		case 1:
			sum = culcDivision(a, b);
			break;
		case 2:
			sum = culcMultiply(a, b);
			break;
		case 3:
			sum = culcSubtraction(a, b);
			break;
		case 4:
			sum = culcAdditive(a, b);
			break;
		}
		System.out.println(sum);
		

		
		
		System.out.println(" Ведите строку: ");
		String str = scanner.nextLine();
		boolean bool = palindrom(str);
		System.out.println(bool);

		
		scanner.close();
	}

	/*
	 * 1. Написать «калькулятор» на операции +,-,/,*, где пользователь выбирает
	 * операцию, вводит числа, и вызывается метод, что их считает.
	 */

	static double culcDivision(double a, double b) {
		return a / b;
	}

	static double culcMultiply(double a, double b) {
		return a * b;
	}

	static double culcSubtraction(double a, double b) {
		return a - b;
	}

	static double culcAdditive(double a, double b) {
		return a + b;
	}

	/*
	 * 2. Написать метод, что проверяет, является ли строка палиндромом
	 * (одинаково читается с двух концов). Он выдает true или false.
	 */

	static boolean palindrom(String str) {
		boolean a = false;
		int counter = 0;
		char ch[] = new char[str.length()];
		ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch[ch.length - i - 1]) {
				counter++;
			}
		}
		if (counter == ch.length)
			a = true;

		return a;

	}


}
