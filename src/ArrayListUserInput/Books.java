package ArrayListUserInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		List<BookDetails> list = new ArrayList<BookDetails>();
		System.out.print("Enter total number of books : ");
		n=sc.nextInt();
		
		BookDetails[] bd = new BookDetails[n];
		for(int i=0; i<n; i++) {
			System.out.println("\nEnter details of book "+(i+1));
			bd[i] = new BookDetails();
			bd[i].GetBookData();
			list.add(bd[i]);
		}
		
		for(BookDetails b:list) {
			System.out.println(b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
