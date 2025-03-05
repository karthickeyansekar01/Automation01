package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsInterface {

	public static void main(String[] args) {

//1.LIST
		
		//*** disadvantages of array - cannot add more than declared size(out of bound)// cannot add different data types in a single array 
		
		//int arr[] = new int[5];
				//arr[6] = 10;
				
				//int arr[] = {10,20.15f,30,40,true};
			
		//*** disadvantages of array is solved in array list
		
			//	ArrayList<Integer> a2 = new ArrayList();//This wil allow only Integer values
				
		
				System.out.println("ArrayList");
				System.out.println("************ \n");
		
		
				ArrayList<Integer> a2 = new ArrayList();
		
				a2.add(10);//0
				a2.add(null);//1
				a2.add(30);//2
				a2.add(null);//3
				a2.add(50);//4
				
				System.out.println(a2);
				System.out.println(a2.size());
				
				
				
				
			
				
			//Linked list- can do all operations like array list but insertion deletion will be fast as using doubly linked list
				
				System.out.println("LinkedList");
				System.out.println("************ \n");
				
				LinkedList a1 = new LinkedList();//Object
				a1.add(10);//0
				a1.add(null);//1
				a1.add(30);//2
				a1.add(null);//3
				a1.add(50);//4
				
				
				//a1.addAll
				//a1.con
				
				System.out.println(a1);
				
				//String s1 = (String) a1.get(2);
				
				//int size = a1.size();
				//System.out.println(size);
				
				/*for(int i = 0; i < size; i++) {
					System.out.println(a1.get(i));
				}*/
				
				/*for(Object a : a1) {
					System.out.println(a);
				}*/
				
				//a1.add(1, 60);
				
				for(Object a : a1) {
					System.out.println(a);
				}
				
				/*a1.remove("Hi");
				
				for(Object a : a1) {
					System.out.println(a);
				}
				
				System.out.println(a1.isEmpty());*/

		
				
				
				
				
				
				
//2.SET
				
				
		
				// Set 1.Hashset 2.Linked hashset 3.treeset
				
				
				//1.Hashset
				
				System.out.println("HashSet");
				System.out.println("************ \n");
				
				HashSet hs=new HashSet();
				
				
				hs.add("abc");
				hs.add("def");
				hs.add("xyz");
				hs.add("xyz"); //2nd xyz is not considered as duplicates are not allowed in hashset it will remove
				
				
			//	System.out.println("**********");
				System.out.println(hs);
				System.out.println(hs.contains("abc"));
				hs.remove("xyz"); //it will remove 2 entries as well
				System.out.println(hs);
				
				
				//2.linked hashset
				
				System.out.println("LinkedHashSet");
				System.out.println("************ \n");
				
				LinkedHashSet hs1=new LinkedHashSet();
				
				
				hs1.add("ABC");
				hs1.add("DEF");
				hs1.add("XYZ");
				hs1.add("xyz"); //2nd xyz is not considered as duplicates are not allowed in hashset it will remove
				
				
			//	System.out.println("**********");
				System.out.println(hs1);
				System.out.println(hs1.contains("abc"));
				hs.remove("xyz");
				System.out.println(hs1);
				
				
				//3.TreeSet 

				System.out.println("TreeSet");
				System.out.println("************ \n");
				
				TreeSet<String> ts=new TreeSet();
				
				
				ts.add("ABC");
				ts.add("lmn"); // as lmn ascii value is more than capital letters it will print later
				ts.add("XYZ");
				ts.add("xyz"); //output will be displayed based on ascending order
				
				
		//		System.out.println("**********");
				System.out.println(ts);
				System.out.println(ts.contains("abc"));
				ts.remove("xyz");
				System.out.println(ts);

				
//3.MAPS
				
				//1.HashMAp
				
				System.out.println("HashMap");
				System.out.println("************ \n");
				
				HashMap hm=new HashMap();
				hm.put("karthi", "001");
				hm.put("mano", "002");
				hm.put("bala", "003");
				
				System.out.println(hm); // hash map will print value in random order irrespective of index
				hm.containsKey("karthi");
				hm.containsValue("001");
				System.out.println(hm.size());
				
				hm.get("mano");
				
				hm.remove("bala");
				
				System.out.println(hm);
				
				//2.LinkedHashMap
				
				System.out.println("LinkedHashMap");
				System.out.println("************ \n");

				HashMap lhm=new HashMap();
				lhm.put("karthi", "001");
				lhm.put("mano", "002");
				lhm.put("bala", "003");
				
				System.out.println(lhm); // hash map will print value in random order irrespective of index
				lhm.containsKey("karthi");
				lhm.containsValue("001");
				System.out.println(lhm.size());
				
				lhm.get("mano");
				
				lhm.remove("bala");
				
				System.out.println(lhm);
				
				
				
				//3.TreeMap
				
				System.out.println("TreeMap");
				System.out.println("************ \n");

				TreeMap tm=new TreeMap();
				tm.put("karthi", "001");
				tm.put("mano", "002");
				tm.put("bala", "003");
				
				System.out.println(tm); // hash map will print value in random order irrespective of index
				tm.containsKey("karthi");
				tm.containsValue("001");
				System.out.println(tm.size());
				
				tm.get("mano");
				
				tm.remove("bala");
				
				System.out.println(tm);
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
