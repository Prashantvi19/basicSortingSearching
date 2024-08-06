import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array's values:");

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the array's value for Index :" + i);
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		System.out.print("Before sorting values: ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			boolean k = false;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
				k = true;
			}
			if (k) {
				arr[j + 1] = key;
			}

		}
		System.out.print("After sorting values : ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}
}
