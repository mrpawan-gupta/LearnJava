package BasicJava ;

import java.util.*;

class Check_Prime_till_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the First Number : "); 
        int start = scanner.nextInt();

        System.out.print("Enter the Second Number : "); 
        int end = scanner.nextInt();

        for( int n  = start; n <= end; n++){
            int count = 0 ;

            // try to divide n and increment count by 1

            for( int div = 2 ; div * div <= n ; div++ ){
                if( n % div == 0 ){
                    count++;
                    break;
                }
            }

            // Try to divide n and increment count by 1

            if( count == 0 ) System.out.println(n);
        }

        scanner.close();
    }
}
