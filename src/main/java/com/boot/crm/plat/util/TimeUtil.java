package com.boot.crm.plat.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
public class TimeUtil {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 有时给时间类型字段(Date,Timestamp)用set赋值的时候,
     * 获取当前时间,类型是TimeStamp
     * @return
     * @throws ParseException
     */
    public static Timestamp getNowTime() throws ParseException {
        String format = sdf.format(new Date());
        Date parse = sdf.parse(format);
        return new Timestamp(parse.getTime());
    }
}
