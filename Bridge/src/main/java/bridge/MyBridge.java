package bridge;

/**
 * Created by Chan on 2017/3/26.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSourceable().method();
    }
}
