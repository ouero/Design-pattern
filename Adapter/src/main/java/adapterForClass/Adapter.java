package adapterForClass;

/**
 * Created by Chan on 2017/3/25.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void newMethod() {
        System.out.println(" is a new method");
    }
}
