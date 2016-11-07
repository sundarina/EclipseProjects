import java.lang.*;

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

	public void randomFlowers() { // ?

		for (int i = 0; i < flowers.length; i++) {
			int index = (int) (Math.random() * 100);
			if (index > 0 && index <= 5) {
				addFlower(new ArtificialFlower()); // (price, flowerLength,
													// material)
			}

			if (index > 5 && index <= 30) {
				addFlower(new LiveFlower()); // (price, flowerLength, freshness)
			}

			if (index > 30 && index <= 100) {
				addFlower(new Roses()); // (price, flowerLength, freshness,
										// thorns)
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
		
		System.out.println(bouquet.bouquetPrice());
		
		bouquet.freshSort();
		
		Flower[] flowerArray = bouquet.getFlower();
		for(int i = 0; i < flowerArray.length; i++) {
			System.out.println(flowerArray[i].getGrade());
		}
		
		Flower f = bouquet.lengthDiapason(40, 60);
		//System.out.println(f.flowerLength); why is this works ?
		System.out.println(f.getFlowerLength());
		
		

	}

}

class Accessories {

	private double price;
	public String accessoriesName;

	public Accessories(double price, String accessoriesName) {
		this.price = price;
		this.accessoriesName = accessoriesName;
	}

	public Accessories(double price) {
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

	protected double price;
	protected int flowerLength;
	protected int freshness;
	protected String grade;

	public Flower(double price, int flowerLength, String grade) {
		this.price = price;
		this.flowerLength = flowerLength;
		this.freshness = 8;
		this.grade = grade;
	}

	public Flower() {
		this.price = 22.0;
		this.flowerLength = 5;
		this.freshness = 8;
		this.grade = "Любимые цветы";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		}
	}

	public int getFreshness() {
		return freshness;
	}

	public void setFreshness(int freshness) {
		if (freshness >= 0 && freshness <= 10) {
			this.freshness = freshness;
		}
	}
	
	public int getFlowerLength() {
		return flowerLength;
	}
	
	public void setFlowerLength(int flowerLength) {
		if (flowerLength > 0) {
			this.flowerLength = flowerLength;
		}
	}
	
	public String getGrade() {
		return grade;
	}
}

class LiveFlower extends Flower {

	protected int freshness;
	

	public LiveFlower(double price, int flowerLength, int freshness, String grade) {
		super(price, flowerLength, grade);
		this.freshness = freshness;
	}

	public LiveFlower() {
		super();
		this.freshness = 10;
	}
}

class ArtificialFlower extends Flower {

	String material;

	public ArtificialFlower(double price, int flowerLength, String material, String grade) {
		super(price, flowerLength, grade);
		this.material = material;
		this.freshness = 0;
	}

	public ArtificialFlower(double price, int flowerLength, String grade) {
		super(price, flowerLength, grade);
		this.freshness = 0;
	}

	public ArtificialFlower() {
		super();
		this.freshness = 0;
	}

}

class Roses extends LiveFlower {

	boolean thorns;

	public Roses(double price, int flowerLength, int freshness, boolean thorns, String grade) {
		super(price, flowerLength, freshness, grade);
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

	public Chamomile(double price, int flowerLength, int freshness, String grade, int petalsNum) {
		super(price, flowerLength, freshness, grade);
		this.petalsNum = petalsNum;
	}

	public Chamomile() {
		super();
		this.petalsNum = 9;
	}
}
