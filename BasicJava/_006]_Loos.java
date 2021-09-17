package BasicJava;

class Loops {
    public static void main(String[] args) {
        int num = 10;

        /* 
            for loop---->
                for ( intitialization ; condition ; updation){
                    code Block ;
            }
        */
        
        int sum = 0;

        for(int i = 0 ; i <= num ; i++){
             sum+= i ;
        }

        System.out.println("The sum upto " + num+" is " + sum);
        
        /* While Loop----->

            initialization

            while(Condition){
                
                code Block ;;

                updation ;
            }
        */
        int x = 0 ;

        while(x<=9){
            System.out.println(x);
            x++;
        }

        System.out.println("Done!");
    }
    
}
