package test;

import java.io.*;
import java.util.StringTokenizer;

public class Algo {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String s = bf.readLine(); // String
//		int i = Integer.parseInt(bf.readLine()); // Int

//		System.out.println(s);

		StringTokenizer st = new StringTokenizer(s); // StringTokenizer인자값에 입력 문자열 넣음
		int a = Integer.parseInt(st.nextToken()); // 첫번째 호출
		int b = Integer.parseInt(st.nextToken()); // 두번째 호출

		if (b - 45 < 0) {
			if (a - 1 < 0) {
				a = 24;
			}
			System.out.println(a - 1 + " " + (60 + b - 45));
		} else {
			System.out.println(a + " " + (b - 45));
		}
	}
}
