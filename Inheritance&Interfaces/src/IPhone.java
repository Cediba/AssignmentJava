public class IPhone implements PhoneI {

    @Override
    public void call(String number) {
        System.out.println("Call from Iphone");
    }

    @Override
    public void receiveCall() {
        System.out.println("Call by Iphone");
    }

    @Override
    public void terminalCall() {
        System.out.println("Terminate call by Iphone");
    }

    @Override
    public void connectTo5G() {

    }
}
