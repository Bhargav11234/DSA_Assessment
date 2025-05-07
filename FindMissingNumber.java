import  java.util.*;
class FindMissingNumber {
// Sec 1 **Find the Missing Number:**
    public static int findMissingNumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            arrSum= arrSum + arr[i];
        }
        return sum - arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The Size of the Array : ");
        int B = sc.nextInt();
        System.out.print("Enter The Array : ");
        int arr[] = new int[B];
        for( int i=0 ; i<B ; i++)
        {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {1, 2, 4, 5, 6};

        int n = 6;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}