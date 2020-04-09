package com.liyi.cms.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: StreamUtil 
 * @Description: 流处理工具类
 * @author:liyi 
 * @date: 2020年4月9日 下午2:37:21
 */
public class StreamUtil {
	
	/**
	 * @Title: closeAll 
	 * @Description: 批量关闭流
	 * @param autoCloseables
	 * @return: void
	 */
	public static void closeAll(AutoCloseable... autoCloseables ){
		for(AutoCloseable autoCloseable:autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String readTextFile(InputStream inputStream){
		inputStream = null;
		try {
			inputStream = new FileInputStream(new File(""));
			byte[] b = new byte[1024];
			String str = null;
			while (inputStream.read(b)!=-1) {
				str += new String(b);
			}
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally {
			closeAll(inputStream);
		}
	}
	
	public static String readTextFile(File file){
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] b = new byte[1024];
			String str = null;
			while (inputStream.read(b)!=-1) {
				str += new String(b);
			}
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally {
			closeAll(inputStream);
		}
	}
}
