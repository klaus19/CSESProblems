import java.util.Scanner;

public class WeirdAlgorithm {


    public int getWeird(int n){
        while (n!=1){
            if (n%2==0){
                n=n/2;
                System.out.println(n);
            }else if (n%2!=0){
                n=n*3+1;
                System.out.println(n);
            }
        }
       return n;
    }

    public static void main(String[] args) {
        WeirdAlgorithm w = new WeirdAlgorithm();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(w.getWeird(n));
    }
}
