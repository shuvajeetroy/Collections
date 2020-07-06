package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		System.out.println("Enter 5 names");
		for(int i=0; i<5; i++) {
			name = sc.nextLine();
			hs.add(name);
		}
		for(String s:hs) {
			System.out.println(s);
		}
		hs.remove("Roy2");
		hs.forEach(a-> {System.out.println(a);});
	}

}
