
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for(int i = 0; i<a.length-1;i++){
			int min = i;
			for(int j = i+1; j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			if(min != i){
				swap(a, i,min);
			}
			
		}
		
	}
	private void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
		
}	

}
