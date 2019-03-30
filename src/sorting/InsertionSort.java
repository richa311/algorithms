package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int arr[]) {
		int key;
		for (int i =1; i<arr.length;i++) {
			int j = i-1;
			key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		int arr[] = {12,11,13,5,6};
		System.out.println("Original Array : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}

}
