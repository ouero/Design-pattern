package singleton;

/**
 * Created by Chan on 2017/3/25.
 */
public class Singleton2 {
    private Singleton2(){

    }

    private static  class  SingletonFactory{
        private static Singleton2 singleton2=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonFactory.singleton2;
    }
}
