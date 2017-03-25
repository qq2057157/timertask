package com.free.hwt.quartz.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

/** 
 * @Description:字符串转换成TimeStamp工具类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class TimestampConverter implements Converter<String, Timestamp> {

	
	@Override
	public Timestamp convert(String timeStr) {
		Timestamp t =null;
        if(!StringUtils.isEmpty(timeStr)){
        	SimpleDateFormat datetimeFormat = new SimpleDateFormat(
    				"yyyy-MM-dd HH:mm:ss");
        	try {
				Date date= datetimeFormat.parse(timeStr);
		            t=new Timestamp(date.getTime());
		            return t;
			} catch (ParseException e) {
				System.out.println("时间戳转换失败");
				e.printStackTrace();
				
			}
           
        }
		return null;
	}

}
