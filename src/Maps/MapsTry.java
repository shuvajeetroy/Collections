package Maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total number  of data : ");
		int n = sc.nextInt();
		int keys[] = new int[n];
		String values[] = new String[n];
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter Key"+(i+1)+" : ");
			keys[i]=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Value"+(i+1)+" : ");
			values[i]=sc.nextLine();
			map.put(keys[i], values[i]);
		}
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
	}

}
