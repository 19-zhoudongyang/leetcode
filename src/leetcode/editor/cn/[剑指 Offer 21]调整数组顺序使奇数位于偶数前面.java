package leetcode.editor.cn;//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
// Related Topics 数组 双指针 排序 
// 👍 285 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution231 {
    public static void main(String[] args) {
        System.out.println(new Solution231().exchange(new int[]{1, 2, 3, 4}));
    }
    public int[] exchange(int[] nums) {
        if (nums.length == 0){
            return nums;
        }
        int i = 0, j = nums.length - 1;
        while (i != j) {
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            while (i < j && nums[j] % 2 == 0) {
                j--;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
//        List<Integer> odd_even= new ArrayList<>();
//        List<Integer> indexs = new ArrayList<>();
//        for (int i = 0; i < nums.length ; i ++ ){
//            if (nums[i]%2 != 0){
//                odd_even.add(nums[i]);
//                continue;
//            }
//            indexs.add(i);
//        }
//        for (Integer index : indexs) {
//            odd_even.add(nums[index]);
//        }
//        int[] newNums = odd_even.stream().mapToInt(num -> num).toArray();
//        return newNums;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
