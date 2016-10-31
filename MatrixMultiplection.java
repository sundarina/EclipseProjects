//Розумняк Дарья
//Домашка/Методы/Умножение матрицы на саму себя

import java.util.Scanner;

public class MatrixMultiplection {

	static void output(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
	}

	static int[][] randArray(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		return a;
	}

	static int[][] multiplection(int a[][], int b[][]) {

		int[][] res = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					res[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		int n = 0;
		int l = 0;
		boolean exit = false;

		do {
			
			System.out.println("Введите количество строк первой матрицы : ");
			m = scanner.nextInt();
			System.out.println("Введите количество столбцов первой матрицы: ");
			n = scanner.nextInt();
			System.out.println(
					"Введите количество столбцов второй матрицы (количество ее строк совпадает с количеством столбцов первой матрицы) : ");
			l = scanner.nextInt();

			System.out.println("Степень умножение матрицы: ");
			int count = scanner.nextInt();
		
			int[][] a = new int[m][n];
			int[][] b = new int[n][l];

			a = randArray(a);
			System.out.println("Ваш массив #1: ");
			output(a);
			System.out.println();
			b = randArray(b);
			System.out.println("Ваш массив #2: ");
			output(b);

			int[][] res = new int[m][l];
			res = multiplection(a, b);

			System.out.println();
			System.out.println("Ваша умноженная матрица: ");
			output(res);

			if (m == n && n == l) {
				for (int i = 0; i < count; i++) {
					res = multiplection(res, res);
				}

				System.out.println();
				System.out.println("Ваша умноженная матрица в " + count + " степени: ");
				output(res);
			} else {
				System.out.println("Ваша матрица не квадратная, если хотите получить ее степень -  повторите ввод");
				exit = true;
			}

		} while (exit);

		scanner.close();
	}

}
