package com.meganexus.GenericLib;

public class Test {
	public static void main(String[] args) {

		int[] iarr = { 1, 3, 5, 10 };
		int search = search(7, iarr);
		System.out.println(search);
	}

	public static int search(int value, int[] a) {

		if (value < a[0]) {
			return a[0];
		}
		if (value > a[a.length - 1]) {
			return a[a.length - 1];
		}

		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = (hi + lo) / 2;

			if (value < a[mid]) {
				hi = mid - 1;
			} else if (value > a[mid]) {
				lo = mid + 1;
			} else {
				return a[mid];
			}
		}
		System.out.println("lo " + lo);
		System.out.println("hi " + hi);
		// lo == hi + 1
		return (a[lo] - value) < (value - a[hi]) ? a[lo] : a[hi];
	}
}
