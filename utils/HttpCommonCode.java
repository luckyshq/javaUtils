/**
 *@Author: luckyshq
 *@Time: 2014-11-11 12:24
 *@Describe: 常用的Http状态码常量
 *
 */
 class HttpCommonCode {

    public static final int SUCCESS = 200;
    public static final int NOT_MODIFIED = 304;
    public static final int NOT_FOUND = 404;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int SERVICE_UNAVAILABLE = 503;

    public static String getCodeString(int code){
      switch (code) {
          case SUCCESS:
            return "success!"
            break;
          case NOT_MODIFIED:
            return "not modified!"
            break;
          case NOT_FOUND:
            return "not found!"
            break;
          case INTERNAL_SERVER_ERROR:
            return "internal server error!";
            break;
          case SERVICE_UNAVAILABLE:
            return "service unavailable!";
            break;
          default:
            break;
      }
    }
 }
