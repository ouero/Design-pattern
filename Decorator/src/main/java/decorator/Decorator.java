package decorator;

/**
 * Created by Chan on 2017/3/25.
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public  Decorator(Sourceable sourceable) {
       super();
        this.sourceable=sourceable;

    }

    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
