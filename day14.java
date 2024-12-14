class day14 {

    // definition
    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // method overloading
    // definition
    static void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }

    static void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is Even");
        } else {
            System.out.println(x + " is not Even");
        }
    }

    static void isPrime(int y) {

        if (y < 2) {
            System.out.println("Invalid input");
            return; // program will return from here and won't execute below lines of code
        }
        Boolean checkPrime = true;
        for (int i = 2; i <= y - 1; i++) {
            if (y % i == 0) {
                checkPrime = false;
            }

        }
        if (checkPrime == true) {
            System.out.println(y + "is prime");
        } else {
            System.out.println(y + "is not prime");
        }
    }

    public static void main(String[] args) {
        // sum(10, 5); // function calling
        // sum(13, 12); // function calling
        // sum(0, -1); // function calling
        // sum(0, -1, 12); // function calling

        // isEven(-1);
        isPrime(0);
    }
}
