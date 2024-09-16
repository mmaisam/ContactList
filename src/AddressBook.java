// Importing utility classes
import java.util.*;
public class AddressBook {
    private Deque<BuddyInfo> buddies;
    AddressBook(){
        buddies = new ArrayDeque<>();
    }
    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy); // Adds buddy to the end
    }
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy); // Removes specific buddy
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tarek","24 Carleton Drive, Ottawa", "222-000-2456");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        //dhjsdgdksgdkscghksdh
    }
}
