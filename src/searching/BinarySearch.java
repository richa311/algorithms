package searching;

public class BinarySearch {
	
	/*Function to return index of key using binary search*/
	public static int search(int arr[], int low, int high, int key) {

		if(high<low)
			return -1;
		int mid = (low+high)/2;
		if(key == arr[mid])
			return mid;
		if(key> arr[mid])
			return search(arr, mid+1, high, key);
		return search(arr, low, mid-1, key);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int result = search(arr, 0, arr.length-1, 0);
		if (result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at the index " + result);
	}

}
