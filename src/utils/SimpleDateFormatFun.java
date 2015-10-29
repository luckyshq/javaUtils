package utils;
import java.text.SimpleDateFormat;

/**
 * @Author: luckyshq
 * @Time: 2014-11-20 09:58
 * @Describe: 使用函数式实现的DateFormat工具类(感觉这个类有点画蛇添足>,< 仅供娱乐)
 * @Reference: http://developer.android.com/reference/java/text/SimpleDateFormat.html
 */

public final class SimpleDateFormatFun extends SimpleDateFormat {

    private static final String ERA = "G"; //e.g. AD

    private static final String YEAR = "y"; //e.g. yy:10 y/yyy/yyyy:2010
    private static final String YEAR_TWO = "yy";

    //TODO: 理解两者的区别
    private static final String STAND_ALONE_MONTH_SINGLE = "L"; //e.g. L:1 LL:01 LLL:Jan LLLL:January LLLLL:J
    private static final String STAND_ALONE_MONTH_TWO = "LL";
    private static final String STAND_ALONE_MONTH_THREE = "LLL";
    private static final String STAND_ALONE_MONTH_FOUR = "LLLL";
    private static final String STAND_ALONE_MONTH_FIVE = "LLLLL";
    private static final String MONTH_IN_YEAR_SINGLE = "M"; //e.g. M:1 MM:01 MMM:Jan MMMM:January MMMMM:J
    private static final String MONTH_IN_YEAR_TWO = "MM";
    private static final String MONTH_IN_YEAR_THREE = "MMM";
    private static final String MONTH_IN_YEAR_FOUR = "MMMM";
    private static final String MONTH_IN_YEAR_FIVE = "MMMMM";

    private static final String WEEK_IN_MONTH = "W"; //e.g. 2
    private static final String WEEK_IN_YEAR = "w"; //e.g. 27

    private static final String DAY_IN_YEAR = "D"; //e.g. 189
    private static final String DAY_IN_MONTH = "d"; //e.g. 10
    private static final String DAY_OF_WEEK_SINGLE = "E"; //e.g. E:Tue EEEE:Tuesday EEEEE:T
    private static final String DAY_OF_WEEK_FOUR = "EEEE";
    private static final String DAY_OF_WEEK_FIVE = "EEEEE";
    private static final String STAND_ALONE_DAY_OF_WEEK = "c"; //e.g. c/cc/ccc:Tue, cccc:Tuesday, ccccc:T
    private static final String DAY_OF_WEEK_IN_MONTH = "F"; //e.g. 2

    //没懂为什么h和k要交叉使用=.=
    private static final String HOUR_IN_DAY_ZERO = "H"; //e.g. 0 (0-23)
    private static final String HOUR_IN_DAY_ONE = "k"; //e.g. 24 (1-24)
    private static final String HOUR_IN_AM_OR_PM_ZERO = "K"; //e.g. 0 (0-11)
    private static final String HOUR_IN_AM_OR_PM_ONE = "h"; //e.g. 12 (1-12)
    private static final String AM_PM_MARKER = "a"; //e.g. PM

    private static final String MINUTE_IN_HOUR = "m"; //e.g. 30

    private static final String SECOND_IN_MINUTE = "s"; //e.g. 55
    private static final String FRACTIONAL_SECONDS = "S"; //e.g. 978

    private static final String TIME_ZONE = "Z"; //e.g. Z/ZZ/ZZZ:-0800 ZZZZ:GMT-08:00 ZZZZZ:-08:00

    private static String mPatternString = "";

    //用Singleton的话线程不安全,所以每次使用的时候都创建一个新对象.
    public SimpleDateFormatFun() {

    }

    public SimpleDateFormatFun a(String string) {
        mPatternString += string;
        return this;
    }

    public SimpleDateFormatFun fin() {
        this.applyPattern(mPatternString);
        return this;
    }

    public SimpleDateFormatFun era() {
        return a(ERA);
    }

    public SimpleDateFormatFun year() {
        return a(YEAR);
    }

    public SimpleDateFormatFun yearTwoNum() {
        return a(YEAR_TWO);
    }

    public SimpleDateFormatFun monthSANum() {
        return a(STAND_ALONE_MONTH_SINGLE);
    }

    public SimpleDateFormatFun monthSANumZero() {
        return a(STAND_ALONE_MONTH_TWO);
    }

    public SimpleDateFormatFun monthSAChar() {
        return a(STAND_ALONE_MONTH_THREE);
    }

    public SimpleDateFormatFun monthSACharFull() {
        return a(STAND_ALONE_MONTH_FOUR);
    }

    public SimpleDateFormatFun monthSACharSimple() {
        return a(STAND_ALONE_MONTH_FIVE);
    }

    public SimpleDateFormatFun monthNum() {
        return a(MONTH_IN_YEAR_SINGLE);
    }

    public SimpleDateFormatFun monthNumZero() {
        return a(MONTH_IN_YEAR_TWO);
    }

    public SimpleDateFormatFun monthChar() {
        return a(MONTH_IN_YEAR_THREE);
    }

    public SimpleDateFormatFun monthCharFull() {
        return a(MONTH_IN_YEAR_FOUR);
    }

    public SimpleDateFormatFun monthCharSimple() {
        return a(MONTH_IN_YEAR_FIVE);
    }

    public SimpleDateFormatFun weekInMonth() {
        return a(WEEK_IN_MONTH);
    }

    public SimpleDateFormatFun weekInYear() {
        return a(WEEK_IN_YEAR);
    }

    public SimpleDateFormatFun dayInYear() {
        return a(DAY_IN_YEAR);
    }

    public SimpleDateFormatFun day() {
        return a(DAY_IN_MONTH);
    }

    public SimpleDateFormatFun dayOfWeekChar() {
        return a(DAY_OF_WEEK_SINGLE);
    }

    public SimpleDateFormatFun dayOfWeekCharFull() {
        return a(DAY_OF_WEEK_FOUR);
    }

    public SimpleDateFormatFun dayOfWeekCharSimple() {
        return a(DAY_OF_WEEK_FIVE);
    }

    public SimpleDateFormatFun hour() {
        return a(HOUR_IN_DAY_ZERO);
    }

    public SimpleDateFormatFun hourStartOne() {
        return a(HOUR_IN_DAY_ONE);
    }

    public SimpleDateFormatFun hourAP() {
        return a(HOUR_IN_AM_OR_PM_ZERO);
    }

    public SimpleDateFormatFun hourAPStartOne() {
        return a(HOUR_IN_AM_OR_PM_ONE);
    }

    public SimpleDateFormatFun amOrPm() {
        return a(AM_PM_MARKER);
    }

    public SimpleDateFormatFun minute() {
        return a(MINUTE_IN_HOUR);
    }

    public SimpleDateFormatFun second() {
        return a(SECOND_IN_MINUTE);
    }

    public SimpleDateFormatFun secondFractional(){
        return a(FRACTIONAL_SECONDS);
    }

    public SimpleDateFormatFun timeZone(){
        return a(TIME_ZONE);
    }

    public SimpleDateFormatFun b(){
        return a(" ");
    }

    public SimpleDateFormatFun c(){
        return a(":");
    }

    public SimpleDateFormatFun s(){
        return a("//");
    }
}
