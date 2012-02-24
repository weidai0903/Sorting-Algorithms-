package sortingAlgorithms;

import java.util.Random;


public class TimeSortingAlgorithms {
	final int N=1000;

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		TimeSortingAlgorithms tsa=new TimeSortingAlgorithms();
		//warming
		for(int j=0;j<1000;j++) {
			int[] a=new int[10000];
			a[0]=1;
			for(int i=1;i<a.length;i++) {
				a[i]=a[i-1]+1;
			}
		}
		//warming end
		tsa.stepSortTimingTest();
		tsa.bubbleTimingTest();
		tsa.insertionSortTimingTest();
		tsa.PrioritySortTimingTest();
		tsa.selectionSortTimingTest();
	}
	/**
	 * Step Sorting Algorithm timing
	 */
	public void stepSortTimingTest() {
		StepSortAlgorithm stepsa=new StepSortAlgorithm();
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		//warm up
		for(int j=0;j<numTestsPerN;j++) {
			int[] a=new int[arraySize*10];
			for(int i=0;i<a.length;i++) {
				a[i]=rand.nextInt();
			}
			System.gc();
			stepsa.sort(a);
		}
		//warm up end
		System.out.println("Step Sort Algorithm timing");
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
			//do numTestsPerN number of tests to calculate the average time 
			for(int j=0;j<numTestsPerN;j++) {
				int[] a=new int[arraySize*((int)Math.pow(2, k))];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				System.gc();
				long startTime = System.nanoTime();
				stepsa.sort(a);//sort here!
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
	/**
	 * bubble Sorting Algorithm timing
	 */
	public void bubbleTimingTest() {
		BubbleSortAlgorithm bsa=new BubbleSortAlgorithm();
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		System.out.println("Bubble Sorting Algorithm");
		//warm up
		for(int j=0;j<numTestsPerN;j++) {
			int[] a=new int[arraySize*10];
			for(int i=0;i<a.length;i++) {
				a[i]=rand.nextInt();
			}
			System.gc();
			bsa.sort(a);
		}
		//warm up end
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
			//do numTestsPerN number of tests to calculate the average time 
			for(int j=0;j<numTestsPerN;j++) {
				int[] a=new int[arraySize*((int)Math.pow(2, k))];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				System.gc();
				long startTime = System.nanoTime();
				bsa.sort(a);//sort here!
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
	/**
	 * Insertion Sorting Algorithm timing
	 */
	public void insertionSortTimingTest() {
		InsertionSortAlgorithm isa=new InsertionSortAlgorithm();
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		//warm up
		for(int j=0;j<numTestsPerN;j++) {
			int[] a=new int[arraySize*10];
			for(int i=0;i<a.length;i++) {
				a[i]=rand.nextInt();
			}
			System.gc();
			isa.sort(a);
		}
		//warm up end
		System.out.println("Insertion Sort Algorithm timing");
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
			//do numTestsPerN number of tests to calculate the average time 
			for(int j=0;j<numTestsPerN;j++) {
				int[] a=new int[arraySize*((int)Math.pow(2, k))];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				System.gc();
				long startTime = System.nanoTime();
				isa.sort(a);
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
	/**
	 * Priority Sorting Algorithm timing
	 */
	public void PrioritySortTimingTest() {
		PrioritySortAlgorithm psa=new PrioritySortAlgorithm();
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		//warm up
		for(int j=0;j<numTestsPerN;j++) {
			int[] a=new int[arraySize*10];
			for(int i=0;i<a.length;i++) {
				a[i]=rand.nextInt();
			}
			System.gc();
			psa.sort(a);
		}
		//warm up end
		System.out.println("Priority Sort Algorithm timing");
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
			//do numTestsPerN number of tests to calculate the average time 
			for(int j=0;j<numTestsPerN;j++) {
				int[] a=new int[arraySize*((int)Math.pow(2, k))];
				for(int i=0;i<a.length;i++) {
					a[i]=rand.nextInt();
				}
				System.gc();
				long startTime = System.nanoTime();
				psa.sort(a);
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
	/**
	 * Selection Sorting Algorithm timing
	 */
	public void selectionSortTimingTest() {
		SelectionSortAlgorithm ssa=new SelectionSortAlgorithm();
		Random rand=new Random();
		int arraySize=N;
		int numArraySize=4;
		long averageTime[]=new long[numArraySize];
		int numTestsPerN=10;
		//warm up
		for(int j=0;j<numTestsPerN;j++) {
			int[] a=new int[arraySize*10];
			for(int i=0;i<a.length;i++) {
				a[i]=rand.nextInt();
			}
			System.gc();
			ssa.sort(a);
		}
		//warm up end
		System.out.println("Selection Sort Algorithm timing");
		//calculate the average sorting time for array size of  N, 2N,4N,8N
		for(int k=0;k<numArraySize;k++) {
			long elapsedTimes[]=new long[numTestsPerN];
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
