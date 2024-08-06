import java.util.Scanner;

public class SelectionSort {

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

		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = 1 + i; j < 10; j++) {

				if (arr[min] > arr[j]) {
					min = j;
				}

			}

			if (i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}
		}
		System.out.print("After sorting values : ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}
}
