package main;

import af.Provider;
import af.SendSmsFactory;
import af.Sender;

/**
 * Created by Chan on 2017/3/25.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
