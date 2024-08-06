import java.util.Scanner;

public class BinarySearch {

	public static void binarySearchSimpleMethod(int[] arr, int l, int m, int h, int el) {
		boolean isFind = true;
		int ls = l, hs = h, ms = m;
		while (l <= h) {

//			For ascending 	

			if (arr[m] == el && isFind) {
				System.out.println("The position of element of above array :- in array index - " + m
						+ " and it is exiting at element posititon " + (m + 1));
				isFind = false;
				break;
			} else if (el < arr[m]) {
				h = m - 1;
			} else if (el > arr[m]) {
				l = m + 1;
			}
			m = l + (h - l) / 2;
		}

//	For descending 	
		while (ls <= hs && isFind) {

			if (arr[ms] == el) {
				System.out.println("The position of element of above array :- in array index - " + ms
						+ " and it is exiting at element posititon " + (ms + 1));
				isFind = false;
				break;
			} else if (el < arr[ms]) {
				ls = ms + 1;

			} else if (el > arr[ms]) {
				hs = ms - 1;
			}
			ms = ls + (hs - ls) / 2;
		}
		if (isFind) {
			System.out.println("This element does not exist. Thanks!");
		}
	}

	public static void recursive(int[] arr, int l, int m, int h, int el, boolean[] isFind) {

//			For ascending 	

		m = l + (h - l) / 2;

		if (l > h || 0 > l || m < 0) {
			return;
		}
		if (arr[m] == el) {
			System.out.println("The position of element of above array :- in array index - " + m
					+ " and it is exiting at element posititon " + (m + 1));
			isFind[0] = false;
			return;
		} else if (el < arr[m]) {
			recursive(arr, l, m, (m - 1), el, isFind);
		} else if (el > arr[m]) {
			recursive(arr, (m + 1), m, h, el, isFind);
		}

	}

	public static void desRecursive(int[] arr, int l, int m, int h, int el, boolean[] isFind) {

//descending

		m = l + (h - l) / 2;

		if (l > h || 0 > l || m < 0) {
			return;
		}
		if (arr[m] == el) {
			System.out.println("The position of element of above array :- in array index - " + m
					+ " and it is exiting at element posititon " + (m + 1));
			isFind[0] = false;
			return;
		} else if (el < arr[m]) {
			desRecursive(arr, (m + 1), m, h, el, isFind);
		} else if (el > arr[m]) {
			desRecursive(arr, l, m, (m - 1), el, isFind);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		System.out.println();
		for (int k = 0; k <= 9; k++) {
//        
			// Check if there's an integer input

			System.out.println("Enter Value integers: " + k + " index");
//                System.out.println();
			arr[k] = sc.nextInt();

		}

		int n = arr.length;
		int l = 0, h = n - 1, m = l + (h - l) / 2;
		System.out.println("Find the array's an elemnet position:");
		for (int k = 0; k <= n - 1; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("Enter an element of above array");

		int el = sc.nextInt();

//		binarySearchSimpleMethod(arr, l, m, h, el);

		boolean[] isFind = { true };
		recursive(arr, l, m, h, el, isFind);
		if (isFind[0]) {
			desRecursive(arr, l, m, h, el, isFind);
		}
		if (isFind[0]) {
			System.out.println("This element does not exist. Thanks!");
		}

	}

}