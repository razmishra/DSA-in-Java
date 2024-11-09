class day9{
    public static void main(String args[]){
        // int x = 0;
        // while(x<=30){
        //     x++;
        //     if(x%2==0){
        //         System.out.println(x);
        //     }
        // }

        // int x = 2;
        // int y =1;
        // while(y<=x){
        //     if(x%y==0){ /// 2%2 == 0
        //         if(y==x){
        //         System.out.println("Prime");
        //         }
        //         else{
        //             System.out.println("Not a prime");
        //         }
        //     }
        //     y++;
        // }

        // check if a numver is prime
        int x = 0;
        int d = 2;
        Boolean isPrime = true;
        if(x<2){
            System.out.println("Invalid inp");
            return; // program will return from here and won't execute below lines of code
        }
        while(d<x){
            if(x%d==0){
                isPrime = false;
            }
            d++;
        }
        if(isPrime==false){
            System.out.println("Not a prime");
        }else{
            System.out.println("Prime");
        }
    }
}