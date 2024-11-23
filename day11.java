
class day11 {
    public static void main(String args[]) {
        // reverse a number
        // int rev = 0; // reversed number
        // int num = 1237; // input number

        // while(num>0){
        // int rem = num % 10;
        // rev = rev * 10 + rem;
        // num = num /10;
        // }
        // for(int i = num ; i>0; i = i/10){
        // int rem = i % 10;
        // rev = rev * 10 + rem;
        // }
        // System.out.println(rev);

        // ----- count digits in a number
        // int counter = 0;
        // int num = 12312;

        // while (num>0) {
        // num = num/10;
        // counter++;

        // }

        // for(int i= num;i>0;i = i/10){
        // counter++;
        // }
        // System.out.println(counter);

        // ---- product of digits of a number
        // int num = 0;
        // int product = 1;

        // while (num>0) {
        // int rem = num % 10;
        // product = product * rem;
        // num = num/10;
        // }
        // if(num==0){
        // System.out.println(num);
        // }
        // else{
        // System.out.println(product);
        // }

        // --- check for a prime number
        // boolean prime = true;
        // int num = 14;
        // if(num<2){
        // System.out.println("It is not a prime");
        // return;
        // }
        // for(int i = 2;i<num; i++){
        // if(num % i == 0) {
        // prime = false;
        // }
        // }
        // if(prime==false){
        // System.out.println("It is not a prime");
        // }else{
        // System.out.println("It is a prime number");
        // }

        for (int num = 1; num <= 123; num++) {

            boolean prime = true;
            if (num >= 2) {

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        prime = false;
                    }
                }
                if (prime == true) {
                    System.out.println(num);
                }
            }

        }

    }
}
