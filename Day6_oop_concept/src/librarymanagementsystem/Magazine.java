package librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazine loan duration: 7 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the magazine: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        return true;  // Assuming the magazine is available
    }
}
