import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        while(true){
            int X = myObj.nextInt();
            if (X == 1999) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }
        }
    }
}

