/**
 * @Author: luckyshq
 * @Time: 2014-12-1 19:08
 * @Describe: 数学相关工具类
 */

public class MyMath {

    private static final int BASE = 10; //进制,默认为十进制

    /**
     * 获取型数字位数
     * @param number 要获取位数的数字
     * @return 数字的位数
     */
    public static int getDigit(int number){
        int digit = 0;
        while (0 != number) {
            digit++;
            number /= BASE;
        }
        return digit;
    }

    public static int getDigit(long number){
        int digit = 0;
        while (0 != number) {
            digit++;
            number /= BASE;
        }
        return digit;
    }

    /**
     * 判断数字是否是回文数
     * @param number 要判断的数字
     * @return true:是 false:否
     */
    public static boolean isPalindromic(int number){
        int digit = getDigit(number);
        if (digit % 2 != 0) {
            return false;
        }
        int[] numberArray = new int[digit];
        for (int i = 0; i < digit; i++) {
            numberArray[i] = number % BASE;
            number /= BASE;
        }
        for (int i = 0; i < digit / 2; i++) {
            if (numberArray[i] != numberArray[digit - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 判断一个数字是不是质数
     * @param number 要判断的数字
     * @return true:是 false:否
     */
    public static boolean isPrimeNumber(int number){
        if (2 == number || number % 2 != 0){
            int sqrt = (int) Math.sqrt(number);
            for (int i = 3; i <= sqrt; i++){
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }



}
