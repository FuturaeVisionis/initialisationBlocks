package alpha;

/**
 * Created by ronald on 17/01/17.
 */
public class Tea {

        public static void main(String[] args) {

            Sugar sugar = new Sugar() { // <-- this is where the anonymous INNER class is created.

                /**
                 * A class is created but it's name is decided by the compiler which implements the Sugar class and provides
                 * the implementation of the read() method.
                 */

                {
                    System.out.println("Look at me, I am working within the inner classes initialization block");
                }
                public void read() {
                    System.out.println("Anonymous Sugar");
                }
            };
            sugar.read();
        }
    }
/**
 * You have seen now that by creating an anonymous INNER class, we can override one or more methods of the superclass.
 * In our example above, the superclass is the Sugar class, and the method being overridden is read().
 *
 * But, we should have easily done the same thing by just creating a separate class, having it extend the Sugar class,
 * and then just overridden the read() method. So, what is the need to create an anonymous inner class when we could
 * have done the same using a normal, separate class?
 *
 * Well, the main thing is that it is quicker to just create an anonymous inner class rather than create a new separate
 * class. Anonymous Inner classes are especially useful when you only need to override a SMALL amount of functionality
 * (like just one method) in a superclass, and don't want to deal with the overhead of creating an entire class for
 * something so simple.
 */

