// Importing utility classes
import java.util.*;
public class AddressBook {
    private Deque<BuddyInfo> buddies;
    AddressBook(){
        buddies = new ArrayDeque<>();
    }
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy); // Adds buddy to the end
        }
    }
    public void removeBuddy(BuddyInfo buddy){
        if (buddy != null) { //check if needed
            buddies.remove(buddy); // Removes specific buddy
        }
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tarek","24 Carleton Drive, Ottawa", "222-000-2456");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook.buddies.isEmpty());
        addressBook.removeBuddy(buddy);
        System.out.println(addressBook.buddies.isEmpty());
        System.out.println(buddy.getName());

    }
}
