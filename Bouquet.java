
/*1. Цветочница. Определить иерархию цветов. Создать
несколько объектов-цветов. Собрать букет (используя
аксессуары) с определением его стоимости. Провести
сортировку цветов в букете на основе уровня свежести. Найти
цветок в букете, соответствующий заданному диапазону длин
стеблей. Создать букет из цветов трех видов, где выбор каждого
цветка букета происходит случайно. Первый выбирается с
вероятностью 30 %, второй – 5 %, третий – 65 %.*/

public class Bouquet {

	double price;
	int flowerLength;
	int freshness;
	boolean thorns;
	String material;
	int min;
	int max;
	int n;

	Flowers[] flowers;
	Accessories[] accesories;
	int flowersCount;
	int accesoriesCount;
	int flowerIndex = 0;
	int accesoriesIndex = 0;

	public Bouquet(int flowersCount, int accesoriesCount) {
		this.flowersCount = flowersCount;
		this.accesoriesCount = accesoriesCount;

		this.flowers = new Flowers[flowersCount];
		this.accesories = new Accessories[accesoriesCount];

	}

	public Bouquet() {
		// TODO Auto-generated constructor stub
	}

	public boolean addFlower(Flowers f) {
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
		
		for (int i = 0; i < accesories.length; i++){
			sum += accesories[i].getPrice(); 
		}
		return sum;
	}

	public void freshSort(Bouquet[] bouquet, int freshness) {

	}

	public Flowers lengthDiapason(int min, int max) {
		for (int i = 0; i < flowers.length; i++ ) {
			if (flowers[i].flowerLength >= min && flowers[i].flowerLength <= max){
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

class Flowers {

	private double price;
	int flowerLength;

	public Flowers(int price, int flowerLength) {
		this.price = price;
		this.flowerLength = flowerLength;
	}

	public Flowers() {

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
}

class LiveFlowers extends Flowers {

	protected int freshness;
	String grade;

	public LiveFlowers(int price, int flowerLength, int freshness, String grade) {
		super(price, flowerLength);
		this.freshness = freshness;
		this.grade = grade;
	}

	public LiveFlowers(int price, int flowerLength, int freshness) {
		super(price, flowerLength);
		this.freshness = freshness;
	}

	public LiveFlowers() {
		super();
		// this.freshness = freshness;
		// this.grade = grade;
	}

	public int getFreshness() {
		return freshness;
	}

	public void setFreshness(int freshness) {
		if (freshness >= 1 && freshness <= 10) {
			this.freshness = freshness;
		}
		this.freshness = -1;
	}
}

class ArtificialFlowers extends Flowers {

	static final int freshnessArtificial = 0;
	String material;

	public ArtificialFlowers(int price, int flowerLength, int freshnessArtificial, String material) {
		super(price, flowerLength);
		this.material = material;
	}

	public ArtificialFlowers(int price, int flowerLength, int freshnessArtificial) {
		super(price, flowerLength);

	}
}

class Roses extends LiveFlowers {

	boolean thorns;

	public Roses(int price, int flowerLength, int freshness, boolean thorns) {
		super(price, flowerLength, freshness);
		this.thorns = thorns;
	}

	public Roses() {
		super();
	}
}

class Chamomile extends LiveFlowers {

	int petalsNum;

	public Chamomile(int price, int flowerLength, int freshness, String grade, int petalsNum) {
		super(price, flowerLength, freshness, grade);
		this.petalsNum = petalsNum;
	}

	public Chamomile() {
		super();
	}
}
