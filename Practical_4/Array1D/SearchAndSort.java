package Array1D;
import java.util.*;

public class SearchAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search
        System.out.print("Enter key for Linear Search: ");
        int key = sc.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1)
            System.out.println("Found at index: " + foundIndex);
        else
            System.out.println("Not found in array");

        // Sort array for Binary Search
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int x : arr) System.out.print(x + " ");

        // Binary Search
        System.out.print("\nEnter key for Binary Search: ");
        int bkey = sc.nextInt();
        int low = 0, high = n - 1, mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == bkey) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            }
            if (arr[mid] < bkey) low = mid + 1;
            else high = mid - 1;
        }
        if (!found)
            System.out.println("Not found by binary search");
        sc.close();
    }
}
