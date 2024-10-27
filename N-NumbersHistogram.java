import java.util.Scanner;
public class NumbersHistogram {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char S = myObj.next().charAt(0);
        int N = myObj.nextInt();
        for(int i=1;i<=N;i++){
            int nums = myObj.nextInt();
            for(int j=1;j<=nums;j++){
                System.out.print(S);
            }
            System.out.println();
        }
    }
}
