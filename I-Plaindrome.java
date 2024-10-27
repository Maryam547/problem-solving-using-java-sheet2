import java.util.Scanner;
public class Plaindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int X = myObj.nextInt();
        int orginalNum = X;
        int reversedNum = 0;
        while(X!=0){
            int digit = X%10;
            reversedNum = reversedNum*10+digit;
            X/=10;
        }
        if(orginalNum==reversedNum){
            System.out.println(reversedNum);
            System.out.println("YES");
        }else{
            System.out.println(reversedNum);
            System.out.println("NO");
        }
    }
}

