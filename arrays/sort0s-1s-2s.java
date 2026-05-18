// one approach is a two pass algorithm that counts and changes the array accordingly 
class Solution {
    public void sort012(int[] arr) {
        // code here
        int one=0,two=0,three=0;
        for(int x:arr){
            if(x==0) one++;
            else if(x==1) two++;
            else three++;
        }
        int i=0;
        while(one-->0){
            arr[i++]=0;
        }
        while(two-->0){
            arr[i++]=1;
        }
        while(three-->0){
            arr[i++]=2;
        }
    }
}

//another algorithm is the dutch national flag which is a single pass algorithm

class Solution {
    public void sort012(int[] arr) {
        // code here
      //divide into 4 parts 0 1 unprocessed and 2
        int lo=0,mid=0,hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[lo];
                arr[lo]=arr[mid];
                arr[mid]= temp;
                lo++;mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid]=temp;
                hi--;
            }
        }
    }
}
