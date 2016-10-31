
public class Triangle extends Line {
	protected double x3,y3;
	Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		super(x1, y1, y1, y2); // вызов конструктора суперкласса
		this.x3 = x3;
		this.y3 = y3;
	}
	public void Display() {
		super.Display();
		System.out.println("(" + x3 + "," + y3 +")");
		
		//
	}
	public boolean isOnTriangle(Point p){
		double a = (x1 - p.x1)*(y2 - y1) - (x2 - x1)*(y1 - p.y1);
		double b = (x2 - p.x1)*(y3 - y2) - (x3 - x2)*(y2 - p.y1);
		double c = (x3 - p.x1)*(y1 - y3) - (x1 - x3)*(y3 - p.y1);
		if ((a >= 0 && b >= 0 && c >=0) || (a <= 0 && b <=0 && c <= 0)){
			System.out.println("Точка принадлежит треугольнику");
		} else{
			System.out.println("Точка НЕ принадлежит треугольнику");
		}
		return true;
	}
}