
public class AraySort {
	
	public int[] sort(int[]arr){
		 for (int i = 0; i < arr.length; i++) { //проходим по массиву
			 int min = arr[i];   //  пускай і элемент массива аrr будет минимальным -  предполагаемый минимум
		        int min_i = i; // записываем предполагаемый минимум в новую переменную
		        
		        for (int j = i+1; j < arr.length; j++) { /*В оставшейся части подмножества ищем элемент,
			           который меньше предположенного минимума*/
		            
		            if (arr[j] < min) { //Если находим, запоминаем его индекс
		                min = arr[j];
		                min_i = j;
		            }
		        }
		        /*/Если нашелся элемент, меньший, чем на текущей позиции,
		          меняем их местами*/
		        if (i != min_i) {
		            int tmp = arr[i];
		            arr[i] = arr[min_i];
		            arr[min_i] = tmp;
		        }
		     
		 }
		 return arr;
	}
	
	public int[] bubbleSort(int[]arr){
		
	    /*Внешний цикл каждый раз сокращает фрагмент массива, 
	      так как внутренний цикл каждый раз ставит в конец
	      фрагмента максимальный элемент*/   
	   // for(int i = arr.length-1 ; i > 0 ; i--){
	      //  for(int j = 0 ; j < i ; j++){
		
		for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) {
	            /*Сравниваем элементы попарно, 
	              если они имеют неправильный порядок, 
	              то меняем местами*/
	            if( arr[j] > arr[j+1] ){
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
	    return arr;
	}
	
	public void maxNumber(int[]arr){
		int imax = 0;
		for (int i = 1; i < arr.length; i++){
			if(arr[imax] < arr[i]){
				imax = i;
			}
		}
		System.out.println("Max: " + arr[imax]);
	}
	public void minNumber(int[]arr){
		int imin = 0;
		for (int i = 1; i > arr.length; i--){
			if(arr[imin] > arr[i]){
					imin = i;	
			}
		}
		System.out.println("Min: " + arr[imin]);
	}
	
	
	public void taskPlus() {
		/*
		 * найти пропущенное число в массиве
		 */
		
		
		int[] arr = {10,9,3,6,4,7,8,1,5};  
        int indexes = 10;  
        int values = 0;  
          
        for (int i = 0; i < arr.length; i++) {  
            indexes += i+1;  
            values += arr[i];  
        }  
          
        int result = indexes - values;  
          
        System.out.println("Missing number is: "+result);  
	}
}

