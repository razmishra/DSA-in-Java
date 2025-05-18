
// inner class

// class A {
//     int x;

//     public void show() {
//         System.out.println("in show");
//     }

//     // inner class
//     static class B {
//         public void classic() {
//             System.out.println("inside classic");
//         }
//     }
// }

// class day33 {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.show();
//         // A.B obj2 = obj.new B();
//         A.B obj2 = new A.B();
//         obj2.classic();
//     }
// }

// ---- anonymous inner class----------

// abstract class A {
//     abstract public void show();
// }

// class C {
//     public void doSomething() {
//         System.out.println("Doing something");
//     }
// }

// class Child extends A {
// public void show() {
// System.out.println("in show");
// }
// }

// -----interfaces------

// interface A {
//     void abs();

//     void show();
// }

// class interfaceChild implements A {
//     public void abs() {
//         System.out.println("in abs");
//     }

//     public void show() {
//         System.out.println("in show");
//     }

// }

class Parent {
    public void showDomethingThatBelongsToThisClass() {
        System.out.println("in show");
    }
}

class Child extends Parent {

    @Override
    public void showDomethingThatBelongsToThisClass() {
        System.out.println("in new show");
    }
}

class day33 {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show() {
        // System.out.println("in show");
        // }
        // };
        // C obj = new C() {
        // public void doSomething() {
        // System.out.println("Doing something else");
        // }
        // };
        // obj.doSomething();
        // A obj = new interfaceChild();
        // obj.abs();
        // obj.show();
        Parent obj = new Child();
        obj.showDomethingThatBelongsToThisClass();
    }
}