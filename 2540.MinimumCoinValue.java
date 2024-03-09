
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //int number=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num); 
        }
        for(int num:nums2)
        {

            if(set.contains(num))
            {
                return num;
            }
        }
        return -1;
        
        
    }
}


public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Binary search should be done on the larger array
        // If nums1 is longer, call getCommon with the arrays swapped
        if (nums1.length > nums2.length) {
            return getCommon(nums2, nums1);
        }
        
        // Search for each element of nums1 in nums2
        // Return the first common element found
        for (int num : nums1) {
            if (binarySearch(num, nums2)) {
                return num;
            }
        }

        // Return -1 if there are no common elements
        return -1;
    }

    private boolean binarySearch(int target, int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}


public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;

        // Traverse through both arrays with two pointers
        // Increment the pointer with a smaller value at that index
        // Return the first common element found
        while (first < nums1.length && second < nums2.length) {
            if (nums1[first] < nums2[second]) {
                first++;
            } else if (nums1[first] > nums2[second]) {
                second++;
            } else {
                return nums1[first];
            }
        }

        // Return -1 if there are no common elements
        return -1;
    }
}
