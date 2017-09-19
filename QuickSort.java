import java.util.Random;

public class QuickSort implements SortingAlgorithm{

	@Override
	public void sort(int[] a) {
		sort(a,0,a.length-1);
	}

	private void sort(int[] a, int low, int high) {
		int pivot;
		if(low<high){
			pivot = partiton(a, low, high);
			sort(a, low, pivot);
			sort(a, pivot+1,high);
		}
		
		
	}

	private int partiton(int[] a, int low, int high) {
		int pivot;
		int tmp;
		int max = high;
		int mid = (high+low)/2;
		tmp = a[mid];
		a[mid] = a[high];
		a[high] = (int) tmp;
		pivot = a[high];
		low--;
		do {
			while (a[++low]<pivot);
			while ((low < high) && (a[--high]>(pivot)));
			tmp = a[low];
			a[low] = a[high];
			a[high] = (int) tmp;
		} while (low < high);
		swap(a, low,max);
		return low;
	}

	
	private void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	
	}	

}
