package com.liyi.cms.utils;

/**
 * @ClassName: FileUtil 
 * @Description: �ļ�������
 * @author:liyi 
 * @date: 2020��4��9�� ����2:37:11
 */
public class FileUtil {
	
	public static String getExtendName(String fileName){
		//��ȡ
		String newFileName = fileName.substring(fileName.indexOf(".jsp"));
		//����jsp
		return newFileName;
	}
	
	public static void main(String[] args) {
		String extendName = getExtendName("bbb.jsp");
		System.out.println(extendName);
	}
}
