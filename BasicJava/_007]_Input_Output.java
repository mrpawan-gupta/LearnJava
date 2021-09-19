package BasicJava ;

import java.util.*;

class Input_Output {
    public static void main(String[] args) {

        System.out.println("Enter the number") ;

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Number you entered: "+ num);

        input.close();
    }
    
}
