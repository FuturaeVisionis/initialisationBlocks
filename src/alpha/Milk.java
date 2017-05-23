package alpha;

/**
 * Created by ronald on 17/01/17.
 */
public class Milk extends Parent{
    /**
     * Instance initialization blocks are useful if you wan't to have some code run regardless of which constructor
     * is used or if you want to do some instance initialization for anonymous classes.
     *
     * Initializer are invoked regardless of which constructor is used.
     * Initializer can be used in anonymous inner classes, where constructors can't.
     */


    static {
        System.out.println("1");
    }

    Milk() {
        System.out.println("2");
    }

    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new Milk();
        new Milk();
        System.out.println("4");
    }
}

class Parent {
    static {
        System.out.println("5");
        {
        }
        System.out.println("6");
    }

    Parent() {
        System.out.println("7");
    }
}
