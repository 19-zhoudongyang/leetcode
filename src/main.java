import java.io.*;

//class Solution {
//    public int mySqrt(int x) {
//        if (x == 0){
//            return 0;
//        }
//        if (x == 1){
//            return 1;
//        }
//        int left = 0;
//        int right = x;
//        int ans = -1;
//        while (left <= right){
//            int mid = left+(right-left)/2;
//            if ((long)mid*mid <= x){
//                ans = mid;
//                left = mid + 1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return ans;
//    }
//}

