import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class StoreTester {
    @Test
    public void addBookTest(){
        Store s = new Store();
        Book b = new Book("Book123", 16000, "TheBook123", "n");
        s.addBook(b);
        assertFalse(s.isEmpty());
    }

    @Test
    public void testAddPhoneAndBook(){
        Store s = new Store();
        Book b = new Book("Book321", 12345, "321Book", "n");
        Phone p = new Phone("iPhone 32", "Causeway Bay", 9, "o");
        s.addBook(b);
        s.addPhone(p);
        assertFalse(s.isEmpty());
    }
    @Test
    public void testUpdatePhonesLocation(){
        Store s = new Store();
        Phone one = new Phone("iPhone 33", "North Point", 98, "p");
        Phone two = new Phone("iPhone 34", "North Point", 0, "h");
        Phone three = new Phone("iPhone 35", "North Point", 7, "k");
        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        ArrayList<Phone> phoneArrayList = s.getAllPhones();
        for(Phone p : phoneArrayList){
            assertEquals(p.getLocation(), "North Point");
        }
    }
    @Test
    public void testGetItems(){
        Store s = new Store();
        Phone one = new Phone("iPhone 33", "North Point", 9, "hu");
        Phone two = new Phone("iPhone 34", "School", 78, "u");
        Phone three = new Phone("iPhone 35", "Sai Kung", 0, "k");
        Book bookOne = new Book("Book321", 12345, "321Book", "iop");
        Book bookTwo = new Book("Book95", 12345, "95Book", "pjuhinj");
        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        s.addBook(bookOne);
        s.addBook(bookTwo);
        ArrayList<CISItem> bookArrayList = s.getItems("Book");
        ArrayList<CISItem> phoneArrayList = s.getItems("Phone");
        for(CISItem phones : phoneArrayList){
            assertEquals(phones.getClass(), one.getClass());
        }
        for(CISItem books : bookArrayList){
            assertEquals(books.getClass(), bookOne.getClass());
        }
    }
    @Test
    public void testUpdateItems(){
        Store s = new Store();
        Book b = new Book("Grape", 1, "Grapes", "ijo");
        Phone p = new Phone("Phone341", "Room 35", 9, "uihn");
        s.addBook(b);
        s.addPhone(p);
        s.updateItems("Book", "price", "300");
        s.updateItems("Phone", "name", "B");
        s.updateItems("Phone", "description", "newDescription");
        assertEquals("Grapes", b.getLocation());
        assertEquals(1, b.getPrice());
        assertEquals("Phone341", p.getName());
        assertEquals("uihn", p.getDescription());
    }


}