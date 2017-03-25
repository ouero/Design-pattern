package af;

/**
 * Created by Chan on 2017/3/25.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
