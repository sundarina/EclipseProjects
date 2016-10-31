
//Розумняк Дарья
//Домашка/Методы/Умножение матрицы на саму себя


// Посчитать пятую степень матрицы с помощью метода, который перемножает 2 матрицы. 
//2 варианта для умножения разных матриц и для квадратной матрицы

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
				res[i][j] = 0;
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
		boolean exid = false;

		do {
			System.out.println(
					"Вы хотите умножить две разных матрицы (1) или найти заданную степень квадратной матрицы(2)? Введите ответ: ");
			int userSelection = scanner.nextInt();

			if (userSelection == 1) {
				System.out.println("Введите количество строк первой матрицы : ");
				m = scanner.nextInt();
				System.out.println("Введите количество столбцов первой матрицы: ");
				n = scanner.nextInt();
				System.out.println(
						"Введите количество столбцов второй матрицы (количество ее строк совпадает с количеством столбцов первой матрицы) : ");
				l = scanner.nextInt();

				int[][] a = new int[m][n];
				int[][] b = new int[n][l];

				a = randArray(a);
				System.out.println("Вашф матрица #1: ");
				output(a);
				System.out.println();
				b = randArray(b);
				System.out.println("Ваша матрица #2: ");
				output(b);

				int[][] res = new int[m][l];
				res = multiplection(a, b);

				System.out.println();
				System.out.println("Ваша умноженная матрица: ");
				output(res);
				break;

			} else if (userSelection == 2) {

				System.out.println("Введите сторону квадратной матрицы : ");
				m = scanner.nextInt();

				System.out.println("Степень умножение матрицы: ");
				int count = scanner.nextInt();

				int[][] a = new int[m][m];

				a = randArray(a);
				System.out.println("Вашa матрица: ");
				output(a);
				System.out.println();

				int[][] res = new int[m][m];
				res = multiplection(a, a);

				for (int i = 0; i < count - 2; i++) {
					res = multiplection(a, res);
				}

				System.out.println();
				System.out.println("Ваша умноженная матрица в " + count + " степени: ");
				output(res);
				break;
			} else
				System.out.println("Неверный ввод, повторите попытку");
			System.out.println();
			exid = true;

		} while (exid);
		scanner.close();
	}
}
