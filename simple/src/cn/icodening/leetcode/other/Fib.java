package cn.icodening.leetcode.other;

/**
 * 斐波那契序列
 * 0 1 1 2 3 5 8 13 .....
 * 0 1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8 count
 *
 * @author icodening
 * @date 2021.05.12
 */
public class Fib {

    private static int fib(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 2; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        int first = fib(9);
        int second = fib(10);
        int next = fib(11);
        System.out.println(first);
        System.out.println(second);
        System.out.println(next);
        assert next == first + second;
    }
}
