package BasicJava;

import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");  
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int check = 0 ;
        while(num!=0) {
            check = (check*10) + (num % 10)  ;
            num = num/10 ;
            
        }

        System.out.println("Reverse Number : " + check);

        input.close();
    }
}
