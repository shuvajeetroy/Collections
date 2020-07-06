package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter 5 Names :");
		for(int i=0; i<5; i++) {
			name = sc.nextLine();
			list.add(name);
		}
		
		System.out.println("Printing array list object : " +list);
		
		System.out.println("Iterating using iterator :");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Iterating using for-each loop :");
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("Iterating using for-each method() : ");
		list.forEach(a-> {System.out.println(a);});
	}

}
