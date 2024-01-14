import java.util.Scanner;
class  MAXRetrieveError extends Exception{
    // public String toString(){
    //     return "Error";
    // }
    public String getMessage(){
        return "Maximum retrieve exceeds!";
    }
}
class exceptions_practiceset{
    public static void arr() throws MAXRetrieveError{
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        boolean flag=true;
        while(flag && i<5){
            try{
                System.out.println("Enter index:");
                index=sc.nextInt();
                System.out.println("the value of index "+index+" is "+marks[index]);
                break;               
            }
            catch(Exception e){
                System.out.println("Invalid index!");
                i++;
            }
        }
        if (i>=5){
            try{
                throw  new MAXRetrieveError();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }       
        }
    }
    public static void main(String[]args){
        
         //Q1
        // System.out.println("Enter a:");
        // int a =sc.nextInt();
        // System.out.println("Enter b:");
        // int b=sc.nextInt();
       
        // try{
        //     int c=a/b;
        //     System.out.println("Result: "+c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("ArithmeticException occurred!");
        // }
        // catch(IllegalArgumentException e){
        //     System.out.println("IllegalArgumentException occured!");
        // }
        
        //Q2
        try{
            arr();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        // if(i>=5){
        //     //System.out.println("Error!");
            
        //         throw new MAXRetrieveError();
            
        // }
    }
}