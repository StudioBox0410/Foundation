public class _1295_Find_Numbers_with_Even_Number_Of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                cnt++;
            }
            if (cnt % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int res = findNumbers(new int[] { 12, 345, 2, 6, 7896 });
        System.out.println(res);
    }
}



// public class _1295_Find_Numbers_with_Even_Number_Of_Digits {
//     public static int countDigit(int a){
//         int cnt = 0;
//         while(a != 0){
//             a = a/10;
//             cnt++;
//         }
//         return cnt;
//     }
//     public static int findNumbers(int[] nums) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++){
//             int res = countDigit(nums[i]);
//             if (res % 2 == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }
// public static void main(String[] args) {
//     int finalRes = findNumbers(new int[] { 12, 345, 2, 6, 7896 });
//     System.out.println(finalRes);
// }
// }


// class Solution {
//     public int findNumbers(int[] nums) {
//         // 0..9 (10..99) 100..999 (1000...9999) 10000..99999 (100000..999999)
//         // 10^n+(k - 1), k = 1..9, n = 0..inf
//         // 10^n*k - 10^n = x
//         // n = 1,3,5
//         int res = 0;
//         for (int num : nums) {
//             if ((int)Math.log10(num) % 2 != 0){
//             ++res;}

//         }


//         return res;
//     }
// }






// public class _1295_Find_Numbers_with_Even_Number_Of_Digits {
//     public static int findNumbers(int[] nums) {
//         int count = 0;
//         for (int num : nums) {
//             if (String.valueOf(num).length() % 2 == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int res = findNumbers(new int[] { 12, 345, 2, 6, 7896 });
//         System.out.println(res);
//     }
// }
