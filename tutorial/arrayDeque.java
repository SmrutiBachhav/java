import java.util.ArrayDeque;
class arrayDeque{
    public static void main(String[]args){
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);// don't throw exception
        ad1.offerFirst(10);//throws exception
        System.out.println(ad1);
        ad1.addLast(5);
        ad1.offerLast(10);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        //delete an elt from the head of the queue
        ad1.pollFirst(); //deletes 10
        ad1.removeFirst(); //deletes 5
        System.out.println(ad1);
        ad1.pollLast(); //deletes 10
        ad1.removeLast(); //deletes 5
        System.out.println(ad1);
        System.out.println(ad1.getFirst());//returns first elt
        System.out.println(ad1.getLast());//returns last elt

    }
}