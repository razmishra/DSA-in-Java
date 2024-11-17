class day10 {
    public static void main(String args[]) {
        // int count = 5;
        // for(int i=1;i<=10;i++){
        // System.out.println(count + " * " + i + " = " + (count*i));
        // }
        // }

        // FIbonnaci

        int first = 0;
        int second = 1;
        int n = 5;
        for (int i = 1; i < n; i++) {
            // if(i== n){
                // System.out.println(first);
                // }
                int third = first + second;
                first = second;
                second = third;
            }
        System.out.println(first);  
    }
}
