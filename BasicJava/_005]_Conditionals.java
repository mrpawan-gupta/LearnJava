package BasicJava;

class Conditionals {
    public static void main(String[] args) {
        int a =  1000 ;
        int b = 10 ;

        // Simple If-Else Statements----->
        if(a<b) {
            System.out.println(a+" is greate than "+b);
        }
        else{
            System.out.println(b+" is greate than "+a);
        }

        // Nested If-Else Statements--->

        // Check which no is Greater and is even or odd ;
        int x =  2 ;
        int y = 3 ;

        if(x<y) {
            if(y%2 == 0) {
                System.out.println(y+" is greater than " + x + " and is Even");
            }
            else{
                System.out.println(y+" is greater than " + x + " and is Odd");
            }
        }   
        
         if(x>y) {
            if(x%2 == 0) {
                System.out.println(x+" is greater than " + y + " and is Even");
            }
            else{
                System.out.println(x+" is greater than " + y + " and is Odd");
            }
        }
    }
  }

