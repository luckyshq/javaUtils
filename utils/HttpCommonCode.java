/**
 * @Author: luckyshq
 * @Time: 2014-11-11 12:24
 * @Describe: 常用的Http状态码常量
 */
public class HttpCommonCode {

    public static final int SUCCESS = 200;
    public static final int NOT_MODIFIED = 304;
    public static final int NOT_FOUND = 404;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int SERVICE_UNAVAILABLE = 503;

    private HttpCommonCode() {
        throw new AssertionError();
    }

    public static String getCodeString(int code) {
        switch (code) {
            case SUCCESS:
                return "success!";
            case NOT_MODIFIED:
                return "not modified!";
            case NOT_FOUND:
                return "not found!";
            case INTERNAL_SERVER_ERROR:
                return "internal server error!";
            case SERVICE_UNAVAILABLE:
                return "service unavailable!";
            default:
                break;
        }
        return "this code isn't exist!";
    }
}
