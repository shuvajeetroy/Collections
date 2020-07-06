package MapsUserInput;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter no. of books u want to enter : ");
		n=sc.nextInt();
		
		BookDetails[] bd = new BookDetails[n];
		HashMap<Integer, BookDetails> hm = new HashMap<Integer, BookDetails>();
		
		for(int i=0; i<n; i++) {
			bd[i] = new BookDetails();
			bd[i].GetBookDetails();
			hm.put(bd[i].id, bd[i]);
		}
		
		for(Map.Entry map: hm.entrySet()) {
			int key = (int) map.getKey();
			BookDetails b = (BookDetails) map.getValue();
			System.out.println("Book ID : "+key);
			System.out.println(b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		System.out.println(" ");
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}

}
