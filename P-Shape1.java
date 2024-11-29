import java.util.Scanner;
public class Shape1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        for(int i=1;i<=N;i++){
            
            for(int j=N;j>i;j--){
            System.out.print("*");
        }
        System.out.println("*");
        }
    }
}
