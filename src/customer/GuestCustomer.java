package customer;

public class GuestCustomer extends Customer implements BrowsePrivilege{



    public GuestCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    @Override
    public void browseItem() {

    }
}
