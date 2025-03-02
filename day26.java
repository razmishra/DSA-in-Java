// import java.util.*;

class day26{
    public static void main(String[] args) {
        // 1. take a user input string
        // 2. print each character of the string

        // que 2: print each character of the string in reverse order
        
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();

        // for(int i=0; i< s.length() ;i++){
        //     System.out.println(s.charAt(i));
        // }
        
        // 2.
        // for(int i = s.length()-1; i>=0; i--){
        //     System.out.println(s.charAt(i));
        // }

        // 3. reverse the string

        StringBuilder s = new StringBuilder("naman");

        // i. iterate till half of the string
        for(int i=0; i<s.length()/2; i++){
            char left = s.charAt(i);
            char right = s.charAt(s.length()-1-i);
            // ii. swap the characters
            s.setCharAt(i, right);
            s.setCharAt(s.length()-1-i, left);
        }
        System.out.println(s);
        // sc.close();
    }
}