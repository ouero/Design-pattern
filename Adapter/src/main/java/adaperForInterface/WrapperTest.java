package adaperForInterface;

/**
 * Created by Chan on 2017/3/25.
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable sourceable1=new SourceSub1();
        Sourceable sourceable2=new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
