package com.xyp.javalearn.service.algorithm;

import com.xyp.javalearn.model.ListNode;

/**
 * @author: paddy
 * Date: 2022/2/25
 * Time: 11:41
 * Description:
 */
public class DoublePointer {

    public static Integer[] nums1 = new Integer[]{1, 2, 3, 0, 0, 0};
    public static Integer[] nums2 = new Integer[]{2, 5, 6};


    /**合并两个有序数组
     *
     * @param nums1
     * @param nums2
     * @param m
     * @param n
     * @return
     */
    public static Integer[] mergeArray(Integer[] nums1, Integer[] nums2, int m,  int n) {
        int pos = m-- +n-- -1;
        while (m >= 0 && n >= 0) {
            nums1[pos--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n > 0) {
            nums1[pos--] = nums2[n--];
        }

        return nums1;
    }

    /**输入是一个链表，输出是链表的一个节点。如果没有环路，返回一个空指针
     *
     * 当 slow 和 fast 第一次相遇时，我们将 fast 重新移动到链表开头，并
     * 让 slow 和 fast 每次都前进一步。当 slow 和 fast 第二次相遇时，相遇的节点即为环路的开始点。a
     *
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast != null || fast.getNext() != null) {
                return null;
            }
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        } while (fast != slow);
        fast = head;
        while (fast != slow) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return fast;
    }



    public static void main (String args[]){
        Integer [] result = mergeArray(nums1,nums2,3,3);

        for (int i = 0; i < result.length-1; i++) {
            System.out.println(result[i]);
        }
    }


}
