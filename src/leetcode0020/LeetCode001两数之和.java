package leetcode0020;

/**
 * @author yuchao
 * @date 2019/12/16 20:31
 * @description ac:100%
 */
public class LeetCode001两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        lable:for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])) {
                    result[0] = i;
                    result[1] = j;
                    break lable;
                }
            }
        }
        return result;
    }
}
