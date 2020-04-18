package com.struts2_iw.todo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClassTest {
	public static void main(String[] args) {
//		String a1 = "asd";
//		String a2 = "100";
//		
//		int a1i = Integer.parseInt(a1);
//		int a2i = Integer.parseInt(a2);
//		
//		System.out.println("String (asd) ---> Integer = " + a1i); // <--- java.lang.NumberFormatException
//		System.out.println("String (100) ---> Integer = " + a2i);
//	    Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
//      Pattern p = Pattern.compile("\\d+");
//		Pattern p = Pattern.compile(".*");
//        Matcher m = p.matcher("23457869g5234076");
//        while(m.find()) {
//            System.out.println(m.group());
//        }
//        System.out.println(m.find());
		System.out.println(Pattern.compile(".*").matcher("23457869g5234076").matches());
	}
}
