import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281));
        books.add(new Book("1984", "George Orwell", 1949, 328));

        for (Book book : books) {
            System.out.println(book);
        }

        books.remove(1);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}

