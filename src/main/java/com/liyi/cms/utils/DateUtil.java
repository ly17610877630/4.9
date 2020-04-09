package com.liyi.cms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil 
 * @Description: ���ڹ�����
 * @author:liyi 
 * @date: 2020��4��9�� ����2:37:00
 */
public class DateUtil {
	
	public static String getDateByInitMonth(Date src) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = format.format(new Date());
		//�µ�����
		String s2 = string.substring(0, 7)+"-01 00:00:00";
		//ת��������
		return s2;
	}
	
	public static String getDateByFullMonth(Date src) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = format.format(new Date());
		//�µ�����
		String s2 = string.substring(0, 7)+"-30 23:59:59";
		//ת��������
		return s2;
	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(new Date()));
		String dateByFullMonth = getDateByInitMonth(new Date());
		System.out.println(dateByFullMonth);
	}
}
