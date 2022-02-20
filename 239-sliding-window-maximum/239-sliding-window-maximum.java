class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1 || k==1) return nums;
        int[] result = new int[nums.length-k+1];
        Deque<Node> ds = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(ds.isEmpty()){
                ds.offerLast(new Node(i, nums[i]));
            }else{
                if(ds.peekFirst().index < i-k+1){
                    ds.pollFirst();
                }
                while(!ds.isEmpty() && ds.peekLast().value < nums[i]){
                    ds.pollLast();
                }
                ds.offerLast(new Node(i, nums[i]));
            }
            if(i>=k-1){
                result[i-k+1] = ds.peekFirst().value;
            }
        }
        return result;
    }
    
    class Node {
        int index;
        int value;
        Node(int i, int v){
            index = i;
            value = v;
        }
    }
    
    /*
    Timedout
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a->-a));
        //initial set
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }
        //remaining sets
        result[0] = pq.peek();
        for(int i=k; i<nums.length; i++){
            pq.remove(nums[i-k]);
            pq.add(nums[i]);
            result[i-k+1] = pq.peek();
        }
        return result;
    }
    */
}
/*
[1,3,-1,-3,5,3,6,7], k=3
[3,3,5,5,6,7]

[1,3,-1] => 3
-3 => [3,-1,-3]
*/