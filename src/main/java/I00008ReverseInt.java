/**
 * https://leetcode-cn.com/problems/reverse-integer/
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 * 示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @auther: Feng Yapeng
 * @since: 2019/2/14 10:31
 */
public class I00008ReverseInt {

    public static void main(String[] args) {

        System.out.println(0xf);
        System.out.println(reverse(-31));
    }

    public static int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            x = 0 - x;
            negative = true;
        }
//        Integer
        long reverseNum = 0;
        while (x > 0) {
            reverseNum = reverseNum * 10 + x % 10;
//            reverseNum = reverseNum << 8 | (x & 0xf);
            x = x / 10;
        }
        if (reverseNum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (negative ? 0 - reverseNum : reverseNum);

    }
}
