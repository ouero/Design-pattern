package decorator;

/**
 * Created by Chan on 2017/3/25.
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println("the original method!");
    }
}
