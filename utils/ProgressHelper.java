/**
 *@Author: luckyshq
 *@Time: 2014-11-13 14:23
 *@Describe: Progress工具类
 *
 */
public class ProgressHelp {
    static public final int PROGRESS_MAX = 100;
    static public final int PROGRESS_MIN = 0;
    static public final int ERROR = -1;

    private ProgressHelp(){
        throw new AssertionError();
    }

    /**
     * 默认初始值为0,获取Progress进度
     *
     * @param targetInt 目标值
     * @param currentInt 当前值
     * @return 进度
     */
    public static int getNormalProgress(int currentInt, int targetInt){
        if (currentInt <= 0) {
            return ERROR;
        } else if (currentInt >= targetInt) {
            return PROGRESS_MAX;
        } else if (0 == currentInt) {
            return PROGRESS_MIN;
        } else {
            return (int) (targetInt * 100 / currentInt);
        }
    }

    /**
     * 当目标值小于初始值时获取Progress完成进度
     *
     * @param startInt 初始值
     * @param targetInt 目标值
     * @param currentInt 当前值
     * @return 完成进度
     */
    public static int getProgressDown(int startInt, int targetInt, int currentInt){
        if (currentInt <= targetInt){
            return PROGRESS_MAX;
        } else if (currentInt >= startInt) {
            return PROGRESS_MIN;
        } else {
            return ((startInt - currentInt) * 100 / (startInt - targetInt));
        }
    }


    /**
     * 当目标值大于初始值是获取Progress完成进度
     *
     * @param startInt 初始值
     * @param targetInt 目标值
     * @param currentInt 当前值
     * @return
     */
    public static int getProgressUp(int startInt, int targetInt, int currentInt){
        if (currentInt >= targetInt){
            return PROGRESS_MAX;
        } else if (currentInt <= startInt){
            return PROGRESS_MIN;
        } else {
            return ((currentInt - startInt) * 100 / (targetInt - startInt));
        }
    }
}
