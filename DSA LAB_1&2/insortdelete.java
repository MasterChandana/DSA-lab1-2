import java.util.*;

public class insortdelete {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("enter the element to be deleted");
        int v = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);


        }
     
       
    }
}