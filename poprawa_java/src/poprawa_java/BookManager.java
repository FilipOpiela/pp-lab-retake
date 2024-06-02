package poprawa_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager implements BookOperations{
	
	String tymczasowy;
	
	Scanner scan = new Scanner(System.in);
	
	List<Book> books;
	
	BookManager(List b){
		this.books = b;
	}
	
	@Override
	public void addBook() {
		String t;
		String a;
		String i;
		int y;
		
		System.out.println("Podaj informacje - tytuł autora isbn a następnie rok wydania");
		t = scan.nextLine();
		a = scan.nextLine();
		i = scan.nextLine();
		y = scan.nextInt();
		
		books.add(new Book(t,a,i,y));	
	}

	@Override
	public void removeBook() {
		System.out.println("Wprowadz indeks ksiazki do usuniecia");
		int p = scan.nextInt();
		books.remove(p);	
		
	}

	@Override
	public void updateBook() {
		System.out.println("Wprowadz indeks ksiazki do edycji");
		int p = scan.nextInt();
		System.out.println("Którą informację chcesz edytować??\n1.Tytuł\n2.Autor\n3.Isbn\n4.Rok wydania");
		int wyb = scan.nextInt();
		if(wyb == 1) {
			System.out.println("Podaj nowy tytuł");
			tymczasowy = scan.next();
			books.get(p).setTitle(tymczasowy);}
		else if(wyb == 2) {
			System.out.println("Podaj nowego autora");
			tymczasowy = scan.next();
			books.get(p).setAuthor(tymczasowy);}
		else if (wyb == 3) {
			System.out.println("Podaj nowy isbn");
			tymczasowy = scan.next();
			books.get(p).setIsbn(tymczasowy);}
		else if (wyb == 4) {
			System.out.println("Podaj nowy rok wydania");
			int tymczas = scan.nextInt();
			books.get(p).setYear(tymczas);}
		else {
			System.out.println("Niepoprawny wybór");}}  // koniec update

	@Override
	public List<Book> getBooks() {
		return books;}
	
}
