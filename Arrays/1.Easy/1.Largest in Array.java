class Solution {
    public static int largest(int[] arr) {
        // code here
        int res = arr[0];
        for(int x:arr){
            res = Math.max(res,x);
        }
        return res;
    }
}
