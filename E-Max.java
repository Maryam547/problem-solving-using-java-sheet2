import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int max=0;
        for (int i = 1; i <= N; i++) {
            int X = myObj.nextInt();
            max=Math.max(X,max);
        }
        System.out.println(max);
    }
}

