interface sampleInterface{
    void meth1();
    void meth2();
}
//Inheritance in Interface
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class subchildInterface implements childInterface{
    /*all methods 1,2,3,4 has to be defined as childInterface extends sampleInterface
     containing meth1 and 2*/
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth13(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    } 
}
public class inheritance_in_interface{
    public static void main(String[]args){
        subchildInterface obj=new subchildInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}