package com.xyp.javalearn.service;

import org.springframework.stereotype.Service;

/**
 * @author: paddy
 * Date: 2022/1/28
 * Time: 20:45
 * Description:
 */
@Service
public class CheckService {


    /**寻找两个正序数组的中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int checkSomeThing(int[] nums1, int[] nums2) {

        Integer totalLength = nums1.length + nums2.length;
        //中位数 是否是奇数
        Boolean isOdd = totalLength % 2 == 0 ? false : true;


        for (int i = 0; i < nums1.length + nums2.length; i++) {

        }
        return 0;
    }
}
