package adapterForObject;

/**
 * Created by Chan on 2017/3/25.
 */
public class ApaterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter(new Source());
        targetable.method1();
        targetable.newMethod();
    }
}
