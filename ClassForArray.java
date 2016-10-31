public class ClassForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AraySort arraySort = new AraySort();
		int[]a = {-7, -1, -6, 0, 11};
		//arraySort.sort(a);
		arraySort.bubbleSort(a);
		for (int element : a){
			System.out.println(element);
		}
		arraySort.maxNumber(a);
		arraySort.minNumber(a);
	}
}
