class day5 {
    public static void main(String[] args) {
        // int mark = 86;
        // if(mark>=90) System.out.println("A");
        // else if (mark>=80 && mark<=89) System.out.println("B");
        // else if (mark>=70 && mark<=79) System.out.println("C");
        // else if (mark>=60 && mark<=69) System.out.println("D");
        // else System.out.println("Fail");

        // check if a year is a leap y

        // int number = 2000;
        // if(number%400==0) System.out.println("Leap year");
        // else if(number%4==0 && number%100!=0) System.out.println("Not a leap year");
        

        // ------ print day of a week ----
        // int day = 6;
        // if(day==0) System.out.println("Sunday");
        // else if(day ==1) System.out.println("Monday");
        // else if(day ==2) System.out.println("Tuesday");
        // else if(day ==3) System.out.println("Wednesday");
        // else if(day ==4) System.out.println("Thursday");
        // else if(day ==5) System.out.println("Friday");
        // else System.out.println("Saturday");

        int day = 4;
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
        }
        System.out.println("i am here");
    }
}

