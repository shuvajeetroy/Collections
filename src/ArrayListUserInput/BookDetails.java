package ArrayListUserInput;

import java.util.Scanner;

public class BookDetails {
	
	String name, author, publisher;
	int quantity;
	
	public BookDetails(String name, String author, String publisher, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}
	
	void GetBookData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name : ");
		name = sc.nextLine();
		System.out.print("Enter Author : ");
		author = sc.nextLine();
		System.out.print("Enter Publisher : ");
		publisher = sc.nextLine();
		System.out.print("Enter Book Quantity : ");
		quantity = sc.nextInt();
	}
	
}
