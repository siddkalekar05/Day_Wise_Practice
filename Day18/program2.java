import java.util.*;
class IteratorDemo2{
	public static void main(String[] args){
		List<Integer> ll = new ArrayList<>();
		ll.add(11);
		ll.add(24);
		ll.add(32);
		ll.add(45);
		System.out.println(ll);

		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			int value = (int)itr.next();
			if(value%2==0){
				itr.remove();
			}
		}
		System.out.println(ll);
	}
}
