package TreeSetComparableUserDefine;

import java.util.Scanner;

public class BookDetails implements Comparable<BookDetails> {
	
	int id, quantity;
	String name, author, publisher;
	
	public BookDetails(int id, int quantity, String name, String author, String publisher) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public int compareTo(BookDetails bd) {
		if(id > bd.id)
			return 1;
		else if (id < bd.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	void GetBookDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book Name : ");
		name = sc.nextLine();
		System.out.print("Enter Author Name : ");
		author = sc.nextLine();
		System.out.print("Enter Publisher Name : ");
		publisher = sc.nextLine();
		System.out.print("Enter Quantity : ");
		quantity = sc.nextInt();
	}

}
