
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		sort(a, 0, a.length-1);
		
	}

	private void sort(int[] a, int low, int high) {
		if(low==high){
			return;
		}
		else{
			while(low<high){
				for(int i = low; i<high; i++){
					if(a[i]>a[i+1]){
						swap(a,i, i+1);
					}
				}
				high--;
			}
		}
	}

	private void swap(int[] array, int index1, int index2) {
			int tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
			
	}	
}

