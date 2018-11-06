package factory.static_multi_method;


import factory.normal.Sender;

public class Client {
    public static void main(String args[]){
        Sender sender = SenderFactory.produceSmsSender();
        sender.sender();
    }
}
