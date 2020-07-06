package TreeSetComparableUserDefine;

import java.util.Scanner;
import java.util.TreeSet;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of books : ");
		n = sc.nextInt();
		
		BookDetails[] bd = new BookDetails[n];
		TreeSet<BookDetails> ts = new TreeSet<BookDetails>();
		
		for(i=0; i<n; i++) {
			System.out.println("Enter details of Book "+(i+1));
			bd[i] = new BookDetails();
			bd[i].GetBookDetails();
			ts.add(bd[i]);
		}
		
		System.out.println("Book details are -");
		for(BookDetails b:ts) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
