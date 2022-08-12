import java.util.Scanner;
public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = makeArr();
        System.out.print(" Min element in array entered: " + findMin(arr));
    }
    public static int[] makeArr() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("Enter array length: ");
        length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter position element: " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[0]){
                min = arr[0];
            }
        }
        return min;
    }
}
