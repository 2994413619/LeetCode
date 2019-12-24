package leetcode0020;

import java.util.ArrayList;

/**
 * @author yuchao
 * @date 2019/12/22 22:57
 * @description ac:100%
 */
public class LeetCode04寻找两个有序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < nums1.length || j < nums2.length){
            if(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    list.add(nums1[i]);
                    i++;
                } else {
                    list.add((nums2[j]));
                    j++;
                }
            } else if(i < nums1.length) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add((nums2[j]));
                j++;
            }
        }

        if(list.size() % 2 == 0){
            int center = list.size() / 2;
            return (double) (list.get(center) + list.get(center - 1)) / 2;
        } else {
            return list.get(list.size() / 2);
        }

    }

}
