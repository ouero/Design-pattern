package af;

/**
 * Created by Chan on 2017/3/25.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
