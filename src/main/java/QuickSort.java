
import java.util.Scanner;

public class QuickSort {

//Devid the array 

	public static void quickSort(int[] arr, int l, int h) {

		if (l < h) {
			int p = position(arr, l, h);
			quickSort(arr, l, p - 1);
			quickSort(arr, p + 1, h);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int position(int[] arr, int l, int h) {
		int povit = arr[h];
		int i = l - 1;
		
		for (int j = l; j < h; j++) {
			if (arr[j] < povit) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, h);
		return i;

	}

	public static void main(String[] ars) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array's values:");

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the array's value for Index :" + i);
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		System.out.print("Before sorting values by Quick Sort: ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

		quickSort(arr, 0, n - 1);

		System.out.print("After sorting values : ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}
}