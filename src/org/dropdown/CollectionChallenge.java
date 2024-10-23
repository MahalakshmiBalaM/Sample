package org.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionChallenge {
	

	public static void main(String[] args) {
		/*
		 * List li = new LinkedList(); System.out.println("TASK 1"); li.add(20);
		 * li.add('B'); li.add("maha"); li.add("Lakshmi"); li.add("6th may 2004");
		 * 
		 * System.out.println(li); System.out.println("SIZE OF ABOVE LIST"); int size =
		 * li.size(); System.out.println(size);
		 */

		/*
		 * List list = new LinkedList(); System.out.println("TASK 2"); list.add(100);
		 * list.add(200); list.add(300); list.add(400); list.add(500); list.add(600);
		 * list.add(700);
		 * 
		 * System.out.println(list); System.out.println("SIZE OF ABOVE LIST"); int size
		 * = list.size(); System.out.println(size);
		 */

		/*
		 * Set <Integer> s = new LinkedHashSet<>(); System.out.println("TASK 3");
		 * s.add(10); s.add(10); s.add(20); s.add(50); s.add(60); s.add(80); s.add(60);
		 * s.add(50); System.out.println(s);
		 * System.out.println("REMOVED DUPLICATES VALUES");
		 */

		/*
		 * Set <Integer> s = new HashSet<>(); System.out.println("TASK 4"); s.add(10);
		 * s.add(20); s.add(30); s.add(40); s.add(50); s.add(60); s.add(70); s.add(80);
		 * s.add(90); s.add(10); s.add(20); System.out.println(s);
		 */

		/*
		 * Set <Integer> s = new LinkedHashSet<>(); System.out.println("TASK 5");
		 * s.add(10); s.add(20); s.add(30); s.add(40); s.add(50); s.add(60); s.add(70);
		 * s.add(80); s.add(90); s.add(10); s.add(20); System.out.println(s);
		 */
		/*
		 * Set <Integer> s = new TreeSet<>(); System.out.println("TASK 6"); s.add(10);
		 * s.add(20); s.add(30); s.add(40); s.add(50); s.add(60); s.add(70); s.add(80);
		 * s.add(90); s.add(10); s.add(20); System.out.println(s);
		 */

		/*
		 * List <Integer> l = new Vector<Integer>(); System.out.println("TASK 7");
		 * l.add(10); l.add(20); l.add(30); l.add(90); l.add(10); l.add(10); l.add(40);
		 * l.add(50);
		 * 
		 * System.out.println(l);
		 * 
		 * Set <Integer> s = new TreeSet<>(); s.addAll(l); System.out.println(s);
		 */

		/*
		 * List <Integer> l = new Vector<Integer>(); System.out.println("TASK 8");
		 * l.add(105); l.add(205); l.add(305); l.add(405); l.add(505); l.add(605);
		 * l.add(705); l.add(805); l.add(505); l.add(605);
		 * 
		 * System.out.println(l);
		 * 
		 * Set <Integer> s = new TreeSet<>(); s.addAll(l); System.out.println(s);
		 */

		/*
		 * List <Integer> l = new Vector<Integer>(); System.out.println("TASK 9");
		 * l.add(100); l.add(200); l.add(300); l.add(400); l.add(500); l.add(600);
		 * l.add(700); l.add(100); l.add(300); l.add(500);
		 * 
		 * System.out.println(l);
		 * 
		 * Set <Integer> s = new TreeSet<>(); s.addAll(l); System.out.println(s);
		 */

		/*
		 * List <Integer> list1 = new LinkedList<Integer>();
		 * System.out.println("TASK 13"); list1.add(10); list1.add(20); list1.add(30);
		 * list1.add(90); list1.add(10); list1.add(10); list1.add(40); list1.add(50);
		 * System.out.println("list1 : " + list1);
		 * 
		 * List <Integer> l = new Vector<>(); l.add(30); l.add(40); l.add(50);
		 * l.add(60); l.add(80); System.out.println("l : " + l);
		 * 
		 * list1.retainAll(l); System.out.println("Common values in s&l is : " + list1);
		 */

		/*
		 * Set<Integer> se = new HashSet<Integer>(); se.add(105); se.add(205);
		 * se.add(305); se.add(405); se.add(505); se.add(605); se.add(705); se.add(805);
		 * for (Integer integerse : se) { System.out.println(integerse); }
		 */

		
//		  Set<Integer> set = new TreeSet<Integer>();
//		  System.out.println("TASK 11");
//		  set.add(10);
//		  set.add(20);
//		  set.add(30);
//		  set.add(40);
//		  set.add(50);
//		  set.add(60);
//		  set.add(70); 
//		  set.add(80);
//		  set.add(90); 
//		  set.add(10);
//		  set.add(20);
//		 
//		  Iterator<Integer> s = set.iterator();
//		  while (s.hasNext()) {
////			type type = (type) it.next();
//			  System.out.println(s.next();
//		)
		
		 
		
		
//		 Set<Integer>hash = new HashSet<Integer>();
//		 System.out.println("TASK 12");
//		 hash.add(10);
//		 hash.add(20);
//		 hash.add(30);
//		 hash.add(40);
//		 hash.add(50);
//		 hash.add(60);
//		 hash.add(70);
//		 hash.add(80);
//		 hash.add(90);
//		 hash.add(10);
//		 hash.add(20);
//		  
//		  Iterator<Integer> n = hash.iterator(); 
//		  while (n.hasNext()){ 
//			  System.out.println(n.next());
//		  }
		 
		 

		/*
		 * LinkedHashSet<Integer> values = new LinkedHashSet<Integer>();
		 * System.out.println("TASK 14"); values.add(10); values.add(20);
		 * values.add(30); values.add(90); values.add(10); values.add(10);
		 * values.add(40); values.add(50); System.out.println("list1 : " + values);
		 * 
		 * List <Integer> val = new Vector<>(); val.add(10); val.add(20); val.add(60);
		 * val.add(50); val.add(40); val.add(70); val.add(80); val.add(90);
		 * System.out.println("val : " + val);
		 * 
		 * values.retainAll(val); System.out.println("Common values in s&l is : " +
		 * values);
		 */

		/*
		 * Set <Integer> a = new TreeSet<>(); System.out.println("TASK 15"); a.add(10);
		 * a.add(20); a.add(30); a.add(40); a.add(50); a.add(60); a.add(70); a.add(80);
		 * System.out.println("A : " + a);
		 * 
		 * List <Integer> b = new Vector<>(); b.add(100); b.add(200); b.add(300);
		 * b.add(400); b.add(500); b.add(600); b.add(700); b.add(800);
		 * System.out.println("B : " + b);
		 * 
		 * a.retainAll(b); System.out.println("Common values in s&l is : " + a);
		 */

		/*
		 * Set<Integer>aa = new HashSet<Integer>(); System.out.println("TASK 16");
		 * aa.add(10); aa.add(20); aa.add(30); aa.add(90); aa.add(10); aa.add(10);
		 * aa.add(40); aa.add(50); System.out.println("A : " + aa);
		 * 
		 * List <Integer> bb = new Vector<>(); bb.add(30); bb.add(40); bb.add(50);
		 * bb.add(60); bb.add(80); System.out.println("B : " + bb);
		 * 
		 * bb.removeAll(aa); System.out.println("After removing the common values : " +
		 * bb );
		 */

		/*
		 * Set <Integer> ma = new LinkedHashSet<>(); System.out.println("TASK 17");
		 * ma.add(10); ma.add(20); ma.add(30); ma.add(90); ma.add(10); ma.add(10);
		 * ma.add(40); ma.add(50); System.out.println("MA : " + ma);
		 * 
		 * List <Integer> la = new Vector<>(); la.add(10); la.add(20); la.add(60);
		 * la.add(50); la.add(40); la.add(70); la.add(80); la.add(90);
		 * System.out.println("LA : " + la);
		 * 
		 * la.removeAll(ma); System.out.println("After removing the common values : " +
		 * la );
		 */

		/*
		 * Set <Integer> mah = new TreeSet<>(); System.out.println("TASK 18");
		 * mah.add(10); mah.add(20); mah.add(30); mah.add(40); mah.add(50); mah.add(60);
		 * mah.add(70); mah.add(80); System.out.println("MAH : " + mah);
		 * 
		 * Set <Integer> lak = new TreeSet<>(); lak.add(100); lak.add(200);
		 * lak.add(300); lak.add(400); lak.add(500); lak.add(600); lak.add(700);
		 * lak.add(800); System.out.println("LAK : " + lak);
		 * 
		 * lak.removeAll(mah); System.out.println("After removing the common values : "
		 * + lak );
		 */

		/*
		 * Map<Integer, String> mp = new HashMap<>(); System.out.println("TASK 19");
		 * mp.put(10, "java"); mp.put(20, "sql"); mp.put(30, "oops"); mp.put(40, "Sql");
		 * mp.put(50, "orascle"); mp.put(60, "DB"); mp.put(10, "selenium"); mp.put(50,
		 * "psql"); mp.put(40, "Hadoop");
		 * 
		 * System.out.println(mp);
		 */

		/*
		 * Map<Integer, Integer> ma = new LinkedHashMap<>();
		 * System.out.println("TASK 20"); ma.put(10, 10); ma.put(20, 20); ma.put(30,
		 * 30); ma.put(40, 40); ma.put(50, 50); ma.put(60, 60); ma.put(10, 10);
		 * ma.put(50, 50); ma.put(40, 40); System.out.println(ma);
		 */

		/*
		 * Map<String, Integer> ch = new TreeMap<>(); System.out.println("TASK 21");
		 * ch.put("!", 10); ch.put("@", 20); ch.put("#", 30); ch.put("$", 40);
		 * ch.put("%", 50); ch.put("^", 60); ch.put("&", 10); ch.put("*", 50);
		 * ch.put("(", 40); System.out.println(ch);
		 */

		/*
		 * Map<String, String> st = new HashMap<>(); System.out.println("TASK 22");
		 * st.put("SAM", "Selenium"); st.put("Karthik", "framework"); st.put("Gowtham",
		 * "oracle"); st.put("Gokul", "corejava"); st.put("Neethu", "jira");
		 * System.out.println(st);
		 */

		/*
		 * Map<Integer, String> to = new HashMap<>(); System.out.println("TASK 23");
		 * to.put(10, "java"); to.put(20, "sql"); to.put(30, "oops"); to.put(40, "Sql");
		 * to.put(50, "orascle"); to.put(60, "DB"); to.put(10, "selenium"); to.put(50,
		 * "psql"); to.put(40, "Hadoop");
		 * 
		 * Set<Integer> tom = to.keySet(); System.out.println(tom);
		 */
		/*
		 * Map<Integer , Integer> tomm = new LinkedHashMap();
		 * System.out.println("TASK 24"); tomm.put(10, 10); tomm.put(20, 20);
		 * tomm.put(30, 30); tomm.put(40, 40); tomm.put(50, 50); tomm.put(60, 60);
		 * tomm.put(10, 10); tomm.put(50, 50); tomm.put(40, 40);
		 * System.out.println(" THE INSERTED KEY & VALUES ARE : " + tomm );
		 * 
		 * Set<Integer> tommy = tomm.keySet();
		 * System.out.println(" THE VALUES OF KEY IS PRINTED HEAR : " + tommy);
		 */

//		Map<String, Integer> si = new TreeMap<>();
//		System.out.println("TASK 25");
//		si.put("!", 10); 
//		si.put("@", 20); 
//		si.put("#", 30); 
//		si.put("$", 40);
//		si.put("%", 50); 
//		si.put("^", 60); 
//		si.put("&", 10); 
//		si.put("*", 50);
//		si.put("(", 40);
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + si);
//		
//		Set<String> sin = si.keySet();
//		System.out.println("THE VALUES OF KEY IS PRINTED HEAR : " + sin );

//		Map <String , String > v = new Hashtable<>();
//		System.out.println("TASK 26");
//		v.put("SAM", "Selenium");
//		v.put("Karthik", "framework");
//		v.put("Gowtham", "oracle");
//		v.put("Gokul", "corejava");
//		v.put("Neethu", "jira");
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + v);
//		Set<String> vm = v.keySet();
//		System.out.println("THE VALUES OF KEY IS PRINTED HEAR : " + vm );

//		Map<Integer, String> ti = new HashMap<>();
//		System.out.println("TASK 27");
//		ti.put(10, "java"); 
//		ti.put(20, "sql"); 
//		ti.put(30, "oops"); 
//		ti.put(40, "Sql");
//		ti.put(50, "orascle");
//		ti.put(60, "DB"); 
//		ti.put(10, "selenium"); 
//		ti.put(50,"psql"); 
//		ti.put(40, "Hadoop");
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + ti);
//		
//		Collection<String> tig = ti.values();
//		System.out.println("THE VALUES ARE PRINTED HEAR : " + tig );

//		Map<Integer , Integer> ba = new LinkedHashMap();
//		System.out.println("TASK 28");
//		ba.put(10, 10);
//		ba.put(20, 20);
//		ba.put(30, 30); 
//		ba.put(40, 40); 
//		ba.put(50, 50); 
//		ba.put(60, 60);
//		ba.put(10, 10); 
//		ba.put(50, 50); 
//		ba.put(40, 40);
//		System.out.println(" THE INSERTED KEY & VALUES ARE : " + ba );
//		
//		Collection<Integer> bal = ba.values();
//		System.out.println("THE VALUES ARE PRINTED HEAR : " + bal );

//		Map<String, Integer> bo = new TreeMap<>();
//		System.out.println("TASK 29");
//		bo.put("!", 10); 
//		bo.put("@", 20); 
//		bo.put("#", 30); 
//		bo.put("$", 40);
//		bo.put("%", 50); 
//		bo.put("^", 60); 
//		bo.put("&", 10); 
//		bo.put("*", 50);
//		bo.put("(", 40);
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + bo);
//		
//		Collection<Integer> bax = bo.values();
//		System.out.println("THE VALUES ARE PRINTED HEAR : " + bax );

//		Map<Integer, String> not = new HashMap<>();
//		System.out.println("TASK 31");
//		not.put(10, "java"); 
//		not.put(20, "sql"); 
//		not.put(30, "oops"); 
//		not.put(40, "Sql");
//		not.put(50, "orascle");
//		not.put(60, "DB"); 
//		not.put(10, "selenium"); 
//		not.put(50,"psql"); 
//		not.put(40, "Hadoop");
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + not);
//		
//		for (Map.Entry<Integer, String> entry : not.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println(key);
//			System.out.println(val);
//		}
//		Map<Integer , Integer> co = new LinkedHashMap<>();
//		System.out.println("TASK 32");
//		co.put(10, 10);
//		co.put(20, 20);
//		co.put(30, 30); 
//		co.put(40, 40); 
//		co.put(50, 50); 
//		co.put(60, 60);
//		co.put(10, 10); 
//		co.put(50, 50); 
//		co.put(40, 40);
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + co);
//		
//		Iterator<Entry<Integer ,Integer>> com = co.entrySet().iterator();
//		  while (com.hasNext()) {
//			  Map.Entry<Integer, Integer> comm = com.next();
//			  System.out.println(comm.getKey());
//			  System.out.println(comm.getValue());
//		  }

		
//		Map<String, Integer> pen = new TreeMap<>();
//		System.out.println("TASK 33");
//		pen.put("!", 10); 
//	    pen.put("@", 20); 
//		pen.put("#", 30); 
//		pen.put("$", 40);
//		pen.put("%", 50); 
//		pen.put("^", 60); 
//		pen.put("&", 10); 
//		pen.put("*", 50);
//		pen.put("(", 40);
//		System.out.println("THE INSERTED KEY & VALUES ARE : " + pen);
//		
//		Iterator<Entry<String ,Integer>> N = pen.entrySet().iterator();
//		  while (N.hasNext()) {
//			  Map.Entry<String, Integer> Ni = N.next();
//			  System.out.println(Ni.getKey());
//			  System.out.println(Ni.getValue());
//		  }
//		Map <String , String > v = new HashMap<>();
//		System.out.println("TASK 34");
//		v.put("SAM", "Selenium");
//		v.put("Karthik", "framework");
//		v.put("Gowtham", "oracle");
//		v.put("Gokul", "corejava");
//		v.put("Neethu", "jira");
//		
//		Iterator<Entry<String ,String>> vi = v.entrySet().iterator();
//		  while (vi.hasNext()) {
//			  Map.Entry<String, String> mo = vi.next();
//			  System.out.println(mo.getKey());
//			  System.out.println(mo.getValue());
//		  }
//		Map<Integer, String> not = new HashMap<>();
//		System.out.println("TASK 35");
//		not.put(10, "java"); 
//		not.put(20, "sql"); 
//		not.put(30, "oops"); 
//		not.put(40, "Sql");
//		not.put(50, "orascle");
//		not.put(60, "DB"); 
//		not.put(10, "selenium"); 
//		not.put(50,"psql"); 
//		not.put(40, "Hadoop");
//		
//		Iterator<Entry<Integer, String>> No = not.entrySet().iterator();
//		  while (No.hasNext()) {
//			  Map.Entry<Integer, String> Ni = No.next();
//			  System.out.println(Ni.getKey());
//			  System.out.println(Ni.getValue());
//		  }
		
//		Map<Integer, String> val = new LinkedHashMap<>();
//		System.out.println("TASK 36");
//		val.put(10, "java"); 
//		val.put(20, "sql"); 
//		val.put(30, "oops"); 
//		val.put(40, "Sql");
//		
//		for (Map.Entry<Integer, String> entry : val.entrySet()) {
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key);
//			System.out.println(value);
//		}	
		
//		Map<Integer , Integer> num = new LinkedHashMap<>();
//		System.out.println("TASK 37");
//		num.put(10, 10);
//		num.put(20, 20);
//		num.put(30, 30); 
//		num.put(40, 40); 
//		num.put(50, 50); 
//		num.put(60, 60);
//		num.put(10, 10); 
//		num.put(50, 50); 
//		num.put(40, 40);
//		
//		for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
//			Integer key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(key);
//			System.out.println(val);
//		}
		
//		Map<String, Integer> Tree = new TreeMap<>();
//		System.out.println("TASK 38");
//		Tree.put("!", 10); 
//		Tree.put("@", 20); 
//		Tree.put("#", 30); 
//		Tree.put("$", 40);
//		Tree.put("%", 50); 
//		Tree.put("^", 60); 
//		Tree.put("&", 10); 
//		Tree.put("*", 50);
//		Tree.put("(", 40);
//		
//		Iterator<Entry<String ,Integer>> N = Tree.entrySet().iterator();
//		  while (N.hasNext()) {
//			  Map.Entry<String, Integer> Ni = N.next();
//			  System.out.println(Ni.getKey());
//			  System.out.println(Ni.getValue());
//		  }
		
//		Map <String , String > v = new Hashtable<>();
//		System.out.println("TASK 39");
//		v.put("SAM", "Selenium");
//		v.put("Karthik", "framework");
//		v.put("Gowtham", "oracle");
//		v.put("Gokul", "corejava");
//		v.put("Neethu", "jira");
//		
//		Iterator<Entry<String ,String>> Na = v.entrySet().iterator();
//		  while (Na.hasNext()) {
//			  Map.Entry<String, String> Ni = Na.next();
//			  System.out.println(Ni.getKey());
//			  System.out.println(Ni.getValue());
//		  }
		
		/*
		 * Map<String , String> emp = new LinkedHashMap<>();
		 * System.out.println("TASK 40"); emp.put("empID", "101");
		 * emp.put("name","maha"); emp.put("phone", "9787456652"); emp.put("address",
		 * "REDHILLS"); emp.put("dob", "06/05/200/"); emp.put("doj", "fg");
		 * emp.put("email", "dqd@fd"); emp.put("gender", "female"); emp.put("sql",
		 * "java"); System.out.println("EMPLOYEE DETAILES ARE ENTERED : " + emp);
		 */
		

		Map<String , String> stu = new LinkedHashMap<>();
		System.out.println("TASK 41");
		stu.put("empID", "101");
		stu.put("stdname","maha");
		stu.put("stdphone", "9787456652");
		stu.put("address", "REDHILLS");
		stu.put("dob", "06/05/2004");
		stu.put("email", "dqd@fd");
		stu.put("gender", "female");
		
		System.out.println("STUDENT DETAILES ARE ENTERED : " + stu);
	}
}
