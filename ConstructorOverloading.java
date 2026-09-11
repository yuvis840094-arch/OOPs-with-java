public class ConstructorOverloading {
    //constructor overloading is a technique in java where a class can have more than one constructor with different parameter lists. 
    // It allows the creation of objects in different ways, providing flexibility in object initialization.
    int x;
    // Default constructor
    // ConstructorOverloading() {
    //     x = 0;
    // }

    // // Constructor with one parameter
    // ConstructorOverloading(int a) {
    //     x = a;
    // }

    // // Constructor with two parameters
    // ConstructorOverloading(int a, int b) {
    //     x = a + b;
    // }

    // public static void main(String[] args) {
    //     ConstructorOverloading obj1 = new ConstructorOverloading();
    //     System.out.println("Value of x in obj1: " + obj1.x);


    //     ConstructorOverloading obj2 = new ConstructorOverloading(5);
    //     System.out.println("Value of x in obj2: " + obj2.x);

    //     ConstructorOverloading obj3 = new ConstructorOverloading(5, 10);
    //     System.out.println("Value of x in obj3: " + obj3.x);
    // }

    int a,b,c;
    ConstructorOverloading() {
        System.out.println("Default constructor called");
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    ConstructorOverloading(int a) {
        this.a = a;
    
    }
    ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
    }
    ConstructorOverloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        System.out.println(obj1.a + " " + obj1.b + " " + obj1.c);
        
        ConstructorOverloading obj2 = new ConstructorOverloading(5);
        System.out.println(obj2.a + " " + obj2.b + " " + obj2.c);


        ConstructorOverloading obj3 = new ConstructorOverloading(5, 10);
        System.out.println(obj3.a + " " + obj3.b + " " + obj3.c);

        ConstructorOverloading obj4 = new ConstructorOverloading(5, 10, 15);
        System.out.println(obj4.a + " " + obj4.b + " " + obj4.c);
    }
}

