package librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;  // DVD loan duration: 5 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the DVD: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        return false;  // Assuming the DVD is not available
    }
}
