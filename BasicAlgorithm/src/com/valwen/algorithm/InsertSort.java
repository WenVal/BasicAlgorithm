package com.valwen.algorithm;

public class InsertSort {
	public static void insertSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int InsertData = a[i];
			while (j > 0 && InsertData < a[j - 1]) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = InsertData;
		}
	}
}
