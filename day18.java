
class Pen {
    // Data members
    String color;
    String Height;
    String Width;

    // member functions
    public void write() {
        System.out.println("Writing something");
    }

    public void erase() {
        System.out.println("Erasing something");
    }

    public void printThis() {
        System.out.println(this.color);
    }

}

class day18 {

    public static void main(String args[]) {
        // int a = 10;
        // int b = 5;

        // a = a + b;
        // b = a - b; // 10
        // a = a - b; // 5
        // System.out.println(a);
        // System.out.println(b);

        // class is a non-primitive data type while 'int, float, char' are primitive
        // types
        // ------------- Create an object
        // constuctor instantiates the object
        Pen obj1 = new Pen(); // Pen() is called as constructor
        Pen obj2 = new Pen(); // Pen() is called as constructor
        obj1.color = "Black";
        obj1.Height = "10 cm";
        obj1.Width = "5 cm";
        // System.out.println(obj1.color);
        // obj1.write();
        obj2.color = "Blue";
        // System.out.println(obj2.color);
        obj2.printThis();
    }
}