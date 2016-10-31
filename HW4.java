import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. «Заполнить массив длины n нул¤ми и единицами, при этом данные значени¤ чередуютс¤, начина¤ с нул¤.
		int[] array = new int [10];
		for (int i = 0; i < 10; i++) {
			array[i] = i%2;
			System.out.print(array[i] + " ");
		}
		
		// 2.Заполнить массив нул¤ми, кроме первого и последнего элементов, которые должны быть равны единице.
		
		int[]array2 = new int[5];
		for (int y = 0; y < 5; y++){
			array2[y] = 0;
		}
		array2[0] = 1;
		array2[array2.length - 1] = 1;  
		for (int i = 0; i < 5; i++) {
			System.out.print(array2[i] + " ");
			}
			



 
 /* 6. Обьявить массив, заполнить случx знач, найти макс и мин ел массива при помощи цикла. и при помощи функций.*/
	
	//3. Обьявить пустой массив, заполнить массив значени¤ми от 0 до 100, вывести массив на экран при помощи цикла 
		int[]arrayNew = new int[100];
		for (int i = 0; i < 100; i++){ 	
		arrayNew[i] = i;
		System.out.println(arrayNew[i]); 
	} 
	
	/*4 Обьявить пустой массив, заполнить его случайными значени¤ми при помощи функции рандом*/
	int []arrayRandom = new int[100];
	for (int i = 0; i < 100; i++) {
		arrayRandom[i] = (int)(Math.random()*100);
		System.out.println(arrayRandom[i]);
	}

	/*5. ”Упорядочить значение массива по возрастанию.
		–еализовать двум¤ способами: с помощью стандартной функции и при помощи алгоритма пузырька.*/
	 //а
	
	int[]a = {2,3,1}; //массив
	int min; 
		for (int i = 0; i < a.length; i++) {
			// резюмируем первый элемент мин
			min = i;
			for (int j = i + 1; j < a.length; j++){
					if (a[j] < a[min]) { 
						min = j;
					}
			}
			if (min != i){
					 int t = a[i];
							a[i] = a[min];
							a[min] = t;
			}
			System.out.println(a[i]);	
		} 
		
		//b 
		
		int counter = 0; 
		 int[]b = {8, 7, 9, 14, 2, 56, 5, 77, 888, 98, -1};
		 int temp = 0;
		 for (int i = 0; i < b.length - 1; i++) {  
			 for (int j = 0; j < b.length - i - 1; j++) {
				 counter++;
				 if (b[j + 1] < b[j]){
					 temp = b[j + 1]; 
					 b[j + 1] = b[j];
				 	 b[j] = temp;
				 }  
			  } 
		 }
		 for (int i = 0; i < b.length; i++){
			  System.out.println(b[i]);
		 }
		 System.out.println(counter);
	
		 
			Scanner sc = new Scanner(System.in);
			System.out.print("Укажите число N");
			long N = sc.nextLong();
			long s = 0;
			if (N % 2 == 0){ 
				s = (N / 2) * (N + 1);
			} else { 
				s = N * ((N + 1) / 2);
			}
				if (N < 0){ s = -s + 1;
				}
			
			System.out.println(s);
			System.exit(0);
			int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int[] destArr = new int[5];

			System.arraycopy(sourceArr, 5, destArr, 0, 5);
			for (int i=0; i < destArr.length; i++) {
			System.out.print(destArr[i] + " ");
			}

  }
}