class day2 {
    // main method
    public static void main(String[] args) {
        // float var1 = 10.0f;
        // float var2 = 10.23f;
        // int result = (int) (var1 * var2); // type conversion
        // System.err.println(result);

        // true false
        // boolean result = (boolean) (var1 * var2); // type conversion
        // System.err.println(result);

        // arithmetic operations
        // + - * / %(modulus)

        // int add1 = 130;
        // int add2 = 20;
        // int result = add1 / add2; // 120/20
        // int result = add1 % add2; // 120/20
        // System.err.println(result);

        // how to convert a number into binary
        // 5 -> 101

        // byte -> -127 to 128
        // byte sh = 128;
        // int num = -128;

        // byte result = (byte) num;
        // System.out.println(-13%3);

        // int res1 = 12;
        // float fl = (float) res1;
        // System.out.println(fl);

        // we can convert varibles of smaller range into variables of larger range but
        // not vice versa
        // vice versa may result loss of data

        // int n1 = 12;
        // byte num = (byte) (n1) ;

        // type coersion -> jdk changes the data type of variables automatically
        // int res = 0b101;
        // System.out.println(res);

        // -----------------------------------------------------------------------------

        // Ascii numbers

        // int res = '0';
        // System.out.println(res);

        // 4 byte
        // 1 byte = 8 bit (0 , 1)
        // 32 bit (0, 1) 2^64

        // 256

        // 111111111111111

        // ---------------------------------------- Arithmetic operators---------------
        // 1. + (addition)
        // 2. - (subtraction)
        // 3. * (multiplication)
        // 4. / (division)
        // 5. % (modulus)
        // 6. ++ (increment)
        // 7. -- (decrement)

        // int num = 10;
        // num++;
        // num--;

        // -> pre-increment(++ var)
        // -> post-increment(var ++)
        // -> pre-decrement(--var)
        // -> post-decrement(var --)

        // int result = num++;

        // 1. result = num;
        // 2. num = num +1;

        // int result = ++num;

        // 1. num = num +1;
        // 2. result = num;

        // int result = --num;

        // 1. num = num -1;
        // 2. result = num;

        // int result = num--;

        // 1. result = num;
        // 2. num = num -1;

        // System.out.println(result);

        // int num = 13;
        // num++; // 14
        // ++num; // 15
        // int result = num++; // 15
        // ++result; // 16
        // System.out.println(result++);

        // ------------------ shorthands of assignment operators ---------------------
        // 1. +=
        // 2. -=
        // 3. *=
        // 4. /=
        // 5. %=

        // note: use only if performing operations on the same variable and assigning to
        // itself. Also known as assignment operator
        // int num = 14;
        // num += 13;
        // System.out.println(num);

        // int num = 14;
        // num -= 13;
        // System.out.println(num);

        // int num = 14;
        // num *= 13;
        // System.out.println(num);

        // int num = 14;
        // num /= 13;
        // System.out.println(num);

        // int num = 14;
        // num %= 13;
        // System.out.println(num);

        // ------------------------------- Assignment Operators -----------------------
        // int num = 12; // (= is an assignment operator)

        // ------------------------ Comparison Operators ------------------------------
        // 1. == (equal to)
        // 2.!= (not equal to)
        // 3. > (greater than)
        // 4. < (less than)
        // 5. >= (greater than or equal to)
        // 6. <= (less than or equal to)

        int num1 = 10;
        float num2 = 10.0f;
        boolean res = num1 == num2;
        System.out.println(res); // false

        // System.out.println(num1!= num2); // true

        // System.out.println(num1 > num2); // false

        // System.out.println(num1 < num2); // true

        // System.out.println(num1 >= num2); // false

        // System.out.println(num1 <= num2); // false

    }
}