package cn.icodening.leetcode.s20;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author icodening
 * @date 2021.05.13
 */
public class IsValid {

    public static void main(String[] args) {
        boolean ret1 = isValid("()");
        boolean ret2 = isValid("()[]{}");
        boolean ret3 = isValid("(]");
        boolean ret4 = isValid("([)]");
        boolean ret5 = isValid("{[]}");
        boolean ret6 = isValid("(){}}{");
        boolean ret7 = isValid("[[[]");
        assert ret1
                && ret2
                && !ret3
                && !ret4
                && ret5
                && !ret6
                && !ret7;
        System.out.println("Success");
    }

    public static boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }
        char[] cs = new char[]{'(', ')', '[', ']', '{', '}'};
        if (s.length() == 2) {
            for (int i = 0; i < cs.length; i += 2) {
                char c = cs[i];
                if (c == s.charAt(0)
                        && s.charAt(1) == cs[i + 1]) {
                    return true;
                }
            }
            return false;
        }
        char[] chars = new char[s.length() << 1];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == cs[0]) {
                chars[index++] = cs[1];
            } else if (c == cs[2]) {
                chars[index++] = cs[3];
            } else if (c == cs[4]) {
                chars[index++] = cs[5];
            } else {
                if (index == 0) {
                    return false;
                }
                char pop = chars[--index];
                if (pop != c) {
                    return false;
                }
            }
        }
        return index == 0;
    }
}
