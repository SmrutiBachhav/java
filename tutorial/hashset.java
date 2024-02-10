//refer java 14 docs for more methods and collision, overloading etc
import java.util.*;
class hashset{
    public static void main(String[]args){
        HashSet<Integer> myhash=new HashSet<>(6,0.5f);
        myhash.add(6);
        myhash.add(10);
        myhash.add(8);
        myhash.add(3);
        myhash.add(11);
        myhash.add(36);
        myhash.add(6);//this element will be ignored
        myhash.add(7);

        System.out.println(myhash);

        myhash.remove(8); //delete 8 from hashset 
        System.out.println(myhash);

        //checling hashset is empty or not
        System.out.println(myhash.isEmpty());
        
        //removing all elements from hashset
        // myhash.clear();
        // System.out.println(myhash);
        // System.out.println(myhash.isEmpty());

        //checking size of hashset
        System.out.println("Size of hashset is: "+myhash.size());
        
        //checking existence of an element in hashset
        System.out.println(myhash.contains(8));
        System.out.println(myhash.contains(6));
    }
}