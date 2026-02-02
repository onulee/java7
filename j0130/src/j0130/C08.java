package j0130;

import java.util.ArrayList;
import java.util.Comparator;

public class C08 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList();
//		list.add(5);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(4);
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//		});
//		
//		System.out.println(list);
		
		
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(new Card("SPADE",1));
		list.add(new Card("SPADE",2));
		list.add(new Card("HEART",10));
		list.add(new Card("DIAMOND",5));
		list.add(new Card("CLOVER",7));
		list.sort(new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2) {
				return o2.kind.compareTo(o1.kind); //문자열비교 정렬방법
			}
		
		});
		
		for(int i=0;i<list.size();i++) {
			Card c = list.get(i);
			System.out.printf("[%s,%d] \n",c.kind,c.number);
		}

	}

}
