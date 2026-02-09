import java.util.*;
class CollectionDemo3 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            int k = (int)itr.next();
            if(k%2==0){
                System.out.println(itr.next());
            }else{
                itr.remove();
            }
            System.out.println(itr.next());
        }
    }
    
}
