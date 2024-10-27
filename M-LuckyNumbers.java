import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        boolean found = false;
        for(int i=A;i<=B;i++){
            int num = i;
            boolean isLucky=true;
            while(num>0){
            int digit = num%10;
            if(digit!=4&&digit!=7){
                isLucky=false;
                break;
            }
            num/=10;
        }
        if(isLucky){
            System.out.print(i+" ");
            found=true;
        }
    }
    if(!found){
        System.out.println(-1);
    }
  }
}

