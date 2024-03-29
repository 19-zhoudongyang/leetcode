package leetcode.editor.cn;//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针 
// 👍 438 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.cn.ListNode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution3123 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode cur = head;
        while (cur != null && k > 0){
            cur = cur.next;
            k--;
        }
        while(cur != null){
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
