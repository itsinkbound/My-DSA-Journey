//USING TWO POINTERS O(n) Time and O(1) Space - The idea is to maintain two pointers: left and right, such that 
//left points at the beginning of the array and right points to the end of the array. 
//While left pointer is less than the right pointer, swap the elements at these two positions. 
//After each swap, increment the left pointer and decrement the right pointer to move towards the center of array. 
//This will swap all the elements in the first half with their corresponding element in the second half.

//Can also be done in single pointer by swapping i with n-i-1

class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int l = 0;
		int r = arr.length - 1;
		while (l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++; r--;
		}
	}
}

