//extending Exception class to make custom exception class
import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return " I am toString()";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}
class exception_class{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.: ");
        int a=sc.nextInt();
        if (a<10){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Over!");
            }
        }
    }
}