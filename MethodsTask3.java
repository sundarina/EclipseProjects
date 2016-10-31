
//Розумняк Дарья 
//Домашка:  Методы
//вариант 1

/*
	 * 3. Написать меню для выполнения операций над массивами (предусмотреть
	 * повторное выполнение программы, продолжение выполнения операций над одной
	 * матрицей).
	 */

import java.util.Scanner;

public class MethodsTask3 {

	static void output(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
	}

	static int sumElements(int a[][]) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;

	}

	static int[][] transArray(int a[][]) {
		int b[][] = new int[a[0].length][a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

	static void minMax(int a[][]) {

		int min_i = 0;
		int max_i = 0;
		int min_j = 0;
		int max_j = 0;

		for (int i = 0; i < a.length; i++) {
			min_i = i;
			min_j = 0;

			max_i = i;
			max_j = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < a[min_i][min_j]) {
					min_i = i;
					min_j = j;
				}
				if (a[i][j] > a[max_i][max_j]) {
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println("Минимальное: " + a[min_i][min_j]);
		System.out.println("Максимальное: " + a[max_i][max_j]);
		System.out.println();

	}

	static int[][] randArray(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 99);
			}
		}
		return a;
	}

	static int[][] inputArray(int a[][], Scanner s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Введите элемент № : " + i + "," + j);
				a[i][j] = s.nextInt();
			}
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 3;
		int m = 5;

		System.out.println("Введите количество строк массива: ");
		n = scanner.nextInt();
		System.out.println("Введите количество столбцов массива: ");
		m = scanner.nextInt();

		int[][] a = new int[n][m];
		int action;

		do {
			do {
				System.out.println("Как Вы хотите ввести массив (1) вручную, (2) программа выведет случайные числа: ");
				action = scanner.nextInt();

				if (action == 1) {
					a = inputArray(a, scanner);
					System.out.println("Ваш массив: ");
					output(a);
				} else if (action == 2) {
					a = randArray(a);
					System.out.println("Ваш массив: ");
					output(a);
				} else {
					System.out.println("Неверный ввод, повторите попытку");
				}

			} while (action != 1 && action != 2);

			do {
				do {
					System.out.println(
							"Что Вы хотете сделать с массивом: (1) Посчитать сумму элементов массива (2) Заменить строки на столбцы. (3) Вывести максимальный и минимальный элементы.");
					action = scanner.nextInt();

					switch (action) {
					case (1):
						int sum = sumElements(a);
						System.out.println("Сумма всех элементов массива: " + sum);
						System.out.println();
						break;
					case (2):
						a = transArray(a);
						output(a);
						break;
					case (3):
						minMax(a);
						break;
					default:
						System.out.println("Неверный ввод, повторите попытку");
					}
				} while (action != 1 && action != 2 && action != 3);
				
				do {
					System.out.println("Xотите ли вы еще чтото сделать над этим массивом (1) да (2) нет");
					action = scanner.nextInt();
				} while (action != 1 && action != 2);

			} while (action == 1);
			
			do {
				System.out.println("Xотите ли вы ввести новый массив: (1) да (2) нет");
				action = scanner.nextInt();
			} while (action != 1 && action != 2);
			
		} while (action == 1);
		System.out.println("Goodbye");
	}
}
