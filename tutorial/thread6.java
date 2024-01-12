class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Hello!");
            // try{
            //     Thread.sleep(560);
            // }
            // catch(InterruptedException e){
            //     e.printStackTrace();
            // }
             i++;
        }   
        }        
    }

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Bye!");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }        
    }
}
class thread6{
    public static void main(String[]args){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        
        t2.start();
    }
}