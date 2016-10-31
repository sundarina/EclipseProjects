import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculator calc = new Calculator();
		Scanner scan = new Scanner (System.in);
		System.out.println("Please, enter the first number: ");
		double firstNumber = scan.nextDouble();
		System.out.println("Please, enter arithmetic sign: ");
		String sign = scan.next();
		System.out.println("Please, enter the second number: ");
		double secondNumber = scan.nextDouble();
		double res = calc.getCalculator(firstNumber, secondNumber, sign);
		System.out.println(res);
		
		
		
		
		
		//String allSign = "*/-+%";
		
		//double res = 0;
	
		
	/*	if (allSign.charAt(0) == sign.charAt(0)){
			res = firstNumber * secondNumber;
			System.out.println(firstNumber + " * " + secondNumber + " = " + res);
		}else if (allSign.charAt(1) == sign.charAt(0)){
			res = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = " + res);
			}else if (allSign.charAt(2) == sign.charAt(0)){
				res = firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber + " = " + res);
				}else if (allSign.charAt(3) == sign.charAt(0)){
					res = firstNumber + secondNumber;
					System.out.println(firstNumber + " + " + secondNumber + " = " + res);
					}else if (allSign.charAt(4) == sign.charAt(0)){
						res = firstNumber % secondNumber;
						System.out.println(firstNumber + " % " + secondNumber + " = " + res);
						}
						
						
		
				switch(sign.charAt(0)){
			case 1: allSign.charAt(0);
			double res = firstNumber * secondNumber;
			System.out.println(firstNumber + " * " + secondNumber + " = " + res);
			break;
			case 2: allSign.charAt(1);
			res = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = " + res);
			break;
			case 3: allSign.charAt(2);
			res = firstNumber - secondNumber;
			System.out.println(firstNumber + " - " + secondNumber + " = " + res);
			break;
			case 4: allSign.charAt(3);
			res = firstNumber + secondNumber;
			System.out.println(firstNumber + " + " + secondNumber + " = " + res);
			break;
			case 5: allSign.charAt(4);
			res = firstNumber % secondNumber;
			System.out.println(firstNumber + " % " + secondNumber + " = " + res);
			break;
			//default:
			//System.out.println("You have entered the wrong character, repeat please!");
		}
		
	*/
		}
}
