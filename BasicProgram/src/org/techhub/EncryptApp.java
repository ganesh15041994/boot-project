package org.techhub;

public class EncryptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCD";
		char ch[] = str.toCharArray();

		// char ch1[] = new char[ch.length];// 0 1 2 3

		for (int i = 0; i < ch.length; i++) {

			ch[i] = (char) ((char) ch[i] + 2); // 66+2 = 68
		}
		System.out.println("Encripted Format");
		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {

			ch[i] = (char) ((char) ch[i] - 2);

		}
		System.out.println("Depricipt  Format");

		System.out.println(ch);
		
		
//  For Printing The Star in String
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 1) {
				System.out.print("*");
			} else {

				System.out.print(str.charAt(i));
			}
		}

	}

}
