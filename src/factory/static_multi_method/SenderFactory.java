package factory.static_multi_method;

import factory.normal.MailSender;
import factory.normal.Sender;
import factory.normal.SmsSender;

public class SenderFactory {
    public static Sender produceMailSender(){
        return new MailSender();
    }

    public static Sender produceSmsSender(){
        return new SmsSender();
    }
}
