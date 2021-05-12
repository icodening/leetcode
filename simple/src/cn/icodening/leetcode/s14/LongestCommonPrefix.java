package cn.icodening.leetcode.s14;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author icodening
 * @date 2021.05.12
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String ret1 = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assert "fl".equals(ret1);
        String ret2 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assert "".equals(ret2);
        String ret3 = longestCommonPrefix(new String[]{"", "b"});
        assert "".equals(ret3);
        System.out.println("Success");
    }

    public static String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = strs[i].length() < min ? strs[i].length() : min;

        }
        char[] cs = new char[min];
        int len = 0;
        f1:
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    break f1;
                }
            }
            len++;
            cs[i] = c;
        }
        if (len == 0) {
            return "";
        }
        return new String(cs, 0, len);
    }
}
