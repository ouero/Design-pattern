package proxy;

/**
 * Created by Chan on 2017/3/26.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable=new Proxy();
        sourceable.method();
    }
}
