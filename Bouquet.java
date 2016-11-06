
/*1. Цветочница. Определить иерархию цветов. Создать
несколько объектов-цветов. Собрать букет (используя
аксессуары) с определением его стоимости. Провести
сортировку цветов в букете на основе уровня свежести. Найти
цветок в букете, соответствующий заданному диапазону длин
стеблей. Создать букет из цветов трех видов, где выбор каждого
цветка букета происходит случайно. Первый выбирается с
вероятностью 30 %, второй – 5 %, третий – 65 %.*/
//0.3  0.05  0.65

public class Bouquet {

	double price;
	int flowerLength;
	int freshness;
	boolean thorns;
	String material;
	int min;
	int max;
	int n;

	Flower[] flowers;
	Accessories[] accesories;
	int flowersCount;
	int accesoriesCount;
	int flowerIndex = 0;
	int accesoriesIndex = 0;

	public Bouquet(int flowersCount, int accesoriesCount) {
		this.flowersCount = flowersCount;
		this.accesoriesCount = accesoriesCount;

		this.flowers = new Flower[flowersCount];
		this.accesories = new Accessories[accesoriesCount];

	}

	public Bouquet() {
		
		this.flowersCount = flowersCount;
		this.accesoriesCount = accesoriesCount;

		this.flowers = new Flower[flowersCount];
		this.accesories = new Accessories[accesoriesCount];
	}

	public boolean addFlower(Flower f) {
		if (flowerIndex < flowersCount) {
			this.flowers[flowerIndex] = f;
			flowerIndex++;
			return true;
		}
		return false;
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

	public void freshSort() {
		for (int i = 0; i < flowers.length; i++) {
			for (int j = 0; j < flowers.length - i - 1; j++) {

				if (flowers[j].getFreshness() > flowers[j + 1].getFreshness()) {
					Flower tmp = flowers[j];
					flowers[j] = flowers[j + 1];
					flowers[j + 1] = tmp;
				}
			}
		}

	}

	public void randomFlowers() {
		for (int i = 0; i < flowers.length; i++) {
			int index = (int) (Math.random() * 100);
			if (index > 0 && index <= 5) {
				addFlower(new Flower());
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

	}

}

class Accessories {

	private double price;
	public String accessoriesName;

	public Accessories(int price, String accessoriesName) {
		this.price = price;
		this.accessoriesName = accessoriesName;
	}

	public Accessories(int price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}
}

class Flower {

	private double price;
	int flowerLength;
	protected int freshness;

	public Flower(int price, int flowerLength) {
		this.price = price;
		this.flowerLength = flowerLength;
	}

	public Flower() {
		this.price = 22.0;
		this.flowerLength = 5;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = -1;
		}
	}

	public int getFreshness() {
		return freshness;
	}

	public void setFreshness(int freshness) {
		if (freshness >= 0 && freshness <= 10) {
			this.freshness = freshness;
		}
		this.freshness = -1;
	}
}

class LiveFlower extends Flower {

	protected int freshness;
	String grade;

	public LiveFlower(int price, int flowerLength, int freshness, String grade) {
		super(price, flowerLength);
		this.freshness = freshness;
		this.grade = grade;
	}

	public LiveFlower(int price, int flowerLength, int freshness) {
		super(price, flowerLength);
		this.freshness = freshness;
	}

	public LiveFlower() {
		super();
		this.freshness = 10;
	}
}

class ArtificialFlower extends Flower {

	String material;

	public ArtificialFlower(int price, int flowerLength, String material) {
		super(price, flowerLength);
		this.material = material;
		this.freshness = 0;
	}

	public ArtificialFlower(int price, int flowerLength) {
		super(price, flowerLength);
		this.freshness = 0;
	}

	public ArtificialFlower() {
		super();
		this.freshness = 0;
	}

}

class Roses extends LiveFlower {

	boolean thorns;

	public Roses(int price, int flowerLength, int freshness, boolean thorns) {
		super(price, flowerLength, freshness);
		this.thorns = thorns;
	}

	public Roses() {
		super();
		this.freshness = 9;
		this.thorns = false;
	}
}

class Chamomile extends LiveFlower {

	int petalsNum;

	public Chamomile(int price, int flowerLength, int freshness, String grade, int petalsNum) {
		super(price, flowerLength, freshness, grade);
		this.petalsNum = petalsNum;
	}

	public Chamomile() {
		super();
		this.petalsNum = 9;
	}
}
