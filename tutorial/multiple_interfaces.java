interface Camera{
    //default access mdodifier is public
    void takeSnap();    
    void RecordVideo();
    private void greet(){
        System.out.println("Good Morning!, I am maethod used in Default Method.");
    }
    default void Record4KVideo(){
        greet();
        System.out.println("Recording video in 4k...");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class Phone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling"+PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class SmartPhone extends Phone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void RecordVideo(){
        System.out.println("Recording Video...")
    }
}
