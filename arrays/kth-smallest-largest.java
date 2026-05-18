/*Using Max-Heap - O(n * log(k)) Time and O(k) Space
The idea is to maintain a max heap of size k while iterating through the array. The heap always contains the k smallest elements seen so far. 
If the heap size exceeds k, remove the largest element. 
At the end, the heap holds the k smallest elements.
*/




class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      //creates a Max Heap for smallest elements
      // PriorityQueue<Integer> pq = new PriorityQueue<>(); for min heap
        for(int p:arr){
            pq.add(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
