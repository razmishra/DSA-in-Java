class day16 {

    public static void Print(int i, int n) {
        // base condition (write it on top on everything)
        if (i > n) {
            return;
        }

        // i++;
        Print(i+1, n);
        System.out.println(i);
        // backtracking

    }

    public static void main(String[] args) {

        // a function to print numbers from 1 to n
        Print(1, 10);
    }
}