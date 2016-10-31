
public class HW1 {	
	public static void main(String[] args) {
		// 1 Даны два числа. Найти их сумму и произведение.
		
		int a = 5;
		int b = 6;
		int c = a+b;
		int lh = a*b;
		
		System.out.println(c);
		System.out.println(lh);
		
		int t = 7;
		int k = 8;
		System.out.println(t+k);
		
		// 2 Даны два числа. Найдите сумму их квадратов.
		
		double f = 2.0;
		double j = 3.0;
		double rr = Math.pow(f, 2) + Math.pow(j, 2);
		System.out.println((f*f)+(j*j));
		System.out.println(rr);
		//java.lang.Math.po
		
		// System.out.println(pow(f,j));
		
		/*double g = 2.0;
		double d = 3.0;
		
		System.out.println((Math.pow(g,2.0)) + (Math.pow(d,2.0)));
		*/
		
		
		//3 Даны три числа. Найдите их среднее арифметическое.
		
		int r = 2;
		int h = 9;
		int u = 4;
		
		System.out.println((r+h+u)/3);
		
		//4 Дано натуральное числа. Найдите остатки от деления этих чисел на 3 и на 5.
		
		
		int nat = 22;
		System.out.println(nat%3);
		System.out.println(nat%5);
		
		//5 Дано число. Увеличьте его на 30%, на 120%.
	
		
		double l = 70;
		double q = 0.3;
		double p = 1.2;
		l += l*q;
		System.out.println(l*q+l);
		System.out.println(l*p+l);
		
		
		//6 Дано два числа. Найдите сумму 40% от первого числа и 84% от второго числа.
		
		
		int one = 100;
		int two = 500;
		double sum = one*0.4 + two*0.84;
		double w = 0.4;
		double y = 0.84;
		System.out.println((one*w)+(two*y));
		
		//7 Дано трехзначное числа. Найдите сумму его цифр.
		 
		
		int o = 897;
		int o1 = o/100;
		int o1a = o%100;
		int o2 = o1a/10;
		int o3 = o1a%10;
		
		System.out.println(o1+o2+o3);
		
		//8 Дано число. Если оно больше 10, то увеличьте его на 100, иначе уменьшите на 30.
		
		int dfg = 67;
		System.out.println(dfg >30 ? dfg+100 : dfg-30);
		
		//9 Дано натуральное число. Если оно четное, то уменьшите его в 2 раза, иначе увеличьте в 3 раза.
		
		int ui = 88;
		if((ui%2)==0){
		System.out.println(ui/2);
		} else {
		System.out.println(ui*3);
		}	
		
		
		//10 Дано два числа. Вывести наибольшее из них.
		int A = 5;
		int B = 8;
		//if ((A-B)>= 1){
		//System.out.println(A);
		//} else if ((A-B) == 0){
		//System.out.println("Числа равны");	
		//} else {
		//System.out.println(B);
		//}
		
		if (A>B){
			System.out.println(A);
		}else if (A == B){
			System.out.println("Числа равны");
		} else {
			System.out.println(B);
		}
		
		System.out.println(Math.max(A,B));
	}
}