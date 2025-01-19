class Calculator {
    // Instance variable
    int variable;

    public int add(int a, int b) {
        // local variables
        return a + b + variable;
    }
}

class day20 {
    public static void main(String[] args) {
        // String abc = "hi there";
        // String str = new String("Hi there");
        // System.out.println(str);
        // int number = 12;
        // Calculator calc = new Calculator();
        // int res = calc.add(2, number);
        // System.out.println(res);
        String s1 = "Hi";
        s1 = s1+" there";
        String s2 = "Hi";
        System.out.println(s1+s2);
    }
}