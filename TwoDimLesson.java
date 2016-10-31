
// Розумняк Дарья
//Домашнее задание, тема 10 "Многомерные массивы"

import java.util.Scanner;

public class TwoDimLesson {

	public void task1() {

		// 1. Посчитать сумму элементов массива

		int[][] a = new int[4][4];
		int sum = 0;
		// проходим цикл по строчкам, если фор поменять местами - то по
		// столбикам
		for (int i = 0; i < a.length; i++) { // a.length от нуля до количества
												// строк
			for (int j = 0; j < a[i].length; j++) { // a[i].length количство
													// элементов в і-той строке
				a[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);

		// Вывод данных массива
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}

	public void task2() {

		/*
		 * 2. Дана матрица размера M × N. Вывести все элементы матрицы. В каждой
		 * строке матрицы найти минимальный и максимальный элементы. Вывести
		 * глобальный максимальный и минимальный элементы.
		 */

		int[][] a = new int[4][4];
		int min_i = 0;
		int max_i = 0;
		int min_j = 0;
		int max_j = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < a.length; i++) {
			min_i = i; // обнуление поиска построчно
			min_j = 0; // с первого элемента J, j не меняеться, так как не
						// меняються столбцы
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
			System.out.println("Минимальное в строке " + i + " = " + a[min_i][min_j]);
			System.out.println("Максимальное в строке " + i + " = " + a[max_i][max_j]);
		}
		System.out.println();
		System.out.println("Минимальное: " + a[min_i][min_j]);
		System.out.println("Максимальное: " + a[max_i][max_j]);

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}

	public void task3() {

		/*
		 * 3. Дана квадратная матрица A порядка M. Найти сумму элементов ее
		 * главной диагонали, то есть диагонали, содержащей следующие элементы:
		 * A0,0, A1,1, A2,2, …, AM-1,M-1 и среднее арифметическое элементов ее
		 * (противоположной) побочной диагонали, то есть диагонали, содержащей
		 * следующие элементы: A0,M-1, A1,M–2, A2,M–3, …, AM-1,0.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите порядок массива А: ");
		int m = scanner.nextInt();
		scanner.close();
		int[][] a = new int[m][m];
		int sum = 0;
		int sumD = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) { // подсчет по диагонали
					sum += a[i][j];
				}
				if (i == m - j - 1) { // подсчет по противоположной диагонали
					sumD += a[i][j];
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println("Сумма диагонали: " + sum);
		System.out.println("Cреднее арифм. противоположной диагонали: " + sumD / m);
	}

	public void task4() {

		/*
		 * 4. Дана матрица размера M × N и целые числа K1 и K2 (0 ≤ K1 < K2 ≤
		 * N). Поменять местами столбцы матрицы с номерами K1 и K2.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите высоту массива (m): ");
		int m = scanner.nextInt();
		System.out.println("Введите ширину массива (n): ");
		int n = scanner.nextInt();
		System.out.println("Введите номер столбца (такойже или меньше ширины массива и больше или равно нулю) ): ");
		int k1 = scanner.nextInt();
		System.out.println("Введите номер столбца (такой же или меньше ширины массива и мешьше предыдущего числа): ");
		int k2 = scanner.nextInt();
		scanner.close();

		int[][] a = new int[m][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 99) + 10);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		if (((k1 >= 0) && (k1 <= n)) && ((k2 > k1) && (k2 <= n))) {
			for (int i = 0; i < a.length; i++) {
				int temp = a[i][k1];
				a[i][k1] = a[i][k2];
				a[i][k2] = temp;
			}

		} else {
			System.out.println("Неверный диапазон чисел");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}

	public void task5() {

		/*
		 * 5. Дана матрица размера M × N и целые числа K1 и K2. Поменять местами
		 * строки матрицы с номерами K1 и K2.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите высоту массива (m): ");
		int m = scanner.nextInt();
		System.out.println("Введите ширину массива (n): ");
		int n = scanner.nextInt();
		System.out.println("Введите номер столбца : ");
		int k1 = scanner.nextInt();
		System.out.println("Введите номер еще одного столбца: ");
		int k2 = scanner.nextInt();
		scanner.close();

		int[][] a = new int[m][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 99) + 10);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		if (((k1 >= 0) && (k1 <= n)) && ((k2 > k1) && (k2 <= n))) {
			for (int i = 0; i < a.length; i++) {
				int temp = a[k1][i];
				a[k1][i] = a[k2][i];
				a[k2][i] = temp;
			}

		} else {
			System.out.println("Неверный диапазон чисел");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}

	public void task6() {

		/*
		 * 6. Дана матрица размера M × N и целое число K (0 ≤ K ≤ M). Удалить
		 * строку матрицы с номером K.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите высоту массива (m): ");
		int m = scanner.nextInt();
		System.out.println("Введите ширину массива (n): ");
		int n = scanner.nextInt();
		System.out.println("Введите номер строки (0 ≤ K ≤ M) : ");
		int k = scanner.nextInt();
		scanner.close();

		int[][] a = new int[m][n];
		int[][] temp = new int[m - 1][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 99) + 10);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		int shift = 0; // сдвиг
		if ((k <= m) && (k >= 0)) {
			for (int i = 0; i < a.length; i++) {
				if (i == k - 1) {
					shift++; // сдвигаеться при условие тру
					continue; // пропуск итерации
				}
				for (int j = 0; j < a[i].length; j++) {
					temp[i - shift][j] = a[i][j]; // чтобы вставить в нужный
													// индекс после сдвига
				}
			}

		} else {
			System.out.println("Неверный диапазон чисел");
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void task7() {

		/*
		 * 7. Дана матрица размера M × N. Отсортировать ее так, чтоб элементы
		 * выстроились в порядке возрастания от номера (0,0) к номеру (M-1,N-1).
		 * За каждым последним элементом одной строки идет первый элемент
		 * другой.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите высоту массива (m): ");
		int m = scanner.nextInt();
		System.out.println("Введите ширину массива (n): ");
		int n = scanner.nextInt();

		scanner.close();

		int[][] a = new int[m][n];
		int[] b = new int[m * n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 99) + 10);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		// int counter = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				b[m * i + j] = a[i][j]; // m*i+j сдвижка на длинну строки
			}
			// b[counter] = a[i][j];
			// counter++; // при переходе на новую строку каунтер/индекс пойдет
			// дальше

		}

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b.length - i - 1; j++) {

				if (b[j] > b[j + 1]) {
					int tmp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tmp;
				}
			}

		}

		// counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = b[m * i + j];
				// a[i][j] = b[counter];
				// counter++;
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void task7n1() {

		// виртуализация

		/*
		 * отображение индексов одномерного и двумерного массивов
		 * закономерность: i/n - номер стоки элемента i%n - номер столбца
		 * 
		 * 
		 * 
		 */

		int arr[][] = { { 1, 2, 3 }, { 1, 2, 3 } }; // для квадратного
													// алгоритмаeclip
		boolean b = true;
		while (b) {
			b = false;
			for (int i = 0; i < arr.length * arr[0].length - 1; i++) {

				if (arr[i / arr.length][i % arr.length] > arr[(i + 1) / arr.length][(i + 1) % arr.length]) {

					int tmp = arr[i / arr.length][i % arr.length];

					arr[i / arr.length][i % arr.length] = arr[(i + 1) / arr.length][(i + 1) % arr.length];

					arr[(i + 1) / arr.length][(i + 1) % arr.length] = tmp;

					b = true;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}

	public void task10() {

		// Матрица, полученная из исходной матрицы заменой строк на столбцы.

		/*
		 * 1. Транспонировать матрицу относительно главной диагонали.
		 * 
		 * 2.Транспонировать матрицу относительно побочной диагонали
		 */

		int[][] a = new int[5][5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 89) + 10);
			}
		}

		System.out.println("Начальный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) { // замена строк на столбцы
			for (int j = i; j < a[i].length; j++) { // замена строк на столбцы
				int temp = a[j][i];
				a[j][i] = a[i][j];
				a[i][j] = temp;
				// System.out.print(a[i][a.length-1-i]+" "); //выделить саму
				// диагональ, без j
			}
		}
		
		System.out.println();
		System.out.println("Замена строк на столбцы: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 1; i < a.length; i++) { // диагональ
			for (int j = 0; j < i - 1; j++) { // диагональ
				int temp = a[j][i];
				a[j][i] = a[i][j];
				a[i][j] = temp;
			}
		}
		
		System.out.println();
		System.out.println("Отображение главной диагонали: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < a.length - 1; i++) {// побочная диагональ
			for (int j = 0; j < a.length - i - 1; j++) { // побочная диагональ
				int temp = a[i][j];
				a[i][j] = a[a.length - 1 - j][a.length - 1 - i];
				a[a.length - 1 - j][a.length - 1 - i] = temp;
			}
		}

		System.out.println();
		System.out.println("Отображение побочной диагонали: ");
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void task11() {

		/*
		 * * 3. Задана матрица (двумерный массив) A размером N x М , состоящая
		 * из действительных элементов. Получить новую матрицу путем умножения
		 * всех элементов данной матрицы на ее наибольший элемент. Сформировать
		 * вектор из элементов главной диагонали и отсортировать его по
		 * возрастанию.
		 */

		int n = 5;
		int m = 5;
		int[][] a = new int[n][m];
		int temp[][] = new int[n][m];

		int max_i = 0;
		int max_j = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 200) - 100);
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		for (int i = 0; i < a.length; i++) {
			max_i = i;
			max_j = 0;
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > a[max_i][max_j]) {
					max_i = i;
					max_j = j;
				}
			}

		}

		System.out.println();
		System.out.println("Максимальное: " + a[max_i][max_j]);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				temp[i][j] = a[i][j] * a[max_i][max_j];
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = temp[i][j];
				System.out.print(a[i][j] + " ");
			}
		}

		int mas[];
		int counter = 0;

		System.out.println();
		System.out.print("Диагонали: ");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i][i] + " ");
			counter++;
			// System.out.print(a[i][a.length - 1 - i] + " ");
			// System.out.print(a[a.length - i -1][a.length - i -1] + " ");
			// System.out.print(a[a.length - i -1][i] + " ");

		}

		System.out.println();
		mas = new int[counter];
		for (int i = 0; i < a.length; i++) {
			mas[i] = a[i][i];
		}
		
		for (int k = 0; k < mas.length - 1; k++) {
			for (int j = 0; j < mas.length - k - 1; j++) {

				if (mas[j] > mas[j+1]) {
					int tmp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = tmp;
				}
			}
		}
		System.out.println("Отсортированая диагональ: ");
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
	

	}

	/*
	 * 
	 * 
	 * 
	 * 4. Дана матрица нулевых элементов. В любом месте матрицы ставится одно
	 * значение 1. Нужно посчитать за сколько ходов единица «захватит мир», если
	 * каждый ход область ее владений расширяется на соседние элементы.
	 * 
	 * 5. В предыдущей задаче поменять условие: элементов ставится несколько и
	 * их значения указывают на количество расширений владений за 1 ход.
	 */

	public static void main(String[] args) {

		TwoDimLesson td = new TwoDimLesson();
		// td.task1();
		// td.task2();
		// td.task3();
		// td.task4();
		// td.task5();
		// td.task6();
		// td.task7();
		// td.task7n1();
		 td.task10();
		//td.task11();
	}

}
