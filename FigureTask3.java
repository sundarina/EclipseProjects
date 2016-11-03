import java.util.Scanner;

/*
 * Написать систему классов, реализующие фигуры на плоскости (точка, отрезок,
 * квадрат, прямоугольник, треугольник). Предусмотреть инкапсуляцию.
 * Предусмотреть несколько конструкторов и методов определения размера.
 * Использовать для связи отношение Has-a.
 */

public class FigureTask3 {

	public static void main(String[] args) {

		PointClass point = null;
		LineClass line = null;
		SquareClass square = null;
		TriangleClass triangle = null;
		RectangleClass rectangle = null;

		Scanner scanner = new Scanner(System.in);

		// точка

		System.out.println("Введите координату точки (X): ");
		String xPoint = scanner.nextLine();
		System.out.println("Ведите координату точки (Y): ");
		String yPoint = scanner.nextLine();
		try {
			point = new PointClass(xPoint, yPoint);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// линия

		System.out.println("Введите координату линии по X: ");
		String xLine = scanner.nextLine();
		System.out.println("Ведите координату линии по Y: ");
		String yLine = scanner.nextLine();
		System.out.println("Введите координату линии по X1: ");
		String x1Line = scanner.nextLine();
		System.out.println("Ведите координату линии по  Y1: ");
		String y1Line = scanner.nextLine();

		try {
			line = new LineClass(xLine, yLine, x1Line, y1Line);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		line.isOnLine(point);

		double lenghtLn = line.lineLenght(Integer.parseInt(xLine), Integer.parseInt(yLine), Integer.parseInt(x1Line),
				Integer.parseInt(y1Line));

		System.out.printf("Длинна линии: " + "%8.2f ", lenghtLn);
		System.out.println();

		// квадрат

		square = new SquareClass(lenghtLn);
		double areaSqr = square.squareArea(lenghtLn);
		System.out.printf("Площадь квадрата: " + "%8.2f ", areaSqr);

		// трeугольник

		System.out.println("Введите координату треугольника по X: ");
		String xTriangle = scanner.nextLine();
		System.out.println("Ведите координату треугольника  по Y: ");
		String yTriangle = scanner.nextLine();
		System.out.println("Введите координату треугольника по  X1: ");
		String x1Triangle = scanner.nextLine();
		System.out.println("Ведите координату треугольника по Y1: ");
		String y1Triangle = scanner.nextLine();
		System.out.println("Введите координату треугольника по X2: ");
		String x2Triangle = scanner.nextLine();
		System.out.println("Ведите координату треугольника по Y2: ");
		String y2Triangle = scanner.nextLine();

		try {
			triangle = new TriangleClass(xTriangle, yTriangle, x1Triangle, y1Triangle, x2Triangle, y2Triangle);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		triangle.isOnTriangle(point);

		double ab = triangle.lineLenght(Integer.parseInt(xTriangle), Integer.parseInt(yTriangle),
				Integer.parseInt(x1Triangle), Integer.parseInt(y1Triangle));
		double bc = triangle.lineLenght(Integer.parseInt(x1Triangle), Integer.parseInt(y1Triangle),
				Integer.parseInt(x2Triangle), Integer.parseInt(y2Triangle));
		double ca = triangle.lineLenght(Integer.parseInt(x2Triangle), Integer.parseInt(y2Triangle),
				Integer.parseInt(xTriangle), Integer.parseInt(yTriangle));
		double areaTrgl = triangle.triangleArea(ab, bc, bc);
		System.out.printf("Площадь треугольника: " + "%8.2f ", areaTrgl);
		
		//прямоугольник
		
		System.out.println("Введите координату стороны прямоугольника по X: ");
		String xRectangle = scanner.nextLine();
		System.out.println("Ведите координату стороны прямоугольника  по Y: ");
		String yRectangle = scanner.nextLine();
		System.out.println("Введите координату стороныпрямоугольника по X1: ");
		String x1Rectangle = scanner.nextLine();
		System.out.println("Ведите координату стороны прямоугольника  по Y1: ");
		String y1Rectangle = scanner.nextLine();
		
		
		try {
			rectangle = new RectangleClass(line, new LineClass(xRectangle, yRectangle, x1Rectangle, y1Rectangle));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		double areaRect = rectangle.rectangleArea(lenghtLn, lineLenght(xRectangle, yRectangle, x1Rectangle, y1Rectangle))
		
		double diagonaLRect = rectangle.rectangleDiagonal(lenghtLn, );	
		System.out.printf("Площадь прямоугольника: " + "%8.2f ", areaRect);
		System.out.printf("Диагональ прямоугольника:  " + "%8.2f ", diagonaLRect);
		scanner.close();
	}

}

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

	public PointClass() {

	}

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
	double l = 0;

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

	public LineClass() {

	}

	public boolean isOnLine(PointClass p) {

		if ((y - y2) * p.x + (x2 - x) * p.y + (x * y2 - x2 * y) == 0) {
			System.out.println("Точка лежит на линии");
		} else {
			System.out.println("Точка НЕ лежит на линии");
		}
		return true;
	}

	public double lineLenght(int x, int y, int x2, int y2) {
		l = (Math.sqrt((Math.pow((x2 - x), 2)) + (Math.pow((y2 - y), 2))));
		return l;
	}
}

class SquareClass extends LineClass { // квадрат

	public SquareClass(double lineLength) {
		super();
		this.lineLenght(x, y, x2, y2); // длинна линии
	}

	public double squareArea(double lineLenght) {
		return Math.pow(lineLenght, 2);
	}
}

class TriangleClass extends LineClass {

	int x1;
	int y1;
	int x2;
	int y2;

	public TriangleClass(String x, String y, String x1, String y1, String x2, String y2) throws Exception {
		super(x, y, y1, x2);

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

	public TriangleClass() {

	}

	public boolean isOnTriangle(PointClass p) {

		int a = (x - p.x) * (y1 - y) - (x1 - x) * (y - p.y);
		int b = (x1 - p.x) * (y2 - y1) - (x2 - x1) * (y1 - p.y);
		int c = (x2 - p.x) * (y - y2) - (x - x2) * (y2 - p.y);

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			System.out.println("Принадлежит треугольнику");
		} else {
			System.out.println("Не принадлежит треугольнику");
		}
		return true;
	}

	public double triangleArea(double lenghtAB, double lenghtBC, double lengthCA) { // длинні
																					// сторон
																					// треугольника
		double p = ((lenghtAB + lenghtBC + lengthCA) / 2); // полупериметр
		return Math.sqrt(p * (p - lenghtAB) * (p - lenghtBC) * (p - lengthCA));
	}
}

// прямоугольник

class RectangleClass extends LineClass {
	public RectangleClass(LineClass lc, LineClass lc1) {
		super();
	}
	
	public double rectangleArea(double lenghtAB, double lenghtBC){ //площадь прямоугольника
		return lenghtAB * lenghtBC;
	}
	
	public double rectangleDiagonal(double lenghtAB, double lenghtBC){ //диагональ прямоугольника
	return  Math.sqrt(Math.pow(lenghtAB, 2) + Math.pow(lenghtBC, 2));
	}
}
