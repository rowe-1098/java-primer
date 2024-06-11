package com.dhl.helloworld;

public class HelloWorld {

	private static final char FILL_CHAR = '#';//(char)9608;

	public static void main(String[] args) {
		char[] cs = new char[] {FILL_CHAR, ' '};
		short[][][] hello = new short[][][] {
			{{0},{0,1,1,1,0},{0,0,0,0},{0,1,1,1},{0,1,1,1},{1,0,0,0,1},{1,1,1},{0,1,1,1,0},{1,0,0,0,1},{0,0,0,1},{0,1,1,1},{0,0,0,0,1},{0}},
			{{0},{0,1,1,1,0},{0,1,1,1},{0,1,1,1},{0,1,1,1},{0,1,1,1,0},{1,1,1},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,0},{0,1,1,1},{0,1,1,1,0},{0}},
			{{0},{0,0,0,0,0},{0,0,0,0},{0,1,1,1},{0,1,1,1},{0,1,1,1,0},{1,1,1},{0,1,0,1,0},{0,1,1,1,0},{0,0,0,1},{0,1,1,1},{0,1,1,1,0},{0}},
			{{0},{0,1,1,1,0},{0,1,1,1},{0,1,1,1},{0,1,1,1},{0,1,1,1,0},{1,1,1},{0,0,1,0,0},{0,1,1,1,0},{0,1,1,0},{0,1,1,1},{0,1,1,1,0},{0}},
			{{0},{0,1,1,1,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{1,0,0,0,1},{1,1,1},{0,1,1,1,0},{1,0,0,0,1},{0,1,1,0},{0,0,0,0},{0,0,0,0,1},{0}}
		};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < hello.length; i++) {
			short[][] ts = hello[i];
			for (int j = 0; j < ts.length; j++) {
				for (int k = 0; k < ts[j].length; k++) {
					sb.append(cs[ts[j][k]]);
				}
				sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.println(test(1,62, FILL_CHAR));
		System.out.println(FILL_CHAR+test(1,60, ' ')+FILL_CHAR);
		System.out.print(sb.toString());
		System.out.println(FILL_CHAR+test(1,60, ' ')+FILL_CHAR);
		System.out.print(test(1,62, FILL_CHAR));
	}

	private static String test(int lines, int chars, char c) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < chars; j++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
