// optimised bubble sort 

class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if ( swapped == false ){
                break;
            }
        }
    }
}
