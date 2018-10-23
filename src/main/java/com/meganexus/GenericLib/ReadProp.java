package com.meganexus.GenericLib;

public class ReadProp {
 public static void main(String[] args) {
	String propValue = ReadProperties.getProperty("Password");
	System.out.println(propValue);
}
}
