package arrayrecap;

import java.util.ArrayList;

public class Arylistoprtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		//add
		int e;
		list.add(e=10);
		list.add(e=20);
		list.add(e=30);
		System.out.println(list);
		//add index
		int index;
		int element;
		list.add(index=1,element=40);
		System.out.println(list);
		//get 
		System.out.println(list.get(index=2));
		//set 
		list.set(index=2, element=50);
		System.out.println(list.get(index=2));
		//remove 
		list.remove(index=2);
		System.out.println(list);
		//size
		System.out.println(list.size());

	}

}
