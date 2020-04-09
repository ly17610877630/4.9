package com.liyi.cms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author:liyi 
 * @date: 2020年4月9日 下午2:37:00
 */
public class DateUtil {
	
	public static String getDateByInitMonth(Date src) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = format.format(new Date());
		//新的日期
		String s2 = string.substring(0, 7)+"-01 00:00:00";
		//转换成日期
		return s2;
	}
	
	public static String getDateByFullMonth(Date src) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = format.format(new Date());
		//新的日期
		String s2 = string.substring(0, 7)+"-30 23:59:59";
		//转换成日期
		return s2;
	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(new Date()));
		String dateByFullMonth = getDateByInitMonth(new Date());
		System.out.println(dateByFullMonth);
	}
}
