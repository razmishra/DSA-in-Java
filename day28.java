import java.util.Scanner;

class day28 {
    public static void main(String args[]) {

        int arr1[] = { 1, 2, 3, 4, 5, -1, -10, 0, 0 };
        for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i]+" ");
        }

        // --- sum of array elements ---
        int sum = 0;
        for(int i=0; i<arr1.length; i++) {
        sum += arr1[i];
        }
        System.out.println("Sum of array elements: "+sum);

        // ---- array declaration 2----
        int arr2[] = new int[5];
        arr2[0] = 10;
        for (int i = 0; i < arr2.length; i++) {
        System.out.println(arr2[i]);
        }

        // ---- user input array ----
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close(); 
    }
}
