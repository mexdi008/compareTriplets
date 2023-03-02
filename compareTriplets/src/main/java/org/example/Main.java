package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int AlicePoint = 0;
		int BobPoint = 0;
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			arr1[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			arr2[i] = scanner.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if (arr1[i] > arr2[i]) {
				AlicePoint++;
			} else if (arr2[i] > arr1[i]) {
				BobPoint++;
			}
		}
		System.out.println(AlicePoint + " " + BobPoint);
	}
}