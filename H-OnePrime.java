import java.util.Scanner;
public class OnePrime {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean isPrime = true;
        int X = myObj.nextInt();
        if(X<=1){
            isPrime = false;
        }else{
            for(int i=2;i<=Math.sqrt(X);i++){
                if(X%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
