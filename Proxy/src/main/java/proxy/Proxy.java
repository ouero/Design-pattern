package proxy;

/**
 * Created by Chan on 2017/3/26.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy(){
        super();
        this.source=new Source();
    }
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before proxy");
    }

    private void after(){
        System.out.println("after proxy");
    }
}
