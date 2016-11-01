import java.util.Scanner;
import java.util.*;

public class RecursionLesson {

	/*
	 * 1. Создать массив на N элементов со случайными элементами. Циклы не
	 * использовать.
	 * 
	 * 2. Посчитать факториал числа, используя рекурсивные алгоритмы.
	 * 
	 * 3. Найти число Фибоначчи под номером N, используя рекурсию.
	 * 
	 * 4. Посчитать детерминант матрицы, используя рекурсию.
	 * 
	 * 5. Отсортировать массив, используя рекурсию.
	 * 
	 * 6. Решить задачу с помощью рекурсии. Дана матрица нулевых элементов. В
	 * любом месте матрицы ставится одно значение 1. Нужно посчитать за сколько
	 * ходов единица «захватит мир», если каждый ход область ее владений
	 * расширяется на соседние элементы.
	 */

	static void randomArray(int arr[], int n) {
		if (n == 0)
			return;
		int i = (int)(Math.random() * 99);
		arr[--n] = i;
		randomArray(arr, n);
	}
	
	static void printArray(int arr[], int n) {
		if ( n == 0) return;
		System.out.print(arr[--n] + " ");
		printArray(arr, n);		
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

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//1
		
		System.out.println("Введите длинну массива: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		randomArray(arr , n);
		printArray(arr, n);
		System.out.println();
		
		// 2

		System.out.println();
		System.out.println("Введите число: ");
		int num = scanner.nextInt();
		System.out.println("Факториал числа 3 равен " + fact(num));
		scanner.close();
	}

}
