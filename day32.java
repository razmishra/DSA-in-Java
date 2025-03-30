
// class A extends Object{
//     int value;
//     String name="12";

//     public String toString(){
//         return "Value: " + this.value;
//     }

//     public boolean equals(A obj){
//         return this.value==obj.value && this.name.equals(obj.name);
//     }

// }

abstract class Car{
    String brand;
    abstract public void drive();
    abstract public void stop();
    public void music(){
        System.out.println("Playing music");
    }
}

abstract class updatedCar extends Car{
    public void drive(){
        System.out.println("Driving car");
    }
}

class newCar extends updatedCar{
    public void stop(){
        System.out.println("Stopping car");
    }
}

class day32{
    public static void main(String[] args){

        // A obj1 = new A();
        // obj1.value = 5;

        // A obj2 = new A();
        // obj2.value = 5;

        // System.out.println(obj1==obj2);
        // System.out.println(obj1.equals(obj2));

        // Car obj = new newCar();

    }
}