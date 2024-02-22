package org.techhub;

public class ArrayRotationApp {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };

		int i;
		int k = 0;
		int temp;
		while (k < 1) {
			temp = a[0];
			for (i = 0; i < a.length - 1; i++) {

				a[i] = a[i + 1];
			}

			a[i] = temp;
			k++;

		}

		for (int v : a) {
			System.out.println(v);
		}
	}

}
