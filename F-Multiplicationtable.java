import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(N+" * "+i+" = "+i*N);
        }
    }
}

