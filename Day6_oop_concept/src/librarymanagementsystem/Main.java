package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("B123", "Java Programming", "John Doe");
        book.getItemDetails();
        ((Reservable) book).reserveItem();
        System.out.println("Availability: " + ((Reservable) book).checkAvailability());

        LibraryItem magazine = new Magazine("M123", "Tech Magazine", "Jane Smith");
        magazine.getItemDetails();
        ((Reservable) magazine).reserveItem();
        System.out.println("Availability: " + ((Reservable) magazine).checkAvailability());

        LibraryItem dvd = new DVD("D123", "Inception", "Christopher Nolan");
        dvd.getItemDetails();
        ((Reservable) dvd).reserveItem();
        System.out.println("Availability: " + ((Reservable) dvd).checkAvailability());
    }
}
