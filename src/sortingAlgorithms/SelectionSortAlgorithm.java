package sortingAlgorithms;
/**
 * @author Wei Dai
 */
public class SelectionSortAlgorithm extends SortingAlgorithm {


	public String getName() {
		return "SelectionSortAlgorithm";
	}
	/**
	 * Sort the array
	 * http://www.algolist.net/Algorithms/Sorting/Selection_sort
	 */
	public void sort(int[] array) {
		int n=array.length;
		for(int x=0; x<n; x++){
			int index_of_min = x;
			for(int y=x; y<n; y++){
				if(array[y]<array[index_of_min]){
					index_of_min = y;
				}
			}
			swap(array,index_of_min,x);
		}
	}

}
