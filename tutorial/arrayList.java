//collectioion framework java 18 oracle docs
//same and more methods for both ArrayList and LinkedList
//import java.util.ArrayList;
import java.util.*;
class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>();
        //LinkedList<Integer> l1=new LinkedList<>();
        //ArrayList<Integer> al1= new ArrayList<>(7);with initial capaciy of arrayList
        al1.add(1);//appens the specific elt at the end of the list
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        al1.add(6);
        al1.add(5,7);//inserts elt at the specified position
        al1.addFirst(0);//insert elt as the first element
        al1.addLast(8);//add elt as the last element
        System.out.println(al1);
        al1.remove(1);
        System.out.println("after removing value at the given index "+ al1);
        //checking presence of a specific elt
        System.out.println(al1.contains(4));
        System.out.println(al1.contains(1));
        //merging two arrays
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(11);
        al2.add(12);
        al2.add(13);
        al2.add(14);
        al2.add(15);
        al2.add(16);
        System.out.println(al2);
        al1.addAll(al2);// addAlll adds all elements at the ned of th list
        al1.addAll(0,al2);// do the same thing at the specified index
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al1.get(0));//returns elt at the given index
        System.out.println(al1.indexOf(7));
        System.out.println(al1.iterator());
        System.out.println(al1.size());
        al1.clear();//clears all elements 
        System.out.println(al1);
    }
}