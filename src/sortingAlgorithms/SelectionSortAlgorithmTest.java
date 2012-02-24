package sortingAlgorithms;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortAlgorithmTest {
	int array[];
	int a2[];
	int a3[];
	int array2[];
	final int N=1000;
	SelectionSortAlgorithm ssa;

	@Before
	public void setUp() throws Exception {
		array = new int[]{12,9,4,99,120,1,3,10};
		array2 = new int[]{12,9,4,199,120,1,3,10,3,23,45};

		a2=new int[] {};
		a3=new int[] {19};
		ssa=new SelectionSortAlgorithm();
	}

	@Test
	public void testSelectionSortAlgorithm() {
		ssa.sort(array);
		for(int i=0;i<array.length-1;i++) {
			assertTrue(array[i]<=array[i+1]);
		}
		ssa.sort(array2);
		for(int i=0;i<array2.length-1;i++) {
			assertTrue(array2[i]<=array2[i+1]);
		}
		ssa.sort(a2);
		assertEquals(a2.length,0);
		for(int i=0;i<a2.length-1;i++) {
			assertTrue(a2[i]<=a2[i+1]);
		}
		ssa.sort(a3);
		assertEquals(a3.length,1);
		assertEquals(a3[0],19);
	}
	
	@Test
	public void timingTest() {
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		System.out.println("Selection Sort Algorithm timing");
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
			//warming
			for(int j=0;j<100;j++) {
				int[] a=new int[arraySize];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				ssa.sort(a);
			}
			//warming end
			//do numTestsPerN number of tests to calculate the average time 
			for(int j=0;j<numTestsPerN;j++) {
				int[] a=new int[arraySize*((int)Math.pow(2, k))];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				System.gc();
				long startTime = System.nanoTime();
				ssa.sort(a);
				long elapsedTime = System.nanoTime() - startTime;
				elapsedTimes[j]=elapsedTime;
			}
			long sum=0;
			
			for(int i=0;i<elapsedTimes.length;i++) {
				sum+=elapsedTimes[i];
			}
			//store the average time toward certain N in averageTime[]
			averageTime[k]=sum/numTestsPerN;
			System.out.print((int)Math.pow(2, k)+"N"+"    ");
			System.out.println(averageTime[k]);
		}
		
	}

}
