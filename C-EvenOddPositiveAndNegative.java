import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int posCount = 0;
        int negCount = 0;
        
        for (int i = 1; i <= N; i++) {
            int X = myObj.nextInt();
            
            if (X % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            if (X > 0) {
                posCount++;
            } else if (X < 0) {
                negCount++;
            }
        }
        
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Positive: " + posCount);
        System.out.println("Negative: " + negCount);
    }
}

