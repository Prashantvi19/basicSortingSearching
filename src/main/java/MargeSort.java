
import java.util.Scanner;
public class MargeSort {

//Devid the array 

	public static void divide(int[] arr,int s, int e) {
//		end the array index terminat conditon
		if(s>=e) {
			return;
		}
		
	int m = s+ (e-s)/2;
	divide(arr,s,m);
	//m+1 becous element m is share whith already and here we send m+1 to end value 
	divide(arr,m+1,e);

//	marge both array s to m and m+1 to e	
	conquer(arr,s,m,e);
	 
	
	}

	public static void conquer(int[] arr, int s, int m, int e) {
		int[] marge = new int[e - s + 1];
		int ms = s, // 1st array track
				mm = m + 1, // 2nd array track
				x = 0;// 3rd/marge array track

		while (ms <= m && mm <= e) { // ms<=m && mm <= e it is for ifg end the any array so it is terminate

			if (arr[ms] <= arr[mm]) {
				// if 1st array caintain small element
				marge[x++] = arr[ms++];
			} else {
				// if 2nd array caintain small element
				marge[x++] = arr[mm++];
			}
		}

		while (ms <= m) { // ms<=m it is for ifg end the any array so it is terminate

			// if 1st array caintain small element
			marge[x++] = arr[ms++];

		}
		while (mm <= e) { // mm <= e it is for ifg end the any array so it is terminate

			// if 2nd array caintain small element
			marge[x++] = arr[mm++];

		}

		for (int i = 0,j=s; i < marge.length; i++,j++) {

			arr[j] = marge[i];
		}

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
		System.out.print("Before sorting values by Marge Sort: ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

		divide(arr, 0, n - 1);

		System.out.print("After sorting values : ");
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}
}