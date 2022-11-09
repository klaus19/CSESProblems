import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public int getMissingNumber(int []nums){

        int n = nums.length + 1;
        int expected = n * (n - 1)/2;
        int actual = 0;
        int i = 0;
        while(i < nums.length){
            actual+=nums[i++];
        }
        return expected - actual;
    }

    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        int n=5;
        int[]arr = new int[n];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        System.out.println(ms.getMissingNumber(arr));
    }
}
