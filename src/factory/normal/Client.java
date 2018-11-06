package factory.normal;

public class Client {
    public static void main(String args[]){
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("sms");
        sender.sender();
    }
}
