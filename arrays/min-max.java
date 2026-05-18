/*The idea is to perform a single traversal, firstly initialize two variables - mini as INT_MAX and maxi as INT_MIN, 
then traverse the array to update mini whenever a smaller element is encountered and to update maxi whenever a larger element is found. */

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> lst = new ArrayList<>();
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int a:arr){
            if(a<mini)mini=a;
            if(a>maxi)maxi=a;
        }
        lst.add(mini);
        lst.add(maxi);
        return lst;
    }
}
