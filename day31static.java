
class Mobile {
    String name;
    int price;
    static String brand;
    String color;

    public Mobile() {
        System.out.println("in constructor");
    }

    // static block
    static {
        brand = "Apple";
        System.out.println("in static block");
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Brand: " + Mobile.brand);
        System.out.println("Color: " + this.color);
    }

    // public static void show1(Mobile obj1){
    // System.out.println("Name: " + obj1.name);
    // System.out.println("Price: " + obj1.price);
    // System.out.println("Color: " + obj1.color);
    // System.out.println("Brand: " + Mobile.brand);
    // }
}

class day31static {
    public static void main(String[] args) {
        // Mobile mobile1 = new Mobile();
        // mobile1.name = "mobile1";
        // mobile1.price = 1000;
        // Mobile.brand = "Apple";
        // mobile1.color = "Black";

        // Mobile mobile2 = new Mobile();
        // mobile2.name = "mobile2";
        // mobile2.price = 1500;
        // Mobile.brand = "Apple";
        // mobile2.color = "White";

        // Mobile.brand = "New Apple";

        // mobile1.show();
        // mobile2.show();
        // Mobile.show1(mobile1);

        // anonymous objects
        new Mobile().show();
    }
}