package IteratorPattern;

public class Client {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("test1"));
        bookShelf.appendBook(new Book("test2"));
        bookShelf.appendBook(new Book("test3"));
        bookShelf.appendBook(new Book("test4"));
        bookShelf.appendBook(new Book("test5"));

        Iterator itr = bookShelf.iterator();
        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book.getName());
        }
    }
}
