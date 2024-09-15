public class BuddyInfo {
    private String name;
    private String address;
    private String phone;
    BuddyInfo() {
        name = "";
        address = "";
        phone = "";
    }
    BuddyInfo(String name_var, String address_var, String phone_var) {
        name = name_var;
        address = address_var;
        phone = phone_var;
    }
    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer","24 Home Drive, Ottawa", "222-000-2456");
        System.out.println("Hello "+buddy1.getName());
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}