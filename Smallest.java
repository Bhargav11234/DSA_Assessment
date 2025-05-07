import  java.util.*;
public class Smallest {

// Sec 5 Sorting and Searching 
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low - 1;         
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i + 1] and arr[high] to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;  
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == k) {
                return arr[pivotIndex];
            }
            else if (k < pivotIndex) {
                return quickSelect(arr, low, pivotIndex - 1, k);
            }
     
            else {
                return quickSelect(arr, pivotIndex + 1, high, k);
            }
        }
        return -1;  // Return -1 if k is out of range (this shouldn't happen if the inputs are valid)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array : ");
        int n = sc.nextInt();
        System.out.print(" Enter the Array : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of That You want to find Smallest NO :");
        int k = sc.nextInt();

        // int[] arr = {12, 3, 5, 7, 19, 8, 15}; 
        // int k = 4;  
        int kthSmallest = quickSelect(arr, 0, arr.length - 1, k - 1);

        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
