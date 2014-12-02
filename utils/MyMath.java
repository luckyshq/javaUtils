import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luckyshq
 * @Time: 2014-12-1 19:08
 * @Describe: 数学相关工具类
 */

public class MyMath {

    private static final int BASE = 10; //进制,默认为十进制
    public static final int ERROR = 0;

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

            //可以用质数表进行优化,而不用一个个的去除,但对于单个数的判断,每次都建个素数表有点得不偿失.
            for (int i = 3; i <= sqrt; i += 2){
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    public static boolean isPrimeNumber(long number){
        if (2 == number || number % 2 != 0) {
            long sqrt = (long) Math.sqrt(number);

            for (long i = 3; i <= sqrt; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * 获取前position个质数表
     * @param position 获取的质数个数
     * @return 前position个质数表(index从1开始,即primeList[1]是第一个质数)
     * 由于已经可以确定容器大小,所以就直接建数组,没必要用ArrayList.
     */
    public static int[] getPrimeListByPosition(int position){
        if (position > 0) {
            int positionCount = 1;
            int[] primeList = new int[position + 2];
            primeList[positionCount] = 2;
            for (int i = 3; positionCount <= position; i++){
                int j = 1;
                boolean flag = true;
                for (; primeList[j] * primeList[j] <= i; j++) {
                    if (i % primeList[j] == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    primeList[++positionCount] = i;
                }
            }

            return primeList;
        } else {
            return null;
        }
    }

    /**
     * 获取largest以内的质数表
     * @param largest 获取质数的最大值
     * @return 小于等于largest的质数表(index从1开始)
     * 由于长度不定,一次性用大数组空间消耗过大,所以初始化一个小的ArrayList.
     */
    private static final int DEFAULT_SIZE = 1000;

    public static List<Integer> getPrimeListByLargest(int largest){
        if (largest > 0){
            List<Integer> primeList = new ArrayList<Integer>(DEFAULT_SIZE);
            primeList.add(0);
            primeList.add(2);
            for (int i = 3; i <= largest; i++){
                int j = 1;
                boolean flag = true;
                for (; primeList.get(j) * primeList.get(j) <= i; j++){
                    if (i % primeList.get(j) == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    primeList.add(i);
                }
            }
            return primeList;
        } else {
            return null;
        }
    }

    /**
     * 获取第position个质数
     * @param position 获取质数的位置
     * @return 第position个质数
     */
    public static int getPrimeByPosition(int position){
        if (position > 0){
            return getPrimeListByPosition(position)[position];
        } else {
            return ERROR;
        }
    }



    



}
