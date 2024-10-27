import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        while(B!=0){
            int temp=B;
            B=A%B;
            A=temp;
        }
        System.out.println(A);
    }
}

