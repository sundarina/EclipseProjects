//Розумняк Дарья 
//Домашнее задание, строки 

import java.util.Arrays;
import java.util.Scanner;

public class StringLesson {

	public void task1() {

		/*
		 * 1. С клавиатуры задается строка. Заменить в заданной строке все
		 * пробелы знаками подчеркивания.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String str = scanner.nextLine();
		scanner.close();

		str = str.replaceAll(" ", "_");
		System.out.println(str);

	}

	public void task2() {

		/*
		 * 2. С клавиатуры задается строка. Определить длину строки в символах и
		 * в словах (разделителем между словами считать знак пробела). Вывести
		 * заданную строку в обратном порядке по символам и по словам. + учесть
		 * множественные пробелы (много пробелов подряд)
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String str = scanner.nextLine();
		scanner.close();

		String s[] = str.split(" ");
		char ch[] = str.toCharArray();
		int counter = 0;

		System.out.println();
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]);
			if (!s[i].equals("")) {
				counter++;
			}
		}
		System.out.println();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		System.out.println("Длинна строки: " + str.length() + ", количество слов: " + counter);
	}

	public void task3() {

		/*
		 * 3. Дан массив текстовых значений. Найти самый длинный элемент
		 * массива. Создать предложение из входящих в массив строк, самый
		 * длинный элемент массива разместить в начале предложения.
		 */

		String str[] = { "мама", "мыла", "окошко", "тряпкой" };
		int max = 0;

		for (int i = 1; i < str.length; i++) {
			if (str[max].length() < str[i].length()) {
				max = i;
			}
		}

		System.out.println(str[max] + " ");
		String tmp = str[0];
		str[0] = str[max];
		str[max] = tmp;

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");

		}

	}

	public void task4() {

		/* 4. Поменять все буквы на противоположный регистр. */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово: ");
		String str = scanner.nextLine();
		scanner.close();

		String mas[] = str.split("");
		String temp[] = new String[mas.length];

		for (int i = 0; i < mas.length; i++) {
			temp[i] = mas[i]; // заполняем новый массив элементами из основного
		}

		for (int i = 0; i < mas.length; i++) {
			if (temp[i].toLowerCase().equals(mas[i])) { // то, что и так уже в
														// нижнем регистре - не
														// измениться, то, что
														// было в верхнем не
														// будет равно элементу
														// из основного массива
				mas[i] = mas[i].toUpperCase();
			} else if (temp[i].toUpperCase().equals(mas[i])) {
				mas[i] = mas[i].toLowerCase();
			}
			System.out.print(mas[i]);
		}
	}

	public void task5() {

		/*
		 * 5. Поставить слова в предложении в алфавитном порядке по первой букве
		 * (с учетом множественности пробела).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово: ");
		String str = scanner.nextLine();
		scanner.close();

		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			Arrays.sort(s);
			if (!s[i].equals("")) {
				System.out.print(s[i] + " ");
			}

		}

	}

	public void task6() {

		/*
		 * 6. Поменять начало слов на буквы противоположного регистра.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение: ");
		String str = scanner.nextLine();
		scanner.close();

		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {

			if (!s[i].equals("")) {
				String mas[] = s[i].split("");
				String temp[] = new String[mas.length];

				for (int j = 0; j < mas.length; i++) {
					temp[j] = mas[j];
					if (temp[0].toLowerCase().equals(mas[0])) {
						mas[0] = mas[0].toUpperCase();
					} else if (temp[0].toUpperCase().equals(mas[0])) {
						mas[0] = mas[0].toLowerCase();
					}
					System.out.print(mas[j]);
				}
			}
		}
	}

	public void task7() {

		/*
		 * 7. В задании 5 учитывать все буквы слов.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слово: ");
		String str = scanner.nextLine();
		scanner.close();

		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			Arrays.sort(s);
			if (!s[i].equals("")) {
				System.out.print(s[i] + " ");
			}

		}

	}

	public void task8() {

		/*
		 * 8. Сделать транслитератор (если вводится текст на английском, тогда
		 * транслитерировать его на русский и наоборот) 2 масива соотвествия
		 * англ и рус, в одинаковой позиии, потом соотвественно заменять
		 */
		
		
		//я не сделала английско-русскую транслитерацию, принцип тот же , только в английском языке слишком много сочетаний букв!

		String rus[] = { "a", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с",
				"т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я" };
		String eng[] = { "a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s",
				"t", "u", "f", "kh", "ts", "ch", "sh", "shch", "'", "ui", "'", "e", "yu", "ya" };
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение на английском или русском: ");
		String str = scanner.nextLine();
		scanner.close();

		String symbol[] = new String[str.length()];
		symbol = str.split("");

		for (int i = 0; i < symbol.length; i++) {
			for (int j = 0; j < rus.length; j++) {
				if (symbol[i].equals(eng[j])) {
					symbol[i] = symbol[i].replace(eng[j], rus[j]);

				} else if (symbol[i].equals(rus[j])) {
					symbol[i] = symbol[i].replace(rus[j], eng[j]);
				}
			}
		}
		for (int i = 0; i < symbol.length; i++) {

			System.out.print(symbol[i]);
		}

	}

	public static void main(String[] args) {

		StringLesson sl = new StringLesson();
		// sl.task1();
		// sl.task2();
		// sl.task3();
		// sl.task4();
		// sl.task5();
		// sl.task6();
		// sl.task7();
		//sl.task8();
	}

}
