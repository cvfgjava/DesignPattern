package factory.normal;

import factory.normal.Sender;

public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is smsSender");
    }
}
