import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if(length >= 2 && length <= 10000){
            for(int i = 0; i < length; i++){
                if(nums[i] >= -1000000000 && nums[i] <= 1000000000){
                    for(int j = i+1; j < length; j++){
                        if(target >= -1000000000 && target <= 1000000000){
                            int sum = nums[i] + nums[j];
                            if(sum == target){
                                return new int[]{i,j};
                            }
                        }
                    }
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args){
        int[] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }
}