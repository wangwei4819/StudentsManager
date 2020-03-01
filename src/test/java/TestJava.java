import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 测试一般类
 *
 * @author admin
 * @date 2020年 02月28日 00:51:57
 */
public class TestJava {

    @Test
    public void TestTime(){



        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        StringBuilder newsNo = new StringBuilder();
        newsNo.append(df.format(new Date()));// new Date()为获取当前系统时间，也可使用当前时间戳

        System.out.println(newsNo.append(getRandom(5)));
    }


    /**
     * 生成固定长度随机码
     * @param n    长度
     */
    private static long getRandom(long n) {
        long min = 1,max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
        return rangeLong;
    }
}
