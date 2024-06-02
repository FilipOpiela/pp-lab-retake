package poprawa_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// poprawa javy -- operacje na książkach 
		
		Scanner scan = new Scanner(System.in);
		
		List<Book> books = new ArrayList<>();
		
		Book b1 = new Book("Vademecum ojca", "Janusz Korwin Mikke", "83-89467-40-2", 1997);
		Book b2 = new Book("Barry Trotter", "Michael Gerber","8374800097", 2006);
		Book b3 = new Book("Mistrz i Małgorzata", "Michaił Bułhakow","9788382890211", 1969);
		Book b4 = new Book("Perska niepewność", "Laila Shukri", "9788382341836", 2021);
		Book b5 = new Book("Nazywam się Bond" , "Ian Fleming", "12341234", 1988); // okazuje się że ta książka nie ma isbn... ciekawe
		
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		BookManager bm1 = new BookManager(books);	
		
		int wybor = 0;
		
		while(wybor != 5) {
		System.out.println("Wybierz funkcje\n1.Dodaj\n2.Usuń\n3.Zaktualizuj dane\n4.Lista ksiazek\n5.Exit");
		wybor = scan.nextInt();
		
		switch(wybor) {
			case 1:
				bm1.addBook();
				wybor = 0;
				break;
			case 2:
				//usuniecie
				bm1.removeBook();
				wybor = 0;
				break;
			case 3 :
				//nadpisanie informacji
				bm1.updateBook();
				wybor = 0;
				break;
			case 4: 
				//lista ksiazek
				books = bm1.getBooks();
				for(Book b : books) {
					System.out.println("" + b.toString());
				}
				wybor = 0;
				break;		
		
		}//koniec switcha
		}//zamkniecie while 
		System.exit(0);
	} // zamkniecie kalsy 

}
