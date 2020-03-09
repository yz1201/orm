package cn.dbdj1201.orm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tyz1201
 * @datetime 2020-03-10 1:08
 * 日期转换工具类
 **/
public class DateUtils {

    /**
     * 日期转字符串
     *
     * @param source
     * @param pattern
     * @return
     */
    public static String date2String(Date source, String pattern) {
        return new SimpleDateFormat(pattern).format(source);
    }

    /**
     * 字符串转日期
     *
     * @param source
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Date string2Date(String source, String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(source);
    }
}
