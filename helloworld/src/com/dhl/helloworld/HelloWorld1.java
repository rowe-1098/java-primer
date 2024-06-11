package com.dhl.helloworld;
import java.util.Scanner;

public class HelloWorld1 {
	public static void main(String[] args) {

		String s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		s = scanner.nextLine();
		scanner.close();
		String stuppr = s.toUpperCase();
		char a;
		int[] ret_a = new int[27];
		int count = 0;
		for (int k = 0; k < stuppr.length(); k++) {
			a = stuppr.charAt(k);

			StringBuilder sb = new StringBuilder();
			short[][][] alphabet = new short[][][] { {}, {}, {} };

			if (a == 'A') {
				ret_a[k] = 1;
				count++;
			} else if (a == 'B') {
				ret_a[k] = 2;
				count++;
			} else if (a == 'C') {
				ret_a[k] = 3;
				count++;
			} else if (a == 'D') {
				ret_a[k] = 4;
				count++;
			} else if (a == 'E') {
				ret_a[k] = 5;
				count++;
			} else if (a == 'F') {
				ret_a[k] = 6;
				count++;
			} else if (a == 'G') {
				ret_a[k] = 7;
				count++;
			} else if (a == 'H') {
				ret_a[k] = 8;
				count++;
			} else if (a == 'I') {
				ret_a[k] = 9;
				count++;
			} else if (a == 'J') {
				ret_a[k] = 10;
				count++;
			} else if (a == 'K') {
				ret_a[k] = 11;
				count++;
			} else if (a == 'L') {
				ret_a[k] = 12;
				count++;
			} else if (a == 'M') {
				ret_a[k] = 13;
				count++;
			} else if (a == 'N') {
				ret_a[k] = 14;
				count++;
			} else if (a == 'O') {
				ret_a[k] = 15;
				count++;
			} else if (a == 'P') {
				ret_a[k] = 16;
				count++;
			} else if (a == 'Q') {
				ret_a[k] = 17;
				count++;
			} else if (a == 'R') {
				ret_a[k] = 18;
				count++;
			} else if (a == 'S') {
				ret_a[k] = 19;
				count++;
			} else if (a == 'T') {
				ret_a[k] = 20;
				count++;
			}

			else if (a == 'U') {
				ret_a[k] = 21;
				count++;
			} else if (a == 'V') {
				ret_a[k] = 22;
				count++;
			} else if (a == 'W') {
				ret_a[k] = 23;
				count++;
			} else if (a == 'X') {
				ret_a[k] = 24;
				count++;
			} else if (a == 'Y') {
				ret_a[k] = 25;
				count++;
			} else if (a == 'Z') {
				ret_a[k] = 26;
				count++;
			} else if (a == ' ') {
				ret_a[k] = 0;
				count++;
			}

		}

		char[] cs = new char[] { '#', ' ' };
		short[][][] alphabet = initializer();
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

	public static short[][][] initializer()
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
