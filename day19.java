
// class Student{
//     String name;
//     int age ;

//     public void getUserInfo(){
//         if(this.name==null){
//             System.out.println("Name is required");
//             return;
//         }else{
//             System.out.println(this.name +" is "+this.age + " years old");
//         }
//     }

//     // constructor
//     // 1. constructor is a function
//     // 2. constructor has the same name as the class
//     // 3. constructor has no return type
//     // 4. constructor is called automatically when a new object is created
//     // 5. constructor can be called only once

//     // default constructor
//     Student(){
//         System.out.println("Constructor called");
//     }

//     // parameterized constructor
//     Student(String userName, int userAge){
//         // System.out.println("Parameterized constructor called");
//         this.name = userName;
//         this.age = userAge;
//     }
    
//     // this is called constructor overloading (constructors with same name)

//     // copy constructore
//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//         System.out.println("Copy constructor called");
//     }
// }

// public class day19 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Dua lipa";
//         s1.age = 21;
//         // s1.getUserInfo();

//         Student s2 = new Student(s1);
//         // s2.name = "Jane Doe";
//         // s2.age = 20;
//         s2.getUserInfo();



//         // Student s3 = new Student("Dua Lips",27);
//         // s3.getUserInfo();
//     }
// }


// ---- inheritence starts from here

// shape is a parent class
// parent class -> base class
class Shape{
    String color;
    void draw(){
        System.out.println("Drawing shape");
    }
    public void getColor(){
        System.out.println("Color is " + this.color);
    }
}

// Triangle is a child class
// child class -> descendent class, subclass
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing triangle");
    }
}

class Equilateral extends Triangle{

}

// hierarchical inheritence becaus triangle and circle extends shape
class Cirlce extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

public class day19{
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "black";
        // t1.draw();

        Equilateral e1 = new Equilateral();
        e1.color = "blue";
        e1.getColor();
        e1.draw();
    }
}