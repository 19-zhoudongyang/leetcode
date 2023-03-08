package leetcode.editor.cn;//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 
// 👍 379 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import javax.xml.soap.Node;
import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] ints = new Solution().reversePrint(head);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] ints = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i ++){
            ints[i] = stack.pop();
        }
        return ints;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
