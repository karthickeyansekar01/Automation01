package Selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SA26_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s = new HashSet<String>();
		System.out.println("size "+ s.size());
		
		s.add("India");
		s.add("USA");
		s.add("London");
	
		
		System.out.println("size "+ s.size());
		//****  Set does not have index and it can be called and printed without iterator
		Iterator<String> t = s.iterator();
		
//		System.out.println(t.next());
//		System.out.println(t.next());
//		System.out.println(t.next());
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
