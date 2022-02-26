package ArrayList_Challenge;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myPhoneNumber;
    private List<Contacts> contactsList;

    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.contactsList = new ArrayList<>();
    }
    public boolean addContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact on file");
            return false;
        }
        contactsList.add(contact);
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contactsList.size(); i++){
            Contacts contact = this.contactsList.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contacts contact) {
        return this.contactsList.indexOf(contact);
    }

    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.contactsList.set(foundPosition, newContact);
        return true;
    }
}
