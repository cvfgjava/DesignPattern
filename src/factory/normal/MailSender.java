package factory.normal;

public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is mailSender");
    }
}
