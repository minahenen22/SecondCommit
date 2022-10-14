package class18;

public class Book {
    /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String name;
    int pages;

    public Book(String name,int pages){
        /*this.name=name;
        this.pages=pages;*/
        this(name);
        this.pages=pages;
        System.out.println("book is "+name+" has " + pages+" page");

    }
    public Book(String name){
        this.name=name;
        System.out.println("Book is "+name);
    }

    public static void main(String[] args) {
        new Book("Alchemist",190);
        new Book("11 minutes");
    }


    }

