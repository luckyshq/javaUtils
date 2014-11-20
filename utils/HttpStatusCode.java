/**
 *@Author: luckyshq
 *@Time: 2014-11-11 12:01
 *@Describe: 所有的Http状态码常量
 *
 *@Reference: http://zh.wikipedia.org/wiki/HTTP状态码
 */
public class HttpStatusCode {

    private HttpStatusCode(){
        throw new AssertionError();
    }

    /**
     * 1xx消息
     *
     * 这一类型的状态码，代表请求已被接受，需要继续处理。
     * 这类响应是临时响应，只包含状态行和某些可选的响应头信息，并以空行结束。
     * 由于HTTP/1.0协议中没有定义任何1xx状态码，所以除非在某些试验条件下，服务器禁止向此类客户端发送1xx响应。
     * 这些状态码代表的响应都是信息性的，标示客户应该采取的其他行动。
     */
    public static final int CONTINUE = 100;
    public static final int SWITCHING_PROTOCOLS = 101;
    public static final int PROCESSING = 102;


    /**
     * 2xx成功
     *
     * 这一类型的状态码，代表请求已成功被服务器接收、理解、并接受。
     */
    public static final int SUCCESS = 200;
    public static final int CREATED = 201;
    public static final int ACCEPTED = 202;
    public static final int NON_AUTHORITATIVE_INFORMATION = 203;
    public static final int NO_CONTENT = 204;
    public static final int RESET_CONTENT = 205;
    public static final int PARTIAL_CONTENT = 206;
    public static final int MULTI_STATUS = 207;


    /**
     * 3xx重定向
     *
     * 这类状态码代表需要客户端采取进一步的操作才能完成请求。
     * 通常，这些状态码用来重定向，后续的请求地址（重定向目标）在本次响应的Location域中指明。
     * 当且仅当后续的请求所使用的方法是GET或者HEAD时，用户浏览器才可以在没有用户介入的情况下自动提交所需要的后续请求。
     * 客户端应当自动监测无限循环重定向（例如：A→B→C→……→A或A→A），因为这会导致服务器和客户端大量不必要的资源消耗。
     * 按照HTTP/1.0版规范的建议，浏览器不应自动访问超过5次的重定向。
     */
    public static final int MULTIPLE_CHOICES = 300;
    public static final int MOVED_PERMANENTLY = 301;
    public static final int FOUND = 302;
    public static final int SEE_OHTER = 303;
    public static final int NOT_MODIFIED = 304;
    public static final int USE_PROXY = 305;
    public static final int SWITCH_PROXY = 306;
    public static final int TEMPORARY_REDIRECT = 307;


    /**
     * 4xx客户端错误
     *
     * 这类的状态码代表了客户端看起来可能发生了错误，妨碍了服务器的处理。
     * 除非响应的是一个HEAD请求，否则服务器就应该返回一个解释当前错误状况的实体，以及这是临时的还是永久性的状况。
     * 这些状态码适用于任何请求方法。浏览器应当向用户显示任何包含在此类错误响应中的实体内容。
     * 如果错误发生时客户端正在传送数据，那么使用TCP的服务器实现应当仔细确保在关闭客户端与服务器之间的连接之前，客户端已经收到了包含错误信息的数据包。
     * 如果客户端在收到错误信息后继续向服务器发送数据，服务器的TCP栈将向客户端发送一个重置数据包，
     * 以清除该客户端所有还未识别的输入缓冲，以免这些数据被服务器上的应用程序读取并干扰后者。
     */
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int PAYMENT_REQUIRED = 402;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int METHOD_NOT_ALLOWED = 405;
    public static final int NOT_ACCEPTABLE = 406;
    public static final int PROXY_AUTHENTICATION_REQUIRED = 407;
    public static final int REQUEST_TIMEOUT = 408;
    public static final int CONFLICT = 409;
    public static final int GONE = 410;
    public static final int LENGTH_REQUIRED = 411;
    public static final int PRECONDITION_FAILED = 412;
    public static final int REQUEST_ENTITY_TOO_LARGE = 413;
    public static final int REQUEST_URI_TOO_LONG = 414;
    public static final int UNSUPPORTED_MEDIA_TYPE = 415;
    public static final int REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    public static final int EXPECTATION_FAILED = 417;
    public static final int IM_A_TEAPOT = 418;
    public static final int THERE_ARE_TOO_MANY_CONNECTIONS = 421;
    public static final int UNPROCESSABLE_ENTITY = 422;
    public static final int LOCKED = 423;
    public static final int FAILED_DEPENDENCY = 424;
    public static final int UNORDERED_COLLECTION = 425;
    public static final int UPGRADE_REQUIRED = 426;
    public static final int RETRY_WITH = 449;


    /**
     * 5xx服务器错误
     *
     * 这类状态码代表了服务器在处理请求的过程中有错误或者异常状态发生，
     * 也有可能是服务器意识到以当前的软硬件资源无法完成对请求的处理。
     * 除非这是一个HEAD请求，否则服务器应当包含一个解释当前错误状态以及这个状况是临时的还是永久的解释信息实体。
     * 浏览器应当向用户展示任何在当前响应中被包含的实体。这些状态码适用于任何响应方法。
     */
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int NOT_IMPLEMENTED = 501;
    public static final int BAD_GATEWAY = 502;
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final int GATEWAY_TIMEOUT = 504;
    public static final int HTTP_VERSION_NOT_SUPPORTED = 505;
    public static final int VARIANT_ALSO_NEGOTIATES = 506;
    public static final int INSUFFICIENT_STORAGE = 507;
    public static final int BANDWIDTH_LIMIT_EXCEEDED = 509;
    public static final int NOT_EXTENDED = 510;

}





