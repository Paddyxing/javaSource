package com.xyp.javalearn.service.quickselcet;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: paddy
 * Date: 2022/3/3
 * Time: 16:31
 * Description:
 */
@Service
public class FindKthLagerst {


    public static void main(String args[]) {
        System.out.println("start:");
        Integer[] input = new Integer[]{3, 2, 1, 5, 6, 4};
        Integer k = 2;
        System.out.println("outPut:" + findKthLargest(input, k));
    }




    /**输入一个数组和一个目标值 k，输出第 k 大的数字。题目默认一定有解
     * 快速选择
     * @param nums
     * @param k
     * @return
     */
    public static Integer findKthLargest(Integer[] nums, Integer k) {
        int l = 0, r = nums.length - 1, target = nums.length - k;

        while (l < r) {
            int mid = quickSelection(nums, l, r);
            if (mid == target) {
                return nums[mid];
            }
            if (mid < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return nums[l];
    }

    /**快速选择中位数（给定范围的）
     * @param nums
     * @param l
     * @param r
     * @return
     */
    private static int quickSelection(Integer[] nums, int l, int r) {
        int i = l + 1, j = r;
        while (true) {
            while (i < r && nums[i] <= nums[l]) {
                ++i;
            }

            while (l<j && nums[j] >= nums[l]){
                --j;
            }
            if (i >= j) {
                break;
            }
            Integer [] swap = swap(nums[i], nums[j]);
            nums[i] = swap[0];
            nums[j] = swap[1];
        }
        Integer [] swap = swap(nums[l], nums[j]);
        nums[l] = swap[0];
        nums[j] = swap[1];
        return j;

    }

    /**JAVA 中数组辅助实现交换函数
     *
     * @param num
     * @param num1
     * @return
     */
    private static Integer [] swap(Integer num, Integer num1) {
        Integer tmp = num;
        num = num1;
        num1 = tmp;
        return new Integer[]{num,num1};
    }


    /**桶排序  输出给定数组 最频繁的K 个数字
     *桶排序的意思是为每个值设立一个桶，桶内记录这个值出现的次数 然后对桶进行排序
     * @param nums
     * @param k
     * @return
     */
    public static Integer[] topKFrequent(Integer[] nums, int k) {
        //桶
        HashMap<Integer, Integer> counts = new HashMap<>();
        Integer maxCount = 0;

        for (Integer i : nums) {
            maxCount = Math.max(maxCount, counts.get(i));
        }


        return new Integer[]{};

    }







}
