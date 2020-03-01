package site.beifeng.util;

/**
 * 数据时间和java时间转换
 *
 * @author admin
 * @date 2020年 02月28日 09:06:11
 */
public class DateUtil {

    public static java.sql.Timestamp d2t(java.util.Date d) {
        if (null == d)
            return null;
        return new java.sql.Timestamp(d.getTime());
    }

    public static java.util.Date t2d(java.sql.Timestamp t) {
        if (null == t)
            return null;
        return new java.util.Date(t.getTime());
    }
}
