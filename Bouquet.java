
//Розумняк Дарья
//Цветочница, домашнее задание 

public class Bouquet {

//	double price;
//	int flowerLength;
//	int freshness;
//	boolean thorns;
//	String material;
//	int min;
//	int max;
//	int n;

	Flower[] flowers;
	Accessories[] accesories;
	private int flowersCount;
	private int accesoriesCount;
	private int flowerIndex = 0;
	private int accesoriesIndex = 0;

	public Bouquet(int flowersCount, int accesoriesCount) {
		this.flowersCount = flowersCount;
		this.accesoriesCount = accesoriesCount;

		this.flowers = new Flower[flowersCount];
		this.accesories = new Accessories[accesoriesCount];

	}

	public Bouquet() {
		this.flowersCount = 5;
		this.accesoriesCount = 2;
	}

	public boolean addFlower(Flower f) {
		if (flowerIndex < flowersCount) {
			this.flowers[flowerIndex] = f;
			flowerIndex++;
			return true;
		}
		return false;
	}

	public Flower[] getFlower() {
		return flowers;
	}

	public boolean addAccessories(Accessories a) {
		if (accesoriesIndex < accesoriesCount) {
			this.accesories[accesoriesIndex] = a;
			accesoriesIndex++;
			return true;
		}
		return false;
	}

	public double bouquetPrice() {
		double sum = 0;

		for (int i = 0; i < flowers.length; i++) {
			sum += flowers[i].getPrice();
		}

		for (int i = 0; i < accesories.length; i++) {
			sum += accesories[i].getPrice();
		}
		return sum;
	}

//	public void freshSort() {
//		for (int i = 0; i < flowers.length; i++) {
//			for (int j = 0; j < flowers.length - i - 1; j++) {
//
//				if (flowers[j].getFreshness() > flowers[j + 1].getFreshness()) {
//					Flower tmp = flowers[j];
//					flowers[j] = flowers[j + 1];
//					flowers[j + 1] = tmp;
//				}
//			}
//		}
//
//	}

	public void randomFlowers() { // ?

		for (int i = 0; i < flowers.length; i++) {
			int index = (int) (Math.random() * 100);
			if (index > 0 && index <= 5) {
				addFlower(new ArtificialFlower());
			}

			if (index > 5 && index <= 30) {
				addFlower(new LiveFlower());
			}

			if (index > 30 && index <= 100) {
				addFlower(new Roses());
			}
		}
	}

	public Flower lengthDiapason(int min, int max) {
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i].flowerLength >= min && flowers[i].flowerLength <= max) {
				return flowers[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int flowersCount = 3;
		int accesoriesCount = 1;

		int min = 30;
		int max = 50;

		Flower flower = new Flower(25, 40, "Цветущие цветы");
		LiveFlower liveFlower = new LiveFlower(30, 35, 9, "Пoлевые цветы");
		Roses rose = new Roses(50, 65, 10, true, "Королевские розы");
		ArtificialFlower artificialFlower = new ArtificialFlower(35, 45, "Пластик", "Вечные цветы");
		Accessories accessories = new Accessories(20, "Ленточки");

		Bouquet bouquet = new Bouquet(flowersCount, accesoriesCount);
		bouquet.addFlower(liveFlower);
		bouquet.addFlower(artificialFlower);
		bouquet.addFlower(rose);
		bouquet.addAccessories(accessories);

		System.out.println("Цена букета: " + bouquet.bouquetPrice());
		System.out.println();

		System.out.println("Рейтинг свежести: ");
		//bouquet.freshSort();
		Flower[] flowerArray = bouquet.getFlower();
		for (int i = flowerArray.length - 1; i >= 0; i--) {
			System.out.println(flowerArray[i].getGrade());
		}

		System.out.println();
		Flower f = bouquet.lengthDiapason(min, max);
		// System.out.println(f.flowerLength); // why is this works ?
		System.out.println(
				"Сорт " + f.getGrade() + " соответствует заданному диапазону и имеет длинну: " + f.getFlowerLength());
	}

}
