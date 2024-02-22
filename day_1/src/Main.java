public class Main {
    // Abstract vs Interface
    // Interface            |     Abstract Class
    /*
      1. Don't know about implementation go with Interface  |  If we know about the implementation partially go with Abstract class
      2. Every method is public and abstract(no implementation) in Interface irrespective of declaration i.e. is called as 100% pure abstract class  |  In an abstract class the methods can be abstract and concrete(fully implemented) as well
      3. We can't declare interface with following modifiers                                  |   No restrictions at all
          as it is public we can't use -> private, protected                                  |
          as it is abstract we can't use -> final, static, synchronized, native, strictfp     |
      4. Every variable inside interface is public, static and final.       |  Need not be public/final
      5. We can't declare variables using private, protected, transient(As serialization is not valid for interfaces) and volatile(As all the variables are final) | No restrictions again!
      6. Instant initialization is required here at the time of declaration  |  As you know NO RESTRICTIONS
      7. Cannot declare instance and static blocks  |  Can declare - I'm bored with abstract class
      8. Constructor is not applicable   |  Can be declared
      */

     /*
     * Follow-up revision questions:
     *  1. Abstract vs concrete method.
     *  2. What is serialization?
     *  3. What is transient and volatile modifier?
     *  4. What is an instance and a static block?
     * */

    public static void main(String[] args) {
        System.out.println("Testing abstract class:");
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
        System.out.println(rectangle.name); // Accessing instant initialized variable

        // Testing interface
        System.out.println("\nTesting interface:");
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println("Maximum age of animals: " + Animal.MAX_AGE); // Accessing interface variable


    }
}

