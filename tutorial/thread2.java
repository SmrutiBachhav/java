class MyThreadRunnable1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("THREAD 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("THREAD 2");
        }
    }
}
class thread2{
    public static void main(String[]args){
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1= new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        //bullet1.start();---> can't implement start()in runnable interface
        gun1.start();
        gun2.start();

    }
}