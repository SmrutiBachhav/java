/* we can make subclasses from multiple interfaces
'implements' keyword is used*/
import java.util.Scanner;
import java.util.*;
interface Bicycle{
    int a=45;// we can add properties but can't change them
    int sp=0;
    void speed(); 
    void applyBrake(int decrement);
    void speedUp(int increment);
    void overtake();
}
interface HornBicycle{
    void blowhorn();
}
class AtlasCycle implements Bicycle, HornBicycle{
    int s=0;
    public int sp=0;
    public void speed(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Speed of vehicle:-");
        int sp=sc.nextInt();
        this.sp=sp;
        System.out.println("Speed of vehicle="+sp+"km/h");
        
    }
    
    public void applyBrake(int decrement){
        
        System.out.println("Applying brake...");
        int s=sp-decrement;
        System.out.println(s);
    }
    public void overtake(){
        System.out.println("Overtaking...!");
    }
    public void speedUp(int increment){
        System.out.println("Increasing Speed...");
        int s=sp+increment;
        System.out.println(s);
    }
    public void blowhorn(){
        System.out.println("PEEEP! PEEP!");
    }
}
public class oops_interface{
    public static void main(String[]args){
        
        AtlasCycle ac=new AtlasCycle();
        
        ac.speed();
        ac.applyBrake(1);
        ac.overtake();
        ac.speedUp(2);
        ac.blowhorn();
        System.out.println(ac.a);
        /*ac.a=456;
        System.out.println(ac.a); GIves ERror*/
        
    }
}