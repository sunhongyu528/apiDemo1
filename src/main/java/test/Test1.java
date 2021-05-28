package test;

import util.SignatureUtil;

import java.sql.Timestamp;
import java.util.Date;


public class Test1 {
    public static void main(String[] args) throws Exception{

        long t = System.currentTimeMillis();// 获得当前系统毫秒数,这个是1970-01-01到现在的毫秒数
        System.out.println("t = "+t);
        Date da = new Date(t);
        System.out.println("da = "+da);
        long currentTime = da.getTime(); // 即时毫秒数
        long ct=currentTime/1000;
        System.out.println("currentTime = "+currentTime);
        System.out.println("currentTime/1000 = "+ct);// 秒数
        String str=String.valueOf(ct);

        String get = SignatureUtil.sign("741j12ygHr1HmPsdFWHWuApMzKPiWeYD",
                "5iIqc20Feq7m0KfAihE6I075BF70TzheJ78Pyx5FkAEiMkYZ",
                "GET", "1234", str,
                "https://api.meeting.qq.com/v1/users/210024095",
                "1");

        System.out.println(get);

    }
}
