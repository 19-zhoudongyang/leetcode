package leetcode.editor.cn;//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 ) 
//
// 
//
// 示例 1： 
//
// 
//输入：
//["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
//[[],[3],[],[],[]]
//输出：[null,null,3,-1,-1]
// 
//
// 示例 2： 
//
// 
//输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
// 
//
// 提示： 
//
// 
// 1 <= values <= 10000 
// 最多会对 appendTail、deleteHead 进行 10000 次调用 
// 
// Related Topics 栈 设计 队列 
// 👍 713 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(8);
        cQueue.appendTail(20);
        cQueue.appendTail(1);
        cQueue.appendTail(11);
        cQueue.appendTail(2);
        for (int i = 0; i<6;i++){
            System.out.println(cQueue.deleteHead());
        }

    }
    Stack<Integer> stack1,stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void appendTail(int value) {
//        int Stack1size = stack1.size();
//        for (int i = 0; i < Stack1size; i++){
//                stack2.push(stack1.pop());
//        }
//        stack1.push(value);
//        int Stack2size = stack2.size();
//        for (int i = 0; i < Stack2size; i++){
//            stack1.push(stack2.pop());
//        }
        stack1.push(value);
    }
    
    public int deleteHead() {
//        if (!stack1.empty()){
//            return stack1.pop();
//        }
//        return -1;
        if (!stack2.empty()){
            return stack2.pop();
        }
        if (stack1.empty()){
            return -1;
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();

    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)
