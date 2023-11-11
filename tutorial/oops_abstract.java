/*we can't make single subclass from Multiple abstract classes in java 
'extends' keyword is used*/
abstract class Parent{
    int a=45;//we can add Properties and can change them 
    public Parent(){
        System.out.println("I am parent!");
    }
    abstract void greet();
    abstract void wish();
}
/*sublass of abstract must have have all methods of abstract class and we can add our
new methods to it or itself be declared as abstract class*/ 
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("GM!");
    }
    public void wish(){
        System.out.println("HBD!");
    }
    public void sayhi(){
        System.out.println("Hi");
    }
}
class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("GN!");
    } 
    public void wish(){
        System.out.println("HWA!");
    }
}
//we can extend abstract from parent abstract class and create new methods
abstract class Child3 extends Parent{
    public void Child3(){
        System.out.println("Hello");
    }
    
}
public class oops_abstract{
    public static void main(String[]args){
        //doen't give error we can make reference of abstract class to object of
        //subclass(Dynamic Method Dispatch)
        Parent p=new Child1();
        p.greet();
        /*Following gives error bcoz abstract can't be instantiate we can't make 
        object of abstract class
        Parent P=new Parent();
        P.greet();
        Child3 c3=new Child3();
        Parent b=new Parent();
        System.out.println(b.a);*/
        Parent b=new Child1();
        System.out.println(b.a);
        b.a=454;
        System.out.println(b.a);
        Child1 c1=new Child1();
        c1.greet();
        c1.wish();
        c1.sayhi();
        Child2 c2=new Child2();
        c2.greet();
        c2.wish();
        

    }

}
