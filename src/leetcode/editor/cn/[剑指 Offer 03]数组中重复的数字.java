package leetcode.editor.cn;//找出数组中重复的数字。
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 排序 
// 👍 1061 👎 0


import com.sun.org.omg.CORBA.Initializer;
import javafx.fxml.Initializable;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = reader.readLine();
        String[] strings = readLine.substring(1, readLine.length() - 1).split(", ");
        int[] ints = new int[strings.length];
        for (int index = 0;index < strings.length;index ++) {
            ints[index] = Integer.parseInt(strings[index]);
        }
        System.out.println(new Solution03().findRepeatNumber(ints));
    }
    public int findRepeatNumber(int[] nums){
        Arrays.sort(nums);
        for (int index = 0;index < nums.length-1;index ++) {
            int a = nums[index];
            if (a == nums[index+1]){
                return nums[index];
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
