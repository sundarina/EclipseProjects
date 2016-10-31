
public class MainPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point = new Point(7,8);
		point.Display();
		
		Line l = new Line(1,3,8,9);
		System.out.println("Линия: ");
		l.Display();
		boolean b = l.isOnLine(point);
		
		Triangle tr = new Triangle(2,4,5,6,7,8);
		System.out.println("Триугольник: ");
		tr.Display();
		boolean b1 = tr.isOnTriangle(point);
	}

}
