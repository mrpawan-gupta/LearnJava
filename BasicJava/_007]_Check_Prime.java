package BasicJava;

import java.util.* ;
import java.lang.Math;

class Check_Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number to check : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // method :--- 1
        int c = 0 ;
        for(int i = 2 ; i < num; i++) {
            if(num%i ==0){
                c++ ;
            }
        }
        if(c == 0){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }

        // method :----20

        c = 0 ;
        for(int i = 2 ; i < num; i++) {
            if(num%i ==0){
                c++ ;
                break ;
            }
        }
        if(c == 0){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }

        // method :--- 3 ;
        c = 0 ;
        for(int i = 2 ; i <= Math.sqrt(num); i++) {    
            // Note i < = Math.sqrt(nums) is also ==  i * i < num
            if(num%i ==0){
                c++ ;
                break ;
            }
        }
        if(c == 0){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }

        input.close();
    }
}
