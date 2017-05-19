package com.zrgk.test;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//md5º”√‹
public class TestMd5 {
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = 
			MessageDigest.getInstance("MD5");
		String str = "bbbbbbbb";
		
		byte[] bs = md.digest(str.getBytes());
		String newStr = new String(bs);
		System.out.println(newStr);
//		System.out.println(s);
	}

}
