import java.util.Scanner;

public class FigureTask3 {

	public static void main(String[] args) {
		
		PointClass point = null;
		LineClass line = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите координату X: ");
		String xPoint = scanner.nextLine();
		System.out.println("Ведите координату Y: ");
		String yPoint = scanner.nextLine();
		try {
			 point = new PointClass(xPoint, yPoint);
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

		System.out.println("Введите координату X: ");
		String xLine = scanner.nextLine();
		System.out.println("Ведите координату Y: ");
		String yLine = scanner.nextLine();
		System.out.println("Введите координату X1: ");
		String x1Line = scanner.nextLine();
		System.out.println("Ведите координату Y1: ");
		String y1Line = scanner.nextLine();

		try {
			line = new LineClass(xLine, yLine, x1Line, y1Line);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		line.isOnLine(point);
		scanner.close();
	}

}

/*
 * Написать систему классов, реализующие фигуры на плоскости (точка, отрезок,
 * квадрат, прямоугольник, треугольник). Предусмотреть инкапсуляцию.
 * Предусмотреть несколько конструкторов и методов определения размера.
 * Использовать для связи отношение Has-a.
 */

class PointClass {
	protected int x;
	protected int y;

	public PointClass(String x, String y) throws Exception {
		if (this.validate(x)) {
			this.x = Integer.parseInt(x);
		} else {
			throw new Exception("Неверный формат x");
		}

		if (this.validate(y)) {
			this.y = Integer.parseInt(y);
		} else {
			throw new Exception("Неверный формат y");
		}

	}

	/*public int getX() {
		return x;
	}

	public void setX(int x) {

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {

	}*/

	protected boolean validate(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

class LineClass extends PointClass {

	int x2;
	int y2;

	public LineClass(String x, String y, String x2, String y2) throws Exception {
		
		super(x, y);

		if (this.validate(x2)) {
			this.x2 = Integer.parseInt(x2);
		} else {
			throw new Exception("Неверный формат x");
		}

		if (this.validate(y2)) {
			this.y2 = Integer.parseInt(y2);
		} else {
			throw new Exception("Неверный формат y");
		}
	}

	public boolean isOnLine(PointClass p) {
		
		if((y - y2)*p.x + (x2 - x)*p.y + (x*y2 - x2*y) == 0) {
		
		//if ((p.x - x) / (x1 - x) == (p.y - y) / (y1 - y)) {
			System.out.println("Точка лежит на линии");
		} else {
			System.out.println("Точка НЕ лежит на линии");
		}
		return true;
	}
}
