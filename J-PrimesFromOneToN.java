import java.util.Scanner;
public class PrimesFromOneToN {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        for(int i=2;i<=N;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
