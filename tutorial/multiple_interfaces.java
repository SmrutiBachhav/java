import java.util.Scanner;
interface Camera{
    //default access mdodifier is public
    void takeSnap();    
    void RecordVideo();
    //private void greet(){
      //  System.out.println("Good Morning!, I am method used in Default Method.");
    //}
    default void Record4KVideo(){
        //greet();
        System.out.println("Recording video in 4k...");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork();
}
class Phone{
    //int n;
    public int PhoneNumber;
    void callNumber(){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter Phone Numnber to make call-");
        int PhoneNumber=n.nextInt();
        this.PhoneNumber=PhoneNumber;
        System.out.println("Calling " + PhoneNumber + "...");
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
    void CallPicked(){
        System.out.println("Ongoing call...");
    }
}
class SmartPhone extends Phone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void RecordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks...");
        String [] Networks={"Jio","Airtel","Vi","BSNL"};
        return Networks;
    }
    String nw;
    String network;
    public void connectToNetwork(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the network you wan tto choose from the above given list of networks");
        String nw=sc.nextLine();
        this.nw=network;
        System.out.println("Connecting to Network " + nw+"...");
    }
}
public class multiple_interfaces{
    public static void main(String[]args){
        //Polymerphism--will run functions of camera only
        Camera c=new SmartPhone();
        c.takeSnap();
        c.Record4KVideo();        //
        SmartPhone sp=new SmartPhone();
        System.out.println("What do you want to do? \n1.Take photo,2.Record Video, 3.Call a friend, 4.get list of networks,5.pick call,");
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter choice:");
        int f=ip.nextInt();
        switch(f){
            case 1:
                sp.takeSnap();
                break;
                
            case 2:
                sp.RecordVideo();
                break;
            case 3:
                sp.callNumber();
                break;
            case 4:
                String [] ar=sp.getNetworks();
                for(String item: ar){
                System.out.println(item);
                }
                break;
            case 5:
                sp.connectToNetwork();
                sp.PickCall();
                sp.CallPicked();
                break;
        }
        sp.Record4KVideo(); 
    }
}
