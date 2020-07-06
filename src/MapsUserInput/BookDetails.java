package MapsUserInput;

import java.util.Scanner;

public class BookDetails {
	String name, author, publisher;
	int id, quantity;
	
	public BookDetails(String name, String author, String publisher, int id, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.id = id;
		this.quantity = quantity;
	}
	
	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	void GetBookDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter Book Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Eneter Book Name : ");
		name = sc.nextLine();
		System.out.print("Eneter Author Name : ");
		author = sc.nextLine();
		System.out.print("Eneter Publisher Name : ");
		publisher = sc.nextLine();
		System.out.print("Enter Quantity : ");
		quantity = sc.nextInt();
	}
	
}
