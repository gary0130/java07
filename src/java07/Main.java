package java07;

import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("質數");
		System.out.println("輸入最大的值");
		int po = scn.nextInt();

		for (int i = 3; i < po; i++) {
			int p = 1;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					p = 0;
					break;
				}
			
			}
			if (p == 1) {
				System.out.println(i);
			}
		}

	}

}
