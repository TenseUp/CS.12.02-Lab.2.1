import java.util.ArrayList;

public class Store {

    ArrayList<CISItem> cisItems = new ArrayList<>();

    public void addBook(Book book) {
        cisItems.add(book);
    }

    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    public void updatePhonesLocation(String location) {
        for(CISItem item : cisItems) {
            if(item instanceof Phone) {
                ((Phone)item).setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> phones = new ArrayList<>();
        for(CISItem item : cisItems) {
            if(item instanceof Phone) {
                phones.add((Phone)item);
            }
        }
        return phones;
    }

    public ArrayList<CISItem> getItems(String type) {
        ArrayList<CISItem> items = new ArrayList<>();
        for(CISItem item : cisItems) {
            if(item.getClass().getSimpleName().equals(type)) {
                items.add(item);
            }
        }
        return items;
    }

    public boolean isEmpty(){
        return cisItems.isEmpty();
    }

    public void updateItems(String type, String property, String value) {
        for(CISItem item : cisItems) {
            if(item.getClass().getSimpleName().equals(type)) {
                if(property.equals("location")) {
                    ((Phone)item).setLocation(value);
                }
            }
        }
    }

    public void showAllInfo() {
        for(CISItem item : cisItems) {
            System.out.println(item.getName());
            if(item instanceof Book) {
                Book book = (Book)item;
                System.out.println(book.getTitle());
            }
            else if(item instanceof Phone) {
                Phone phone = (Phone)item;
                System.out.println(phone.getLocation());
            }
        }
    }

}