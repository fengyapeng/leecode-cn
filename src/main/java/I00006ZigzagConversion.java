/**
 * https://leetcode-cn.com/problems/zigzag-conversion/
 *
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *
 * @auther: Feng Yapeng
 * @since: 2019/2/12 18:31
 */
public class I00006ZigzagConversion {

    public static void main(String[] args) {

        System.out.println(convert("A", 2));
    }

    public static String convert(String s, int numRows) {
        int jumpNum = (numRows - 1) * 2;
        if (jumpNum == 0) {
            jumpNum = 1;
        }
        char[] converts = new char[s.length()];
        int charIdx = 0;
        for (int i = 0; i < numRows; i++) {

            int subJump = 0;
            if (i != 0 && i != numRows - 1) {
                subJump = jumpNum - i - i;
            }
            for (int j = i; j < s.length(); j += jumpNum) {
                converts[charIdx++] = s.charAt(j);
                if (subJump != 0 && j + subJump < s.length()) {
                    converts[charIdx++] = s.charAt(j + subJump);
                }
            }

        }
        return new String(converts);

    }

}
