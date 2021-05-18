package com.qa.java;

public class Runner {

	public static String x;
	public static String m = "cat";

	public static Integer y;

	public static void main(String[] args) {

		// Primitive Data Types
		// int, boolean, short, long. float, double, char, byte

		// Wrapper classes, complex data type
		// String
		// RULES: no default value; null
		// Integer, Boolean, Short, long, Float, Double, Char, Byte
		Integer y = 0;
		boolean z = false;
		Short a = 0;
		Long b = 0L;
		Float c = 0.6f;
		Double d = 123.5;
		Character e = 'a';
		Byte f = 0;

		// y.compare(0, 0);

		int x = Integer.parseInt("12");

		String var = "Hello World";
		String var2 = new String("Hello World 2");

		// Wrapper provides useful methods, and stores the primitive value

		String str1 = "Hello World";
		char[] mycharArray = { 'H', 'E', 'l', 'l', 'o' };
		String str3 = new String(mycharArray);

		// int[] x = new int[3];

		System.out.println(m.replace("cat", "dog"));
		System.out.println(y.compare(11, 2));
		System.out.println(y);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(var);
		System.out.println(var2);

		// Comparing strings
		// System.out.println(str1.equals(str2));

		// find length of str1
		System.out.println(str1.length());

		System.out.println(mycharArray);
	}

}
