package com.bridgelabz;

public class BinarySearch {

	private static int binarySearch(String[] array, String key) {
		int low = 0, high = array.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int result = key.compareTo(array[mid]);
			if (result == 0) {
				return mid;
			} else if (result < 0) {
				high = mid + 1;
			} else {
				low = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		String[] array = { "apple", "banana", "mango", "grapes", "cherry"};
        String key = "mango";
        
        int result = binarySearch(array, key);
        
        if(result == -1)
			 System.out.println("Key is not present");
		 else
			 System.out.println("Key present at"+" index : "+result);
       
	}
}
