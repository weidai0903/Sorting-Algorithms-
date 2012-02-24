package sortingAlgorithms;
/**
 * @author Wei Dai
 */
public class StepSortAlgorithm extends SortingAlgorithm {
	

	public String getName() {
		return "StepSortAlgorithm";
	}
	/**
	 * Sort the array
	 * http://www.cis.upenn.edu/~matuszek/cit594-2012/Assignments/05-sorting.html
	 */
	public void sort(int[] array) {
		int step = array.length/2;
		boolean second_time = false;
			    while( step > 0) {
			        int i = 0;
			        while(i < array.length - step) {
			            if(array[i] > array[i + step]) {
			            	swap(array,i,i+step);
					   
			                if (i > step) {
			                    i -=step + 1;
			                }
			            }
			            i += 1;
			        }

			        if (second_time) {
			            step = step/2;
			        }
			        if(second_time) second_time=false;
			        else second_time=true;
			    }
	}

}
