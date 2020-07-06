package TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class TreeSetTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names;
		int n;
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		ArrayList<String> al = new ArrayList<String>();
		System.out.print("Enter total number of names u want to enter : ");
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Names -");
		for(int i=0;i<n;i++) {
			names = sc.nextLine();
			ts.add(names);
		}
		System.out.println("\nThe Names are");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nThe names id descending order -");
		Iterator<String> itr1 = ts.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		/*al.addAll(ts);
		Collections.reverse(al);
		al.forEach(a-> {System.out.println(a);});*/
		
	}

}

