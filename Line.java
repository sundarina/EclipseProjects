
public class Line extends Point {
	protected double x2, y2;
	Line(double x1, double y1, double x2, double y2){
		super(x1, y1); // вызов конструктора суперкласса
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void Display() {
		super.Display();
		System.out.println("(" + x2 + "," + y2 +")");
	}
	public boolean isOnLine(Point p){
		if ((p.x1 - x1)/(x2 - x1) == (p.y1 - y1)/(y2-y1)){
			System.out.println("Точка лежит на линии");
		} else{
			System.out.println("Точка НЕ лежит на линии");
		}
		return true;
	}
}
 // 