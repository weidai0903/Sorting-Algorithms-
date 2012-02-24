package sortingAlgorithms;
/**
 * @author Wei Dai
 */
public class BubbleSortAlgorithm extends SortingAlgorithm {
	

	public String getName() {
		return "BubbleSortAlgorithm";
	}
	/**
	 * Sort the array
	 * http://www.roseindia.net/java/beginners/arrayexamples/bubbleSort.shtml
	 */
	public void sort(int[] array) {
		int n=array.length;
		int i, j;
		for(i = 0; i < n; i++){
			for(j = 1; j < (n-i); j++){
				if(array[j-1] > array[j]){
					swap(array,j,j-1);
				}
			}
		}
	}

}
