package factory.multi_method;


import factory.normal.Sender;

public class Client {
    public static void main(String args[]){
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceSmsSender();
        sender.sender();
    }
}
