package adapterForObject;

/**
 * Created by Chan on 2017/3/25.
 */
public class Adapter  implements Targetable {

    public Adapter(Source  source){
        super();
        this.source=source;
    }

    private Source source;


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void newMethod() {
        System.out.println(" is a new method");
    }



}
