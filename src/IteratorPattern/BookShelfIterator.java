package IteratorPattern;

public class BookShelfIterator implements Iterator {

    private int curIndex;
    private BookShelf bookShelf;


    public BookShelfIterator(BookShelf bookShelf) {
        curIndex = 0;
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (curIndex < bookShelf.getLength())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(curIndex);
        curIndex++;
        return book;
    }
}
