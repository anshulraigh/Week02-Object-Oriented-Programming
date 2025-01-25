package librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Book loan duration: 14 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the book: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        return true;  // Assume the book is available
    }
}
