package poprawa_java;

import java.util.Objects;

public class Book {
	private String title;
	private String author; 
	private String isbn;
	private int year;

	public void setTitle(String s) {this.title = s;}
	public void setAuthor(String s) {this.author = s;}
	public void setIsbn(String s) {this.isbn = s;}
	public void setYear(int i) {this.year = i;}
	
	Book(String t, String a, String i, int y){
		setTitle(t);
		setAuthor(a);
		setIsbn(i);
		setYear(y);
		
	}
		
	//equals nadpisanie 
	
	public boolean equals(Book k) {
		boolean test = this.equals(k);
		return test;
		} // koniec equals
	
	
	//nadpisany hash 
	public int hashCode() { return Objects.hash(this);}
	
	public String toString() {return ""+ this.title + " " + this.author + " " + this.isbn + " " + this.year;}

}
