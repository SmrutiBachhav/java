import java.util.*;
class datetime{
    public static void  main(String[]args){
        //gives milliseconds passed since 1 jan 1970
        System.out.println(System.currentTimeMillis());
        //in terms of years
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("maximum value of lng: "+ Long.MAX_VALUE);

        //DATE CLASS IN JAVA
        //Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed 
        Date d =new Date();
        System.out.println("Current Date and time is: " + d);
        System.out.println(d.getTime());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        //compareTo() : 
        // Checks for the equality of the two dates.Returns 0 if the dates are equal; else, returns 1
        Date d1= new Date(2024,12,10);
        System.out.println(d1);
        System.out.println(d1.compareTo(d));     
        Date d2= new Date(2024,2,10);
        System.out.println(d2);
        System.out.println(d2.compareTo(d));     
    }
}