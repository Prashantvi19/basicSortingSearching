import java.util.Scanner;

public class linearSequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		System.out.println();
		for (int k = 0; k <= 9; k++) {

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

		System.out.println("\n  Enter an element of above array");

		int el = sc.nextInt();
		boolean count = true;
		for (int k = 0; k <= n - 1; k++) {

			if (arr[k] == el) {

				System.out.println("The position of element of above array :- in array index - " + k
						+ " and it is exiting at element posititon " + (k + 1));
				count = false;
			}

		}
		if (count) {
			System.out.println("This element does not exist. Thanks!");
		}
	}

}
