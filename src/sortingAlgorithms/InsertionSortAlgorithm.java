package sortingAlgorithms;
/**
 * @author Wei Dai
 */
public class InsertionSortAlgorithm extends SortingAlgorithm {


	public String getName() {
		return "InsertionSortAlgorithm";
	}
	/**
	 * Sort the array
	 * http://www.roseindia.net/java/beginners/arrayexamples/InsertionSort.shtml
	 */
	public void sort(int[] array) {
		int n=array.length;
		for (int i = 1; i < n; i++){
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j-1] > B)){
				array[j] = array[j-1];
				j--;
			}
			array[j] = B;
		}
	}
}
