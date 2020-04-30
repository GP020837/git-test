package cn.itcast.idea.basicplus.javaapi2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * API2Test class
 *
 * @author hzx
 * @date 2020-04-19
 */
public class API2Test {
    public static void main(String[] args) {
        Date date = new Date();
        //1587259576444

        System.out.println(date.getTime());
        Date dates = new Date(1587259576444L);
        System.out.println(dates);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:s");
        String format = sdf.format(date);
        System.out.println(format);
    }
}
