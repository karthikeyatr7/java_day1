package DAY03.Day_04.Day_04.Day_04;

import java.util.Scanner;
public class positivenegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positvie Number");
        }
        else if(num < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("It's Zero");
        }
        sc.close();
    }
}
