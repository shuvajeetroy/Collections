package HashSetUserInput;

import java.util.HashSet;
import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of books : ");
		n = sc.nextInt();
		HashSet<BookDetails> hs = new HashSet<BookDetails>();
		
		BookDetails[] bd = new BookDetails[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("\nEnter detail of Book "+(i+1));
			bd[i] = new BookDetails();
			bd[i].GetBookDetails();
			hs.add(bd[i]);
		}
		
		System.out.println("");
		for(BookDetails detail:hs) {
			System.out.println(detail.id+" "+detail.name+" "+detail.author+" "+detail.publisher+" "+detail.quantity);
		}
	}

}
