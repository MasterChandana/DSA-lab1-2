import java.util.*;

public class arrayoperation {

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("addition of all numbers in array: " + sum);
        System.out.println();
        int avg = sum / arr.length;
        System.out.println("average of all numbers in array: " + avg);
        System.out.println("enter 2 index number for substraction");
         final int a, b;
         a = sc.nextInt();
         b = sc.nextInt();
        while (a < arr.length && b < arr.length) {
            System.out.println("enter valid index number");
         
        }
        if (arr[a] > arr[b]) {
            System.out.println("substraction of 2 index number: " + (arr[a] - arr[b]));
        } else {
            System.out.println("substraction of 2 index number: " + (arr[b] - arr[a]));
        }

        System.out.println("enter the element to be searched");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("element found at index " + i);
                return;
            }
        }
        System.out.println("element not found");
    }
}
