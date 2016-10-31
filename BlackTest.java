
public class BlackTest {

	public void swap(int a, int b) {
		int tmp;
		if (a == b) // отказываемся от замены одинаковых
			return;
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("%d <-> %d\n", a, b);
	}

	public void taskSort() {
		int list[] = { 3, 5, 1, 2, 4 };

		int max, min, max_index, min_index, i, k;
		k = list.length - 1;

		for (i = 0; i < list.length - 1; i++) {
			max = min = list[i];
			max_index = min_index = i;

			for (int j = i + 1; j < k; j++) { // сбегаються с 2 сторон

				if (list[j] > max) {
					max = list[j];
					max_index = j;
				}
				if (list[j] < min) {
					min = list[j];
					min_index = j;
				}

			}

			if (max_index == i && min_index != k) {

				swap(list[k], list[max_index]);
				swap(list[i], list[min_index]);
			}
			if (min_index == k && max_index != i) {
				swap(list[i], list[min_index]);
				swap(list[k], list[max_index]);
			}
			if (min_index == k && max_index == i) {
				swap(list[k], list[i]);
			}
			if (min_index != k && max_index != i) {
				swap(list[k], list[max_index]);
				swap(list[i], list[min_index]);
			}
			k--; // сокращаем границу цикла

		}

		for (int l = 0; l < list.length; l++) {
			System.out.print(list[l] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackTest bt = new BlackTest();
		bt.taskSort();
	}
}