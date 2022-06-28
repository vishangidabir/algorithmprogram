package com.bridgelabz;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	static String name = "<<name>>";
    static String fullName = "<<full name>>";
    static String mobileNumber = "xxxxxxxxxx";
    static String date = "xx/xx/xxxx";
    
    static String print;

    private static void customizedMessage(String message) {
    	Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(message);
        print = matcher.replaceAll("Sai");
        Pattern pattern1 = Pattern.compile(fullName);
        Matcher matcher1 = pattern1.matcher(print);
        print = matcher1.replaceAll("Sai Pallavi");
        Pattern pattern2 = Pattern.compile(mobileNumber);
        Matcher matcher2 = pattern2.matcher(print);
        print = matcher2.replaceAll("846846625");
        LocalDateTime localDateTime = LocalDateTime.now();
        Pattern pattern3 = Pattern.compile(date);
        Matcher matcher3 = pattern3.matcher(print);
        print = matcher3.replaceAll(date.format(String.valueOf(localDateTime)));
        System.out.println(print);
		
	}
    public static void main(String[] args) {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is +91 xxxxxxxxxx. Please,let us know in case of any clarification. Thank you BridgeLab 01/01/2016.";
        customizedMessage(message);
    }  
}