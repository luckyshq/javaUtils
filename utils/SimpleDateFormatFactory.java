/**
 * Created by zhangshengqi on 14-11-21.
 */

import java.text.SimpleDateFormat;

/**
 * @Author: luckyshq
 * @Time: 2014-11-21 11:37
 * @Describe: 直接返回构造好的DateFormat工具类
 */

public class SimpleDateFormatFactory {

    private static final String YEAR = "年";
    private static final String MONTH = "月";
    private static final String DAY = "日";
    private static final String HOUR = "时";
    private static final String MINUTE = "分";
    private static final String SECOND = "秒";

    private static final String YMDHMS_ONE = "yy/MM/dd HH:mm:ss"; //e.g. 14/11/21 11:37:34
    private static final String YMDHMS_TWO = "yyyy-MM-dd HH:mm:ss"; //e.g. 2014-11-21 11:37:34
    private static final String YMDHMS_CN = "yyyy年MM月dd日 HH时mm分ss秒"; //e.g. 2014年11月21日 11时37分34秒

    private static SimpleDateFormat mInstance = new SimpleDateFormat();

    private SimpleDateFormatFactory(){
        throw new AssertionError();
    }

    private static SimpleDateFormat apply(String string){
        mInstance.applyPattern(string);
        return mInstance;
    }

    public static SimpleDateFormat getYear(){
        return apply("yyyy" + YEAR);
    }

    public static SimpleDateFormat getMonth(){
        return apply("MM" + MONTH);
    }

    public static SimpleDateFormat getDay(){
        return apply("dd" + DAY);
    }

    public static SimpleDateFormat getHour(){
        return apply("HH" + HOUR);
    }

    public static SimpleDateFormat getMinute(){
        return apply("mm" + MINUTE);
    }

    public static SimpleDateFormat getSecond(){
        return apply("ss" + SECOND);
    }

    public static SimpleDateFormat getYMDHMS(){
        return apply(YMDHMS_ONE);
    }

    public static SimpleDateFormat getYMDHMSC(){
        return apply(YMDHMS_CN);
    }



}
