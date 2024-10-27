import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.println(i);
            }else if(N==1){
                System.out.println(-1);
            }
        }
    }
}
