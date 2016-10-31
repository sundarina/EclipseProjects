import java.util.Scanner;

public class ArraySortLesson {

	public void task0() {
		int[] elements = { 1, 2, 3, 4, 5 }; // массив из 5 элементов
		int[] tmp = new int[10];
		System.arraycopy(elements, 0, tmp, 0, elements.length);
		elements = tmp; // перенос ссылки на новый массив
		for (int i : elements) {
			System.out.println(i);
		}

	}

	public void task1() {
		/*
		 * 1. Дан массив размера N. Обнулить элементы массива, расположенные
		 * между его минимальным и максимальным элементами (не включая
		 * минимальный и максимальный элементы).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];

		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
			System.out.print(list[i] + " ");
		}

		int max = 0;
		for (int j = 1; j < list.length; j++) {
			if (list[j] > list[max]) {
				max = j;
			}
		}
		int min = 0;
		for (int j = 1; j < list.length; j++) {
			if (list[j] < list[min]) {
				min = j;
			}
		}

		if (min < max) {
			for (int i = min + 1; i < max; i++) {
				list[i] = 0;
			}
		} else {
			for (int i = max + 1; i < min; i++) {
				list[i] = 0;
			}
		}

		System.out.println("Min: " + list[min] + " с индексом " + min);
		System.out.println("Max: " + list[max] + " с индексом " + max);
		System.out.println();
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public void task2() {
		/*
		 * 2. Дан массив размера N и два целых числа K и M (1 ≤ K ≤ N, 1 ≤ M ≤
		 * 10). После элемента массива с номером K вставить M новых элементов с
		 * нулевыми значениями.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		System.out.println("Введите целое число, от 1 до количества чисел в массиве включительно: ");
		int k = scanner.nextInt();
		System.out.println("Введите целое число, от 1 до 10 включительно: ");
		int m = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];
		int newlist[] = new int[n + m];

		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
			// System.out.print(list[i] + " ");
		}

		if ((k >= 1 && k <= n) && (m >= 1 && m <= 10)) {
			System.arraycopy(list, 0, newlist, 0, k);
			System.arraycopy(list, k - 1, newlist, k + m, m);
			list = newlist;
		} else {
			System.out.println("Числа не отвечают диапазонам");
		}

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	//Одновременно мак и мин элементы
	
	/*
	 * int max = 0; for (int j = 1; j < list.length; j++) { if (list[j] >
	 * list[max]) { max = j; } }
	 */
	public void taskSort() {
		int list[] = { 3, 5, 1, 2, 4 };

		int t = 0;
		int k = 0;
		for (int i = 0; i < list.length; i++) { // с какого элемента массива
												// рассматриваем
			int min = list[i];
			int min_i = i;
			int max = list[list.length - 1 - i];
			int max_i = list.length - 1 - i;
			// чтобы каждый следующий был как первый

			for (int j = i + 1; j < list.length - i; j++) { // сбегаються с 2
															// сторон

				if (list[j] < min) {
					min = list[j];
					min_i = j;
				}
				if (list[j] > max) {
					max = list[list.length - j];
					max_i = list.length - j;

				}
			}
			if (i != min_i) { // меняем местами

				t = list[i];
				list[min_i] = list[i];
				list[min_i] = t;

			}
			if (i != max_i) { // нада проверить стоит ли максимум на первом
								// месте, если не стоит - делаем замену, если
								// стоит - тогда меняем
				k = list[max_i];
				list[list.length - 1 - i] = list[max_i];
				list[max_i] = k;

				// list[max_i] = list[list.length - 1 - i];
				// list[list.length - 1 - i] = k;
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}

	public void task2n1() {
		/*
		 * В алгоритме пузырьком избавиться от “холостых” проработок алгоритма.
		 * например отсортированный массив
		 */

		
		int arr[] =  {1,2,3};
		boolean b = true;
		while (b) {
			b = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					b = true;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void sort_shell() {

		/* Отсортировать массив с помощью алгоритма Шелла */

		int arr[] = { 2, 3, 77, -3, 0, 77, 1, 5, 7, 34, -99 };

		for (int span = arr.length / 2; span > 0; span /= 2) { // интервал
			for (int i = span; i < arr.length; i++) { // проход по массиву
				// сравнение пар, стоящих на (диапазон) span друг от друга
				for (int j = i - span; j >= 0 && (arr[j + span] < arr[j]); j -= span) {
					int tmp = arr[j];
					arr[j] = arr[j + span];
					arr[j + span] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		ArraySortLesson arraySortLesson = new ArraySortLesson();

		// arraySortLesson.task1();
		// arraySortLesson.task2();
		// arraySortLesson.taskSort();
		//arraySortLesson.task2n1();

		// arraySortLesson.sort_shell();

	}

}
