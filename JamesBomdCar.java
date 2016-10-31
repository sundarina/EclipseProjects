
public class JamesBomdCar extends Car{

	public int drive(int howlong){
		int distance = howlong * 180; 
		System.out.println("Я жгу резину уже  " + distance + " км");
		return distance;
	}
}
