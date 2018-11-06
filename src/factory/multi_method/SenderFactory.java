package factory.multi_method;

import factory.normal.MailSender;
import factory.normal.Sender;
import factory.normal.SmsSender;

public class SenderFactory {
    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
        return new SmsSender();
    }
}
