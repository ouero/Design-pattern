package af;

/**
 * Created by Chan on 2017/3/25.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms sender..");
    }
}
