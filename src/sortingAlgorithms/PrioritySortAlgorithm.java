package sortingAlgorithms;

import java.util.PriorityQueue;
/**
 * @author Wei Dai
 */
public class PrioritySortAlgorithm extends SortingAlgorithm {
	

	public String getName() {
		return "PrioritySortAlgorithm";
	}
	/**
	 * PriorityQueue API
	 */
	public void sort(int[] array) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<array.length;i++) {
			pq.add(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			array[i]=pq.poll();
		}
	}

}
