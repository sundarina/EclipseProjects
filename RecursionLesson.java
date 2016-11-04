//Розумняк Дарья
//Рекурсия

import java.util.*;

public class RecursionLesson {

	static void printArray(int arr[], int n) {
		if (n == 0)
			return;
		System.out.print(arr[--n] + " ");
		printArray(arr, n);
	}

	/*
	 * 1. Создать массив на N элементов со случайными элементами. Циклы не
	 * использовать.
	 */

	static void randomArray(int arr[], int n) {
		if (n == 0)
			return;
		int i = (int) (Math.random() * 99);
		arr[--n] = i;
		randomArray(arr, n);
	}

	/*
	 * 2. Посчитать факториал числа, используя рекурсивные алгоритмы.
	 */

	static int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}

	/* 3. Найти число Фибоначчи под номером N, используя рекурсию. */

	static int fibonachi(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return fibonachi(n - 1) + fibonachi(n - 2);
		}
	}

	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1

		System.out.println("Введите длинну массива: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		randomArray(arr, n);
		printArray(arr, n);
		System.out.println();

		// 2

		System.out.println();
		System.out.println("Введите число: ");
		int num = scanner.nextInt();
		System.out.println("Факториал числа равен " + fact(num));
		System.out.println();

		// 3

		System.out.println("Введите число: ");
		int nFib = scanner.nextInt();
		System.out.println("Число Фибоначчи под номером " + nFib + " равно " + fibonachi(nFib));

		scanner.close();

	}

}
