

public class CatTask1 {

	/*
	 * 1. Написать класс Коты. Предусмотреть наличие 4 полей, 2 конструкторов и
	 * 2 методов. Предусмотреть инкапсуляцию. Создать несколько экземпляров
	 * этого класса и вывести информацию про них на экран, предусмотрев
	 * соответствующий метод.
	 */

	String name;
	String color;
	private int year; //инкапсуляция
	int price;

	public CatTask1(String name) {
		this.name = name;
	}

	public CatTask1(String name, String color) {
		this.name = name;
		this.color = color;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 0) {
			this.year = year;
		} else {
			this.year = 0;
		}
	}
	
	public void catVoice() {
		System.out.println("Мяяяяяяууууу");
	}
	
	public void catFood(int year) {
		this.year = year;
		//this.price = price;
		if(year <= 1) {
			System.out.println("Кот ест Молоко");
			price = 20;
		} else if ( year > 1 && year < 5) {
			System.out.println("Кот ест Рыбу");
			price = 100;
		} else {
			System.out.println("Кот ест Сыр Рокфор");
			price = Integer.valueOf("9000");
		}
	}
	

	public static void main(String[] args) {
		
		CatTask1 matilda = new CatTask1("Maтильда");
		matilda.catVoice();
		
		CatTask1 barsik = new CatTask1("Барсик", "Рыжий");
		barsik.catFood(4);
		System.out.println(barsik.price);
		
		CatTask1 baron = new CatTask1("Барон");
		baron.catFood(99);
		System.out.println(baron.price);
	}

}
