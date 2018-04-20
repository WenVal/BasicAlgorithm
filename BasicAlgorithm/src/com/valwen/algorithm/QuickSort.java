package com.valwen.algorithm;

public class QuickSort {
	public static void quickSort(int a[], int low, int heiht) {
		if (low > heiht) {
			return;
		}
		int i = low;
		int j = heiht;
		int pivot = a[low];
		while (i < j) {
			while (j > i && a[j] > pivot) {
				j--;

			}
			while (j > i && a[i] <= pivot) {
				i++;
			}
			int temp;
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		int p = a[i];
		a[i] = a[low];
		a[low] = p;
		quickSort(a, low, i - 1);
		quickSort(a, i + 1, heiht);
	}

}
