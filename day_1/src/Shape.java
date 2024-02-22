abstract class Shape {
    // 1. If we know about the implementation partially go with Abstract class
    // 2. In an abstract class the methods can be abstract and concrete (fully implemented) as well
    abstract double calculateArea(); // Abstract method

    // 3. No restrictions at all on modifiers for abstract classes
    double calculatePerimeter() { // Concrete method
        return 0.0;
    }

    // 6. Instant initialization is required here at the time of declaration
    String name = "Shape"; // Instant initialization

    // 7. Can declare instance and static blocks
    {
        System.out.println("Inside instance initialization block");
    }

    static {
        System.out.println("Inside static initialization block");
    }

    // 8. Constructor is applicable for abstract classes
    Shape() {
        System.out.println("Abstract class constructor");
    }
}
