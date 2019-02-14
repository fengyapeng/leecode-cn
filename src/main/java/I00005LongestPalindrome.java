/**
 *
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * 最长回文串
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @auther: Feng Yapeng
 * @since: 2019/2/12 17:35
 */
public class I00005LongestPalindrome {


    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababd"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int maxLength = (s.length() - 1) * 2;
        int subMaxLength = 0;
        int start = 0, end = 0;

        for (int n = 1; n <= maxLength; n++) {
            boolean odd = n % 2 == 1;
            int left = odd ? n - 1 : n - 2;
            int right = odd ? n + 1 : n + 2;
            for (int j = 0; true; j += 2) {
                if (left - j < 0 || right + j > maxLength) {
                    break;
                }
                if (s.charAt((left - j) / 2) != s.charAt((right + j) / 2)) {
                    break;
                }
                if ((right + j) / 2 - (left - j) / 2 + 1 > subMaxLength) {
                    start = (left - j) / 2;
                    end = (right + j) / 2;
                    subMaxLength = end - start + 1;
                }
            }
        }
        if (start == 0 && end == 0) {
            return s.substring(0,1);

        }
        return s.substring(start, end + 1);

    }


}
