package bridge;

/**
 * Created by Chan on 2017/3/26.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge=new MyBridge();

        Sourceable source1=new SourceSub1();
        bridge.setSourceable(source1);
        bridge.method();

        Sourceable source2=new SourceSub2();
        bridge.setSourceable(source2);
        bridge.method();
    }
}
