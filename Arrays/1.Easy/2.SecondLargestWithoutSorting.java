class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int slargest = -1;
        
        for(int x: arr){
            if(x>largest){
                slargest = largest;
                largest = x;
            }
            else if(x>slargest && x!= largest){
                slargest = x;
            }
        }
        return slargest;
    }
}
