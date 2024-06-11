package com.dhl.helloworld;
public class HelloWorld0 {

	public static void main(String[] args) {
		testTwo();
		
//	testOne(5,80);
	}

	private static void testTwo() {
		char[] cs = new char[] {'#', ' '};
	    short[][] hello = new short[][] {
			{0,1,1,1,0,1,0,0,0,0,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0},
			{0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,0},
			{0,0,0,0,0,1,0,0,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,0,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0},
			{0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1,1,0},
			{0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0}};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < hello.length; i++) {
			short[] ts = hello[i];
			for (int j = 0; j < ts.length; j++) {
				sb.append(cs[ts[j]]);
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}

	private static void testOne(int lines, int chars) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < chars; j++) {
				sb.append('#');
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}

}