
//Розумняк Дарья
//Цветочница, домашнее задание

/*1. Цветочница. Определить иерархию цветов. Создать
несколько объектов-цветов. Собрать букет (используя
аксессуары) с определением его стоимости. Провести
сортировку цветов в букете на основе уровня свежести. Найти
цветок в букете, соответствующий заданному диапазону длин
стеблей. Создать букет из цветов трех видов, где выбор каждого
цветка букета происходит случайно. Первый выбирается с
вероятностью 30 %, второй – 5 %, третий – 65 %.*/
//0.3  0.05  0.65

public class Flower {

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

class Accessories {

	private double price;
	public String accessoriesName;

	public Accessories(double price, String accessoriesName) {
		this.price = price;
		this.accessoriesName = accessoriesName;
	}

	public Accessories() {
		this.price = 25;
		this.accessoriesName = "Обвертка";

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
