class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Hello " + this.getName());
            i++;
        }
    }
}
class thread5{
    public static void main(String[]args){
        MyThread t1=new MyThread("Sam 1 __________");
        MyThread t2=new MyThread("Harry 2");
        MyThread t3=new MyThread("Sami 3");
        MyThread t4=new MyThread("Dip 4");
        MyThread t5=new MyThread("Star 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);       
    }
}