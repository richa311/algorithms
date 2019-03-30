package sorting;

class QuickSortDemo{
	public static void main(String args[]){
		int input[] = {1,2,3,12,34,54,6,7,87,9,8};
		sortArray(input);
		printArray(input);
	}
	
	public static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void sortArray(int[] array){
		int start = 0;
		int end = array.length-1;
		quickSort(array, start, end);
	}
	
	public static void quickSort(int array[], int start, int end){
		if(start<end){
			int pi = partition(array, start, end);
			quickSort(array, start, pi-1);
			quickSort(array, pi+1,end);
		}
	}
	
	public static int partition(int array[], int start, int end){
		int i= start-1;
		int pivot = array[end];
		int temp=0;
		for(int j=start;j<end;j++){
			if(array[j]<=pivot){
				i++;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;		
			}
		}
		i++;
		temp=array[i];
		array[i]=array[end];
		array[end]=temp;
		
		return i;
	}
}