class Solution {
    public int search(int[] nums, int target) {
        return find(nums, 0, nums.length-1, target);
    }
    
    public int find(int[] nums, int left, int right, int key){
        if(left > right) return -1;
        int mid = left+(right-left)/2;
        if(nums[mid] == key){
            return mid;
        }
        if(nums[mid] >= nums[right]){
            //rotated array on right side
            if(key >= nums[left] && key <= nums[mid]){
                return find(nums, left, mid-1, key);
            }else{
                return find(nums, mid+1, right, key);
            }
        }else{
            if(key >= nums[mid] && key<= nums[right]){
                return find(nums, mid+1, right, key);
            }else{
                return find(nums, left, mid-1, key);
            }
        }
    }
}

/*
[1] target = 0
[0]
left=0, right=0, key=0
find(0,0,0){
mid=0[1]
0>(1&&0) false
}
find(4,6,3){
mid=5[1]
1>(3&&2) false
}
find(4,5,3){
mid=4[0]
}

[4,5,6,7,0,1,2] target = 3
[0,1,2,3,4,5,6]
left=0, right=6, key=0
find(0,6,3){
mid=3[7]
7>(3&&2) true
}
find(4,6,3){
mid=5[1]
1>(3&&2) false
}
find(4,5,3){
mid=4[0]
}



[4,5,6,7,0,1,2] target = 0
[0,1,2,3,4,5,6]
left=0, right=6, key=0
find(0,6,0){
mid=3[7]
7>(0&&2)
}
find(4,6,0){
mid=5[1]
}
find(4,4,0){
mid=4[0]
}
*/