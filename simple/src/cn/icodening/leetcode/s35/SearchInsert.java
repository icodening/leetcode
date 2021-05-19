package cn.icodening.leetcode.s35;

/**
 * 35. 搜索插入位置
 * 难度
 * 简单
 * <p>
 * 912
 * <p>
 * 收藏
 * <p>
 * 分享
 * 切换为英文
 * 接收动态
 * 反馈
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @author icodening
 * @date 2021.05.19
 */
public class SearchInsert {

    public static void main(String[] args) {
        int i1 = searchInsert(new int[]{1, 3, 5, 6}, 5);
        int i2 = searchInsert(new int[]{1, 3, 5, 6}, 2);
        int i3 = searchInsert(new int[]{1, 3, 5, 6}, 7);
        int i4 = searchInsert(new int[]{1, 3, 5, 6}, 0);
        int i5 = searchInsert(new int[]{1, 3}, 1);
        int i6 = searchInsert(new int[]{1, 3, 5}, 4);
        int i7 = searchInsert(new int[]{1, 3, 5}, 2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[0] == target) {
            return 0;
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        int max = nums.length;
        int min = 0;
        while (true) {
            int middle = (max + min) % 2 == 0 ? (max + min) / 2 : ((max + min) / 2) + 1;
            if (nums[middle] == target) {
                return middle;
            }
            int len = (max - min) / 2;
            if (len < 1) {
                return middle;
            }
            if (nums[middle] > target) {
                max = middle;
            } else {
                min = middle;
            }
        }
    }
}
