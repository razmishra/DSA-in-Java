
class Calculator {

    final int num = 10;

    public void add(int a, int b) {
        System.out.println(a + b + num);
    }

    public void show() {
        System.out.println("By me");
    }

}

class AdvCalculator extends Calculator {

    public void show() {
        System.out.println("By me too");
    }

}

class A {
    public void show() {
        System.out.println("By A");
    }
}

class B extends A {
    public void show() {
        System.out.println("By B");
    }
    public void show1() {
        System.out.println("By B in show1");
    }
}

public class day31Final {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // calc.add(10, 20);
        // AdvCalculator advCalculator = new AdvCalculator();
        // advCalculator.add(30, 40);
        // advCalculator.show();

// --------- dynamic method dispatch --------------------------------
        A b = new B();
        b.show();

    }
}
