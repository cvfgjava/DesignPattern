package factoryMethod;

public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is smsSender");
    }
}
