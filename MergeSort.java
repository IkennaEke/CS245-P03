
public class MergeSort implements SortingAlgorithm {
	private int [] temp;

	@Override
	public void sort(int[] a) {
		temp = new int[a.length];
		sort(a, 0, a.length-1);
		
	}

	private void sort(int[] a, int low, int high) {
		if(low<high){
			int mid = low+(high-low)/2;
			sort(a,low, mid);
			sort(a,mid+1,high);
			Merge(a,low, mid, high);
		
		}
	}

	private void Merge(int[] a, int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
            temp[i] = a[i];
        }
		int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                a[k] = temp[i];
                i++;
            } else {
                a[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            a[k] = temp[i];
            k++;
            i++;
        }
 
    }

}


