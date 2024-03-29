package leetcode.editor.cn;//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 
// 👍 2441 👎 0


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution_{
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return res;
        }
        Stack<Integer> path = new Stack<>();
        boolean[] used = new boolean[len];
        dfs(nums,len,0,path,used,res);
        return res;
    }
    private void dfs(int[] nums,int len,int depth,Stack<Integer> path,boolean[] used,List<List<Integer>> res){
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0 ; i < len ; i++ ){
            if (used[i]){
                continue;
            }
            path.push(nums[i]);
            used[i] = true;
            dfs(nums,len,depth+1,path,used,res);
            path.pop();
            used[i] = false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
