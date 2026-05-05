import java.util.*;
public class MinOps 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();
        int rem = arr[0] % k;
        for (int x : arr) 
        {
            if (x % k != rem) 
            {
                System.out.println("Output: -1");
                return;
            }
        }
        Arrays.sort(arr);
        int median = arr[n / 2];
        int operations = 0;
        for (int x : arr) {
            operations += Math.abs(x - median) / k;
        }
        System.out.println("Minimum operations required: " + operations);
    }
}


