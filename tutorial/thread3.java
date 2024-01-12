//thread constructors --Thread(String name)
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Hello!");
            i++;
        }
    }
}
public class thread3{
    public static void main(String[]args){
        MyThread t= new MyThread("Sam");
        t.start();
        System.out.println("The id of the thread is:" + t.getId());
        System.out.println("the name of the thread is:" + t.getName());
    }
}