//merge sort 


class Solution {
    
    void merge(int arr[], int l, int mid, int r){
        int[] result = new int[r-l];
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i=0;i<n1;i++){
            a1[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++){
            a2[i] = arr[mid+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                arr[k++] = a1[i++];
            }else{
                arr[k++] = a2[j++];
            }
        }
        while(i<n1){
            arr[k++] = a1[i++];
        }
        while(j<n2){
            arr[k++] = a2[j++];
        }
        
    }
    
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return; 
        int mid = l + ((r-l)/2);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
