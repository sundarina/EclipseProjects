
import java.util.*;
import java.lang.reflect.*;

public class Calculator {
	
	private Map<String, String> operators;
	
	public Calculator(){
		this.operators = new HashMap<String, String>();
		this.operators.put("*", "getMultiply");
		this.operators.put("/", "getDivision");
		this.operators.put("-", "getSubtraction");
		this.operators.put("+", "getAdditive");
		this.operators.put("%", "getRemainder");
	}
	
	private String getMethodBySign(String sign){
		return this.operators.get(sign);
	}

	public double getMultiply(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}
	public double getDivision(double firstNumber, double secondNumber){
		return firstNumber / secondNumber;
	}
	public double getSubtraction(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	public double getAdditive(double firstNumber, double secondNumber){
			return firstNumber + secondNumber;
	}
	public double getRemainder(double firstNumber, double secondNumber){
		return firstNumber % secondNumber;
	}
	
	public double getCalculator(double firstNumber, double secondNumber, String sign){
		String methodName = this.getMethodBySign(sign);
		try {
			Method [] ms = this.getClass().getMethods(); // retrieve all class methods
			for (Method method : ms) {
				if(method.getName() == methodName) { //
					return new Double(method.invoke(this, firstNumber,secondNumber).toString());// this указ на обьект класа
				}
			}
			//Method m = this.getClass().getMethod(methodName, new Class[]{double, });
			//Method m = this.getClass().getDeclaredMethod(methodName);
			//return new Double(m.invoke(this, firstNumber,secondNumber).toString()); //вызов метода, приведене типов обьекс к строке, строку к дабл (new Double) клас обвертка 
		//} catch (NoSuchMethodException e) {
			//System.out.println(e.getMessage());	
		//} 
		} catch (IllegalArgumentException e) { // exception handling omitted for brevity
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) { // exception handling omitted for brevity
			System.out.println(e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.println(e.getMessage());
		} // exception handling omitted for brevity
		
		return -1.0;
		
	//	String allSign = "*/-+%";
	/*	double res = 0;
		if (allSign.charAt(0) == sign.charAt(0)){
			res = this.getMultiply(firstNumber, secondNumber);
			System.out.println(firstNumber + " * " + secondNumber + " = " + res);
		}else if (allSign.charAt(1) == sign.charAt(0)){
			res = this.getDivision(firstNumber, secondNumber);
			System.out.println(firstNumber + " / " + secondNumber + " = " + res);
		}else if (allSign.charAt(2) == sign.charAt(0)){
			res = this.getSubtraction(firstNumber, secondNumber);
			System.out.println(firstNumber + " - " + secondNumber + " = " + res);
		}else if (allSign.charAt(3) == sign.charAt(0)){
			res = this.getAdditive(firstNumber, secondNumber);
			System.out.println(firstNumber + " + " + secondNumber + " = " + res);
		}else if (allSign.charAt(4) == sign.charAt(0)){
			res = this.getRemainder(firstNumber, secondNumber);
			System.out.println(firstNumber + " % " + secondNumber + " = " + res);
		}*/
		
	}	
}
