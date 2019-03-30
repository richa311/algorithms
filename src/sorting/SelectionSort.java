package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int arr[]) {
		int n = arr.length;
		for(int i =0; i<n-1;i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		System.out.println("Original Array : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}

}
