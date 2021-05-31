package cn.icodening.leetcode.s342;

/**
 * 342. 4的幂
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 16
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-four
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author icodening
 * @date 2021.05.31
 */
public class IsPowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(2));
        System.out.println(isPowerOfFour(8));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 4) {
            return false;
        }
        while (n > 4) {
            int j = n % 4;
            n = n / 4;
            if (j != 0 || n < 4) {
                return false;
            }
        }
        return true;
    }
}
