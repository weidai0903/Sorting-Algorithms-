package sortingAlgorithms;

public abstract class SortingAlgorithm {
    
    /**
     * Identifies the algorithm.
     * @return The name of the implementing sorting algorithm.
     */
    public abstract String getName();
    
    /**
     * Sorts the given array into ascending order.
     * @param array The array to be sorted.
     */
    public abstract void sort(int[] array);
    
    /**
     * Swaps the values of two elements of an array.
     * @param array The array.
     * @param j One index.
     * @param i The other index.
     */
    public static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}