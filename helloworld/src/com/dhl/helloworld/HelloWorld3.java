package com.dhl.helloworld;

import java.util.Scanner;

public class HelloWorld3 {
	public static void main(String[] args) {

		String s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		s = scanner.nextLine();
		scanner.close();
		String stuppr = s.toUpperCase();
		int[] ret_a = new int[27];
		int count = stuppr.length();
        
		for (int k = 0; k < stuppr.length(); k++) {
			char charAt = stuppr.charAt(k);
			if (charAt >= 'A' && charAt <= 'Z') {
				ret_a[k] = charAt + 1 - 'A';
			} // else if (charAt == ' ') {
//                   ret_a[k] = 0;
			// }
			else {
				ret_a[k] = 0;
			}
		}

		char[] cs = new char[] { '#', ' ' };
		Alphabets al = new Alphabets(); 
		short[][][] alphabet = al.initializer();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < count; j++) {
				for (int k = 0; k < 5; k++) {
					// System.out.println(alphabet[ret_a[j]][i][k]);
					sb.append(cs[alphabet[ret_a[j]][i][k]]);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());

	}

}

 class Alphabets
{
	public short[][][] initializer()
	{
		short[][][] alphabet = new short[27][5][5];		
		
		alphabet[0] = new short[][] {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		alphabet[1] = new short[][]{{1,1,0,1,1},{1,0,1,0,1},{0,1,0,1,0},{0,1,1,1,0},{0,1,1,1,0}};
		alphabet[2] = new short[][]{{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,1},{0,1,1,1,0},{0,0,0,0,0}};
		alphabet[3] = new short[][]{{1,0,0,0,0},{0,1,1,1,1},{0,1,1,1,1},{0,1,1,1,1},{1,0,0,0,0}};
		alphabet[4] = new short[][]{{0,0,0,0,1},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{0,0,0,0,1}};
		alphabet[5] = new short[][]{{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,1},{0,1,1,1,1},{0,0,0,0,0}};
		alphabet[6] = new short[][]{{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,1},{0,1,1,1,1},{0,1,1,1,1}};
		alphabet[7] = new short[][]{{1,0,0,0,0},{0,1,1,1,1},{0,1,0,0,0},{0,1,1,0,0},{1,0,0,0,0}};
		alphabet[8] = new short[][]{{0,1,1,1,0},{0,1,1,1,0},{0,0,0,0,0},{0,1,1,1,0},{0,1,1,1,0}};
		alphabet[9] = new short[][]{{0,0,0,0,0},{1,1,0,1,1},{1,1,0,1,1},{1,1,0,1,1},{0,0,0,0,0}};
		alphabet[10] = new short[][]{{0,0,0,0,0},{1,1,0,1,1},{1,1,0,1,1},{0,1,0,1,1},{0,0,0,1,1}};
		alphabet[11] = new short[][]{{0,1,1,1,0},{0,1,1,0,1},{0,0,1,1,1},{0,1,1,0,1},{0,1,1,1,0}};
		alphabet[12] = new short[][]{{0,1,1,1,1},{0,1,1,1,1},{0,1,1,1,1},{0,1,1,1,1},{0,0,0,0,0}};
		alphabet[13] = new short[][]{{0,1,1,1,0},{0,0,1,0,0},{0,1,0,1,0},{0,1,1,1,0},{0,1,1,1,0}};
		alphabet[14] = new short[][]{{0,1,1,1,0},{0,0,1,1,0},{0,1,0,1,0},{0,1,1,0,0},{0,1,1,1,0}};
		alphabet[15] = new short[][]{{1,0,0,0,1},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{1,0,0,0,1}};
		alphabet[16] = new short[][]{{0,0,0,0,1},{0,1,1,1,0},{0,0,0,0,1},{0,1,1,1,1},{0,1,1,1,1}};
		alphabet[17] = new short[][]{{1,0,0,0,1},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,0,0},{1,0,0,0,0}};
		alphabet[18] = new short[][]{{0,0,0,0,1},{0,1,1,1,0},{0,0,0,0,1},{0,1,0,1,1},{0,1,1,1,0}};
		alphabet[19] = new short[][]{{1,0,0,0,0},{0,1,1,1,1},{1,0,0,0,1},{1,1,1,1,0},{0,0,0,0,1}};
		alphabet[20] = new short[][]{{0,0,0,0,0},{1,1,0,1,1},{1,1,0,1,1},{1,1,0,1,1},{1,1,0,1,1}};
		alphabet[21] = new short[][]{{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{1,0,0,0,1}};
		alphabet[22] = new short[][]{{0,1,1,1,0},{0,1,1,1,0},{0,1,1,1,0},{1,0,1,0,1},{1,1,0,1,1}};
		alphabet[23] = new short[][]{{0,1,1,1,0},{0,1,1,1,0},{0,1,0,1,0},{0,0,1,0,0},{0,1,1,1,0}};
		alphabet[24] = new short[][]{{0,1,1,1,0},{1,0,1,0,1},{1,1,0,1,1},{1,0,1,0,1},{0,1,1,1,0}};
		alphabet[25] = new short[][]{{0,1,1,1,0},{1,0,1,0,1},{1,1,0,1,1},{1,0,1,1,1},{0,1,1,1,1}};
		alphabet[26] = new short[][]{{0,0,0,0,0},{1,1,1,0,1},{1,1,0,1,1},{1,0,1,1,1},{0,0,0,0,0}};
		
		return alphabet;
}

}
