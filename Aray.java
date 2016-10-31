import java.util.Random;
import java.util.Scanner;
public class Aray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a  = {1,2,3};
		int left = 0;
		int right = 2;
		while (left < right){
			int t = a[left];
			a[left] = a[right];
			a[right] = t;
			left++;
			right--;
			for (int i = 0; i < 3; i++){ 
				System.out.println(a[i] + "");
				}
			}
	
		int[] first = new int[]{1, 2, 3, 5, 6, 3, 2};
		int[] second = new int[]{7, 1, 4, 4, 5, 2};
		System.arraycopy(first, 2, second, 1, 3);
		for (int i = 0; i < 6; i++){ 
			System.out.println("*" + second[i] + "");
		}
		
	Scanner k = new Scanner(System.in);
		int[]mas = new int [2];
		int i;
		for (i = 0; i < mas.length; i++){ 	
			System.out.print("Укажите число N");	
			mas[i] = k.nextInt();
			k.close();
		}
			for (int u = 0; u < 2; u++){ 
			System.out.print(mas[u] + "");
		}
		
			/*Задача 1. Дан массив чисел а0,...,аn-1. Выяснить, имеются ли в данном массиве два идущих подряд 
 положительных элемента. Подсчитать количество таких пар.*/
		
		int N1 = 10, g, p=0;
        int[] a1 = new int[N1]; 

        Random randomGenerator = new Random();
        for (g=0; g<N1; g++) {
            a[g] = randomGenerator.nextInt(10)-5;
            System.out.println("a["+i+"] = "+a1[i]);
        }
        
        for(g=0; g<N1-1; g++){
            if(a1[g]>0 && a1[g+1]>0) { 
            	p++;
            }
        }
        System.out.println("Количество пар: "+p); 
        
        /* Задача 2. Даны действительные числа а0,...,аn-1. Вычислить сумму положительных и произведение четных 
 по значению членов данного массива. Если членов с положительными или четными значениями нет, то выдать 
 соответствующее сообщение. */
		
		int T = 10, y;
        int[] e = new int[T]; 
        float sum = 0;
        int product = 1;

        Random randomGenerator1 = new Random();
        for (y=0; y<T; y++) {
            e[i] = randomGenerator1.nextInt(10)-5;
            System.out.println("a["+y+"] = "+e[y]);
        }
        
        for(y=0; y<T; y++) {
            if(e[y]>0) 
                sum += e[i]; 
            if(e[y]%2==0) 
                product *= e[y];
        }

        if(sum==0)
            System.out.println("Нет положительных элементов");
        else
            System.out.println("Сумма положительных элементов: "+sum);
        
        if(product==1)
            System.out.println("Нет четных элементов");
        else
            System.out.println("Произведение четных элементов: "+product);
        
	}
}