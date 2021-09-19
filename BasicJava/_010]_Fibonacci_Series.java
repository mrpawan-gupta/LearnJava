package BasicJava;

import java.util.*;

class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the last number of series: ");

        int end = input.nextInt();

        int first = 0 ;
        int second = 1 ;
        
        System.out.println(first + " " + second + " ");
        int nextElement = 0 ;

        for (int i = 0 ; i <=end ; i++) {
            nextElement = first + second  ;
            first = second ;
            second = nextElement ;
            if(nextElement > end){
                 break ;
            }
            System.out.print( nextElement + " ");
        }
        input.close();
    }
}
