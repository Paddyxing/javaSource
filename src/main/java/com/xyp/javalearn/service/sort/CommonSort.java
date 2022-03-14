package com.xyp.javalearn.service.sort;

/**
 * @author: paddy
 * Date: 2022/3/14
 * Time: 15:23
 * Description:
 */
public class CommonSort {

    /**快排 左闭右闭 二分写法  递归
     *
     * @param nums
     * @param l
     * @param r
     */
    public static void quickSort(Integer[] nums, Integer l, Integer r) {
        if (l + 1 > r) {
            return;
        }
        int first = l, last = r - 1, key = nums[first];
        while (first < last) {
            //右指针左移
            while (first < last && nums[last] >= key) {
                --last;
            }
            //交换位置  小的左移
            nums[first] = nums[last];

            while (first < last && nums[first] <= key) {
                ++first;
            }
            nums[last] = nums[first];
        }
        //固定一个位置
        nums[first] = key;
        quickSort(nums, l, first);
        quickSort(nums, first + 1, r);
    }



    


    public static void main(String arg[]) {
        Integer[] nums = new Integer[]{4,7,5,3,1,2,6,8};
        quickSort(nums,0,8);
        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
