import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int T = myObj.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int N = myObj.nextInt();
            long fact = 1;
            
            for (int j = 1; j <= N; j++) {    
                fact = fact * j;    
            }
            
            System.out.println(fact);
        }
    }
}
