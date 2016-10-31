
public class Rep {

	public static void main(String[] args) {
		
		//index max number search
		
		int[]array = {100,5,89,12,99,88};
		int imax = 0;
		for (int i = 0; i < array.length; i++){
			if (array [i] > array[imax]){
				imax = array[i];
				imax = i;
			}
		}
		System.out.println(imax);
	}

}
