package cn.icodening.leetcode.s38;

/**
 * 38. 外观数列
 * 难度
 * 简单
 * <p>
 * 699
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * <p>
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * 前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * 描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
 * 描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
 * 描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
 * 描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
 * 要 描述 一个数字字符串，首先要将字符串分割为 最小 数量的组，每个组都由连续的最多 相同字符 组成。
 * 然后对于每个组，先描述字符的数量，然后描述字符，形成一个描述组。
 * 要将描述转换为数字字符串，先将每组中的字符数量用数字替换，再将所有描述组连接起来。
 *
 * @author icodening
 * @date 2021.05.20
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String last = "1";
        for (int i = 1; i < n; i++) {
            int length = last.length();
            char c = last.charAt(0);
            int num = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                char c1 = last.charAt(j);
                if (c1 == c) {
                    num++;
                } else {
                    sb.append(num).append(c);
                    c = c1;
                    num = 1;
                }
            }
            last = sb.append(num).append(c).toString();
        }
        return last;
    }

}
