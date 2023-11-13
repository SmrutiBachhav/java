abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    public void write(){
        System.out.println("Write!");
    }
    public void refill(){
        System.out.println("Refill!");
    }
    public void ChangeNib(){
        System.out.println("Changing the nib...");
    }
}
class Monkey{
    public void jump(){
        System.out.println("Jumping!");
    }
    public void bite(){
        System.out.println("Biting!");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating!");
    }
    public void sleep(){
        System.out.println("Sleeping!");
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing!");
    }
    public void lift(){
        System.out.println("Lifting!");
    }
    public void disconnect(){
        System.out.println("Disconnecting!");     
    }
    public void connect(){
        System.out.println("Connecting!");     
    }
}
interface TVremote{
    void off();
    void on();
}
class SmartTVremote implements TVremote{
    public void off(){
        System.out.println("Turning Off...");
    }
    public void on(){
        System.out.println("Turning On...");
    }
}
class TV implements TVremote{
    public void off(){
        System.out.println("Off...");
    }
    public void on(){
        System.out.println("On...");
    }
}
public class absint_practice_set{
    public static void main(String[]args){
        //Q1,2
        fountainpen fp = new fountainpen();
        fp.write();
        fp.refill();
        fp.ChangeNib(); 
        //Q3       
        Human sam=new Human();
        sam.jump();
        sam.bite();
        sam.eat();
        sam.sleep();
        //Q5 Polymerphism
        Monkey m=new Human();
        m.jump();
        m.bite();
        //m.eat();--> gives error as reference is of monkey and it will rum methods 
        //of monkey only.

        //Q4
        Telephone tp=new SmartTelephone();
        tp.ring();
        tp.lift();
        tp.disconnect();
        //tp.connect();--gives error as reference is of monkey and it will rum methods 
        //of monkey only.

        //Q6 
        SmartTVremote tv=new SmartTVremote();
        tv.on();
        tv.off();
        //Q7
        TV t=new TV();
        t.on();
        t.off();


    }
}