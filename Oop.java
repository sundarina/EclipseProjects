
public class Oop {

	public static void main(String[] args) {

		Mebel m = new Mebel("Green");
		// m.price = 100;
		m.setPrice(100);
		System.out.println(m.getPrice());
		m.broke();
		Stol s = new Stol(4, "Blue");
		s.setPrice(10);
		System.out.println(s.getPrice());
		s.broke();
		Stol s1 = new Stol();
		System.out.println(s1.color);
	}
}

class Mebel {

	private double price;
	String color;

	public Mebel(String color) {
		this.color = color;

	}

	// примери инкапсуляции

	public double getPrice() { // получения значения , того же типа // что и
								// поле
		return price;
	}

	public void setPrice(double price) { // установка значения
		if (price >= 0) {
			this.price = price; // присваем в поле обьекта значение
		} else {
			this.price = 0; // отритцательное число нельзя будет установить
		}
	}

	public void broke() {
		System.out.println("Бдишшшш");
	}
}

class Stol extends Mebel {
	// все поля и методі прописались неявно

	int num;
	
	public Stol(int num, String color) {
		super(color); //вызов конструктора родителя ибо нет по-умолчанию 
		this.num = num;
	}
	
	public Stol() {
		super("Белый");		//можем явно задать параметры //обязательно т.к в род классе есть явный конструктор 
		num = 18;
		this.setPrice(20);
	}

	@Override

	// пример полиморфизма

	public void broke() {
		System.out.println("Бабах");
	}
}