
public class Fish extends Dog {
	 int currentDepth=0;
	 public int dive(int howDeep){
	 currentDepth=currentDepth + howDeep;
	 if (currentDepth > 100){
		 System.out.println("я мелка¤ рыбешка" + " и не могу плавать глубже 100 метров");
		 currentDepth=currentDepth - howDeep;
	 }else{
	 
	 System.out.println("Ќыр¤ю на глубину "
	 + howDeep + " футов");
	 System.out.println("я на глубине "
	 + currentDepth + " футов ниже уровн¤ мор¤");
	   }
	 return currentDepth;
  }
	 public String say(String something){
		 return "“ы чЄ не знаешь, что рыбы не разговаривают?"; 
	 }
}