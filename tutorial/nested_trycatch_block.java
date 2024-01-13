import java.util.Scanner;
class nested_trycatch_block{
    public static void main (String[]args){
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Enter the array index:");
        int ind=sc.nextInt();
        try{
            try{
                System.out.println(marks[ind]);
                System.out.println("index found!"); 
                flag=false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception in level2");
                System.out.println("Index doesn't exist!");
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }

        }
        System.out.println("thanks!");
        
    }
}