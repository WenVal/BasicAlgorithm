package com.valwen.algorithm;

public class SelectionSort {

	public static void selectionSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int position = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[position] > a[j]) {
					position = j;
				}
			}
			int temp = a[i];
			a[i] = a[position];
			a[position] = temp;

		}

	}
}
