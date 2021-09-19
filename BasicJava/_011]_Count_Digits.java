package BasicJava;

import java.util.*;

class Count_Digit {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");  
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int check = 0 ;
        while(num!=0) {
            num = num/10 ;
            check = check + 1 ;
            
        }

        System.out.println("Nuber of Digits: " + check);

        input.close();
    }
}
