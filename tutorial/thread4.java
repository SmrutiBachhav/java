//thread constructors --Thread(Runnable r, String name)
class MyThread implements Runnable{
    
    public void run(){       
        System.out.println("Setting Thread...");     
    }
}
class Thread4{
    public static void main(String[]args){
        Runnable r=new MyThread();
        Thread t=new Thread(r,"Sam");
        t.start();
        System.out.println("the name of the thread:" + t.getName());
        System.out.println("the id of the thread:" + t.getId());
}
}