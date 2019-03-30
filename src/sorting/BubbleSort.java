package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {		
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {64,34,25,12,22,11,90};
		System.out.println("Original Array : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}

}
