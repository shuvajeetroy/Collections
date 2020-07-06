package HashSetUserInput;

import java.util.Scanner;

public class BookDetails {
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
		System.out.print("Enter Book Quantity : ");
		quantity = sc.nextInt();
	}
}
