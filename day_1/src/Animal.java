public interface Animal {
    // 1. Don't know about implementation go with Interface
    // 2. Every method is public and abstract (no implementation) in Interface
    //    irrespective of declaration i.e. is called as 100% pure abstract class
    void eat(); // Public and abstract
    void sleep(); // Public and abstract

    // 3. We can't declare interface with certain modifiers
    //    as it is public we can't use -> private, protected
    //    as it is abstract we can't use -> final, static, synchronized, native, strictfp

    // 4. Every variable inside interface is public, static and final.
    // 5. We can't declare variables using private, protected, transient, and volatile.
    //    (As serialization is not valid for interfaces and all variables are final)
    int MAX_AGE = 100; // Public, static, and final
}
