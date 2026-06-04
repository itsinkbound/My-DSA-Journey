// this is the algorithm for selection sort 

class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
