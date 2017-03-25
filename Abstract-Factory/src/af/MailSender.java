package af;

/**
 * Created by Chan on 2017/3/25.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail sender..");
    }
}
