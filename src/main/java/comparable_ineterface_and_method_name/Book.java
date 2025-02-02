package comparable_ineterface_and_method_name;

public class Book implements Comparable {
    String book_name;
    int book_id;
    double book_price;

    // Constructor
    Book(String book_name, int book_id, double book_price) {
        this.book_name = book_name;
        this.book_id = book_id;
        this.book_price = book_price;
    }

    @Override
    public String toString() {
        return "Book name: " + book_name + ", Book ID: " + book_id + ", Book price: " + book_price;
    }

   //@Override
    public int compareTo(Book o) 
    {
        // Compare based on book_id
        if (this.book_id > o.book_id) 
        {
            return 1;
        } 
        else if (this.book_id < o.book_id) 
        {
            return -1;
        } 
        else 
        {
            return 0;
        }
    }
}
