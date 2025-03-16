import java.util.Arrays;

class Student {
    String name;
    int age;
    int rollNo;
}

class day30 {

    // public static void printArray(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // // arr[i] represents an array
    // for (int j = 0; j < arr[i].length; j++) {
    // // arr[i][j] represents an element
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    // forEach loop
    // public static void printUsingExtededForLoop(int arr[][]) {
    //     for (int[] innerArr : arr) {
    //         for (int element : innerArr) {
    //             element = 12;
    //             System.out.print(element + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void assignRandomValues(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // // arr[i] represents an array
    // for (int j = 0; j < arr[i].length; j++) {
    // // arr[i][j] represents an element
    // int number = 0;
    // if (Math.random() > 0.5) {
    // number = (int) (Math.random() * 10);
    // } else {
    // number = (int) (Math.random() * 100);
    // }
    // arr[i][j] = number;
    // }
    // }
    // }

    public static void main(String[] args) {
        // int arr[][] = new int[3][4];

        // assignRandomValues(arr);
        // printArray(arr);
        // -------------- Jagged array-----------
        // int[][] jaggedArray = new int[3][];
        // jaggedArray[0] = new int[3];
        // jaggedArray[1] = new int[4];
        // jaggedArray[2] = new int[2];

        // assignRandomValues(jaggedArray);
        // printArray(jaggedArray);
        // printUsingExtededForLoop(jaggedArray);

        // Student s1 = new Student();
        // s1.name = "hi";
        // s1.age = 12;
        // s1.rollNo = 21;

        // Student s2 = new Student();
        // s2.name = "there";
        // s2.age = 13;
        // s2.rollNo = 22;

        // Student s3 = new Student();
        // s3.name = "hello";
        // s3.age = 14;
        // s3.rollNo = 23;

        // Student studentArray[] = new Student[3];
        // studentArray[0] = s1;
        // studentArray[1] = s2;
        // studentArray[2] = s3;

        // for (int i = 0; i < studentArray.length; i++) {
        // System.out.println(studentArray[i].name + " : "+ studentArray[i].rollNo);
        // }

        // for(Student stud: studentArray){
        // System.out.println(stud.name + " : "+ stud.rollNo);
        // }


        int arr[] = {1,2,3,4,5,5,7};
        Arrays.sort(arr);
        int n = arr.length; //7
        for(int i=0; i<n; i++){
            if(i+1!=arr[i]){
                System.out.println(arr[i]+1);
            }
        }

    }
}