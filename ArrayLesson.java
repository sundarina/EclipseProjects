
// Розумняк Дарья
//Домашнее задание 13.10.2016, тема 8

import java.util.Scanner;


public class ArrayLesson {

	public void taskMass0() {

		/* Заполнить масив n длинны случайными цыфрами от 20 до 50 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		double list[] = new double[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 30 + 20);
			// (0,1)*30 + 20 = (0, 30 )+ 20;
			System.out.print(list[i] + " ");
		}
	}

	public void taskMass1() {

		/*
		 * 1. Дано целое число N (> 0). Сформировать и вывести целочисленный
		 * массив размера N, содержащий N первых положительных нечетных чисел:
		 * 1, 3, 5, … .
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];
		list[0] = 1;
		for (int i = 0; i < list.length; i++) {
			list[i] = 2 * i + 1;
			System.out.print(list[i] + " ");
		}

	}

	public void taskMass2() {

		/* 2. Дан массив размера N. Вывести его элементы в обратном порядке. */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] += i;
			System.out.print(list[i] + " ");
		}
		System.out.println();
		for (int i = n - 1; i >= 0; i--) {

			System.out.print(list[i] + " ");
		}
	}

	public void taskMass3() {
		/*
		 * 3. Дан массив размера N. Найти минимальный и максимальный элементы.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];
		int min;
		int max;
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
			System.out.print(list[i] + " ");
		}
		System.out.println();

		min = 0;
		for (int j = 1; j < list.length; j++) {
			if (list[j] < list[min]) {
				min = j;

			}
		}
		System.out.print("Минимальное: " + list[min]);

		max = 0;
		for (int j = 1; j < list.length; j++) {
			if (list[j] > list[max]) {
				max = j;

			}
		}

		System.out.println();
		System.out.print("Максимальное: " + list[max]);
	}

	public void taskMass4() {

		/*
		 * 4/ . Дан целочисленный массив размера N. Вывести вначале все
		 * содержащиеся в данном массиве четные числа в порядке возрастания их
		 * индексов, а затем — все нечетные числа в порядке убывания их
		 * индексов.Также вывести количество четных и нечетных членов массива.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();
		int positCount = 0;
		int negatCount = 0;
		int list[] = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 50);
			System.out.print(list[i] + ",");
		}
		System.out.println();
		System.out.println("Четные: ");
		System.out.println("-->");
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				positCount++;
				System.out.print(list[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Нечетные: ");
		System.out.println("<--");
		for (int i = list.length - 1; i >= 0; i--) {
			if (list[i] % 2 != 0) {
				System.out.print(list[i] + " ");
				negatCount++;
			}
		}
		System.out.println();
		System.out.println("Четных: " + positCount + "    Нечетных: " + negatCount);
	}

	public void taskMass5() {

		/*
		 * 5. Дан массив A размера N (N — четное число). Вывести его элементы с
		 * четными номерами в порядке возрастания номеров: A2, A4, A6, …, AN.
		 * Условный оператор не использовать.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите четное количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();
		int list[] = new int[n];
		if (n % 2 == 0) {
			for (int i = 0; i < list.length; i++) {
				list[i] = (int) (Math.random() * 50);
				System.out.print(list[i] + ",");
			}

			System.out.println();
			for (int i = 1; i < list.length; i = i + 2) {
				System.out.print(list[i] + " ");
			}
		} else {
			System.out.println("Число не отвечает требуемому диапазону");
		}
	}

	public void taskMass6() {

		/*
		 * 6. Дан массив ненулевых целых чисел размера N. Проверить, чередуются
		 * ли в нем положительные и отрицательные числа. Если чередуются, то
		 * вывести 0, если нет, то вывести порядковый номер первого элемента,
		 * нарушающего закономерность.
		 */

		int counter = 0;
		int list[] = new int[] { -1, 1, -2, -4, 5, -9, 7, -9, -8 }; //рандом почти никогда не выдает похожей последовательности
		int previous = list[0];
		for (int i = 0; i < list.length; i++) {
			
			System.out.print(list[i] + ",");
		}

		System.out.println();
		for (int i = 1; i < list.length; i++) { //чтобы сравнивать с предыдущим начинаем с 1
			if ((previous > 0 && list[i] < 0) || (previous < 0 && list[i] > 0)) { 
				
				previous = list[i];
				counter++;
				// if(mass[i -1] * mass[i] > 0){   //если большие числа, то условие переполниться
				//n = i;
				//break;}} //чтобы найти первый сбой в последовательности и прекратить выполнение
				//sysout(n)
			} else {
				break;
			}
		}
		System.out.println();
		System.out.println(counter + 1);

	}

	public void taskMass7() {

		/*
		 * 7. Дан целочисленный массив размера N. Найти количество различных
		 * элементов в данном массиве.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int counter = 0;
		int list[] = new int[n];
		int listNew[] = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = (int) (Math.random() * 100);
			System.out.print(list[i] + ",");
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			boolean exists = false;
			for (int j = 0; j < counter; j++) {
				if (listNew[j] == list[i]) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				listNew[counter] = list[i];
				counter++;

			}
		}
		System.out.println("Количество уникальных чисел: " + counter);
	}

	public void taskMass8() {

		/*
		 * 8. Даны два массива A и B одинакового размера N. Сформировать новый
		 * массив C того же размера, каждый элемент которого равен максимальному
		 * из элементов массивов A и B с тем же индексом.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int listOne[] = new int[n];
		int listSecond[] = new int[n];
		int listThird[] = new int[n];
		for (int i = 0; i < n; i++) {
			listOne[i] = (int) (Math.random() * 100);
			System.out.print(listOne[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			listSecond[i] = (int) (Math.random() * 100);
			System.out.print(listSecond[i] + " ");
		}
		System.out.println();
		System.out.println("Максимальные из 2 массивов: ");
		for (int i = 0; i < n; i++) {
			if (listOne[i] >= listSecond[i]) {
				listThird[i] = listOne[i];
			} else if (listOne[i] < listSecond[i]) {
				listThird[i] = listSecond[i];
			}
			System.out.print(listThird[i] + " ");
		}
	}

	public void taskMass9() {

		/*
		 * 9. Даны два массива A и B, элементы которых упорядочены по
		 * возрастанию. Объединить эти массивы так, чтобы результирующий массив
		 * C остался упорядоченным по возрастанию.
		 * 
		 */

		int listOne[] = new int[] { 1, 7, 99 };
		int listSecond[] = new int[] { 4, 6, 78, 88 };
		int n = listOne.length + listSecond.length;
		int listThird[] = new int[n];
		for (int i = 0; i < listOne.length; i++) {
			System.out.print(listOne[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < listSecond.length; i++) {
			System.out.print(listSecond[i] + " ");

		}
		int massposs1 = 0;
		int massposs2 = 0;
		System.out.println();
		for (int i = 0; i < listThird.length; i++) {
			if (massposs1 >= listOne.length) {
				listThird[i] = listSecond[massposs2];
				massposs2++;
			} else if (massposs2 >= listSecond.length) {
				listThird[i] = listOne[massposs1];
				massposs1++;
			} else if (listOne[massposs1] > listSecond[massposs2]) {
				listThird[i] = listSecond[massposs2];
				massposs2++;
			} else {
				listThird[i] = listOne[massposs1];
				massposs1++;
			}

		}
		for (int i = 0; i < listThird.length; i++) {
			System.out.print(listThird[i] + " ");
		}
	}

	public void taskMass10() {

		/*
		 * 10. Дан массив размера N. Поменять порядок его элементов на обратный.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел в массиве: ");
		int n = scanner.nextInt();
		scanner.close();

		int list[] = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = (int) (Math.random() * 100);
			System.out.print(list[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < (n / 2); i++) {
			int t = list[i];
			list[i] = list[n - i - 1];
			list[n - i - 1] = t;

		}
		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void main(String[] args) {

		ArrayLesson aL = new ArrayLesson();
		// aL.taskMass0();
		// aL.taskMass1();
		// aL.taskMass2();
		// aL.taskMass3();
		// aL.taskMass4();
		//aL.taskMass5();
		 //aL.taskMass6();
		// aL.taskMass7();
		// aL.taskMass8();
		//aL.taskMass9();
		// aL.taskMass10();
	}

}
