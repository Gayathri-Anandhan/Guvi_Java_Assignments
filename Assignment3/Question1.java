package Assignment3;

import java.util.Scanner;

class Book {
    Integer BookID;
    String Title;
    String Author;
    boolean isAvailable;

    // CONSTRUCTOR
    Book(Integer BookID, String Title, String Author) {
        this.BookID = BookID;
        this.Title = Title;
        this.Author = Author;
        this.isAvailable = true;
    }

    // GETTER METHOD
    public Integer getBookID() {
        return BookID;
    }

    public String getBookTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // SETTER METHOD
    public void setBookTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void displayBook() {
        System.out.println("ID :" + BookID);
        System.out.println("Book Title:" + Title);
        System.out.println("Author:" + Author);
        System.out.println("Availability:" + isAvailable);
    }
}

class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[5];
    }

    public void addBook(Book book) {
        for (Integer i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book Added Successfully");
                return;
            }
        }
        System.out.println("Cannot add more!");
    }

    public void replaceBook(Integer BookID, String newTitle, String newAuthor) {
        for (Integer i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == BookID) {
                books[i].setBookTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("Book replaced successfully");
                return;
            }
        }
        System.out.println("BookID not found");
    }

    public void displayBooks() {
        boolean empty = true;
        for (Book b : books) {
            if (b != null) {
                empty = false;
                b.displayBook();
            }
        }
        if (empty) {
            System.out.println("No books available in the library");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library Library1 = new Library();
        Integer choice;
        do {
            System.out.println("-----LIBRARY MENU-----");
            System.out.println("1.Add Book");
            System.out.println("2.Replace Book");
            System.out.println("3.Display Book");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter BookID:");
                    Integer id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book title:");
                    String title = sc.nextLine();
                    System.out.println("Enter Author Name:");
                    String author = sc.nextLine();
                    Book book = new Book(id, title, author);
                    Library1.addBook(book);
                    break;

                case 2:
                    System.out.println("Enter BookID to replace:");
                    Integer BookID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new title:");
                    String newTitle = sc.nextLine();
                    System.out.println("Enter new author:");
                    String newAuthor = sc.nextLine();
                    Library1.replaceBook(BookID, newTitle, newAuthor);
                    break;

                case 3:
                    Library1.displayBooks();
                    break;

                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (choice != 4);
        sc.close();
    }
}
