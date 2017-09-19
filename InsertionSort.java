
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int curr;
		int j;
		for (int i = 1; i < a.length; i++) {
			curr = a[i];
			j = i-1;
			while (j >= 0 && a[j]>curr) {
				a[j + 1] = a[j]; // shift elems to the right
				j--;
			}
		a[j + 1] = curr;
		}
	}
}



