package com.liyi.cms.utils;

/**
 * @ClassName: FileUtil 
 * @Description: 文件工具类
 * @author:liyi 
 * @date: 2020年4月9日 下午2:37:11
 */
public class FileUtil {
	
	public static String getExtendName(String fileName){
		//截取
		String newFileName = fileName.substring(fileName.indexOf(".jsp"));
		//返回jsp
		return newFileName;
	}
	
	public static void main(String[] args) {
		String extendName = getExtendName("bbb.jsp");
		System.out.println(extendName);
	}
}
