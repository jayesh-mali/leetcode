class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }
    
    /*
    private boolean binarySearch(int[] nums, int key){
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low < high){
            mid = low+(high-low)/2;
            if(nums[mid] == key){
                nums[mid] = -1;
                return true;
            }
            if(nums[mid] < key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }*/
}