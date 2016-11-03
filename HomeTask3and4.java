
public class HomeTask3and4 {

	public static void main(String[] args) {

		HLine hLine = new HLine(5, 6, -8, 6);
		// так как поля у HLine состоят из обьектов NPoint
		System.out.println(hLine.p1.x + hLine.p1.y + hLine.p2.x + hLine.p2.y);

		ILine iLine = new ILine(4, 5, 6, -2);
		System.out.println(iLine.x + iLine.y + iLine.x1 + iLine.y1);

	}

}

class NPoint {
	int x;
	int y;
}

class HLine { // has a //агрегация

	NPoint p1;
	NPoint p2;

	public HLine(int x, int y, int x1, int y1) { //

		p1 = new NPoint();
		p1.x = x;
		p1.y = y;
		p2 = new NPoint();
		p2.x = x1;
		p2.y = y1;

		// Npoint.p2.y = y;

	}
}

class ILine extends NPoint { // is a
	int x1;
	int y1;

	public ILine(int x, int y, int x1, int y1) {

		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;

	}
}