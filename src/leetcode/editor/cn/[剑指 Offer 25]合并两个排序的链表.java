package leetcode.editor.cn;//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 递归 链表 
// 👍 324 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.cn.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution13 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        new Solution13().mergeTwoLists(listNode,listNode2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode(0);
        ListNode l3 = newNode;
        while(l1 != null && l2 != null){
            if ( l1.val <= l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        l3.next = l1 == null? l2 : l1;
        newNode = newNode.next;
        return newNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
