
public class Car {
	public void start(){
		 System.out.println("Урааа, я поехала!");
		 }
	public void stop(){
		System.out.println("Ну наконец-то");
	}
	
	public int drive(int howlong){
	int distance = howlong * 60; 
	System.out.println("Я проехала всего " + distance);
	return distance;
	}
}