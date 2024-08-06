import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
        int[] arr = new int[10];
        
//          int n = 10;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        System.out.println();
        for (int k = 0 ; k <= 9 ; k++) {
//            
                // Check if there's an integer input
                   
                    System.out.println("Enter Value integers: " + k + " index");
//                    System.out.println();
                    arr[k] = sc.nextInt();
                                       
        }
        sc.close();
      int n = arr.length;
        System.out.print("Array before sorting:");
        for (int k = 0; k <= n-1; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i <= n - 1; i++){
            swapped = false;

            for (int j = 0; j < n - i -1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in 
            // the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.print("Array after sorting:");
        for (int k = 0; k <= n-1; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}