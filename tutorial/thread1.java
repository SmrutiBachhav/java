//Syntax for creating a thread by ectending a Thread class
class MyThread1 extends Thread{   
    public void run(){
        while (true){
            System.out.println("THREAD 1");
            System.out.println("happy");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("THREAD 2");
            System.out.println("sad");
        }
    }
}
class thread1{
    public static void main(String[] args){
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();
        //start() [thread methods] to run run() method, if we write t1.run() it will not give any o/p
        t1.start();  
        //Sometimes it will run MyThread1 t1 and sometimes MyThread2 t2 faster execution
        t2.start();
    }
}