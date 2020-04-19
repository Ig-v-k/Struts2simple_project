package com.struts2_iw.todo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClassTest {
	public static void main(String[] args) {
		
		String a1 = "1234567891234567";
//		String a2 = "100";
//		
//		int a1i = Integer.parseInt(a1);
//		int a2i = Integer.parseInt(a2);
//		
//		System.out.println("String (asd) ---> Integer = " + a1i); // <--- java.lang.NumberFormatException
//		System.out.println("String (100) ---> Integer = " + a2i);
//	    Pattern p = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
        Pattern p = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
//		Pattern p = Pattern.compile(".*");
        Matcher m = p.matcher(a1);
//        while(m.find()) {
//            System.out.println(m.group());
//        }
//        System.out.println(m.find());
		
//		\\d{16}
		
		System.out.println(a1.length());
		System.out.println(m.find());
		System.out.println(m.start());
		System.out.println(m.end());
		
//		System.out.println(Pattern.matches("\\d{16}", "1234567891234567"));
//		System.out.println(Pattern.matches("\\d{16}", "1234567891234567"));		
//		System.out.println(Pattern.matches("[a-zA-Z]+", "1234567891234567"));
//		System.out.println(Pattern.matches("\\s*", "1234567891234567"));
//		System.out.println(Pattern.matches("\\p{Alpha}+", "123456789124567"));
//		System.out.println(Pattern.matches("(\\p{Punct})+", "1@34567891?4567"));
//		System.out.println(Pattern.matches("\\p{Blank}+", "1234567891234567"));
		
//		System.out.println(m.matches());
	}
}
