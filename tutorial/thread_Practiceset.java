class Mythr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("GoodMorning!");
        }
    }
}
class Mythr2 extends Thread{
    public void run(){
        //while(true){
            //System.out.println("Welcome!");
            // try{
            //     Thread.sleep(200);
            // }
            // catch(Exception e){
            //     System.out.println(e);
            // }
        }
    }
//}
class thread_Practiceset{
    public static void main(String[]args){
        Mythr1 t1=new Mythr1();
        Mythr2 t2=new Mythr2();
        // t1.setPriority(6);
        // t2.setPriority(9);
        //t1.start();
         
        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //System.out.println(t1.getState());
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
