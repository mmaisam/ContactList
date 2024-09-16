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
    }
}
