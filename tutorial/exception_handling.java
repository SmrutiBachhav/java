import java.util.Scanner;
class exception_handling{
    public static void main(String[]args){
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index:");
        int ind=sc.nextInt();

        System.out.println("Enter the no with which you want to divide array value:");
        int num=sc.nextInt();
        try{
            System.out.println("The value of the array index entered is: "+marks[ind]);
            System.out.println("The value of the aray value/number= "+marks[ind]/num);
        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("ArrayIndexOutofBoundsException occured!");
            System.out.println(e);
        
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception occured!");
            System.out.println(e);
        }
    }
}