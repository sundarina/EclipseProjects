
public class Train extends Car {
	public int drive(int howlong){
		int distance = howlong * 60; 
		System.out.println("Я топчу шпалы уже  " + distance + " км");
		return distance;
	}
}
