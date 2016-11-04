import Flowers.LiveFlowers;

public class Bouquet {

	/*
	 * bouquet flowers accessories live artificial искуственные price freshness
	 * свежесть material length sorting the price of the bouquet цена букета
	 * roses chamomile ромашка thorns шипы the number of petals колич лепестков
	 */

	public static void main(String[] args) {

	}

}

class Acccessories {

	private double price;
	public String acccessoriesName;

	public Acccessories(int price, String acccessoriesName) {
		this.price = price;
		this.acccessoriesName = acccessoriesName;
	}

	public Acccessories(int price) {
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

class LiveFlowers extends Flowers {

		private int freshness;
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
}

class ArtificialFlowers extends Flowers {

	private static int freshness = 0;
	String material;

	public ArtificialFlowers(int price, int flowerLength, int freshness, String material) {
		super(price, flowerLength);
		this.material = material;
	}

	public ArtificialFlowers(int price, int flowerLength, int freshness) {
		super(price, flowerLength);
	}
}

class Roses extends LiveFlowers {
	
	boolean thorns;
	
	public Roses(int price, int flowerLength, int freshness, boolean thorns) {
		super(price, flowerLength, freshness);
		this.thorns = thorns;
	}
}
	