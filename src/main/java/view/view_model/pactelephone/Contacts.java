package view.view_model.pactelephone;


import com.devfrota.iphonedio.controller.Controller;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import java.util.List;

public class Contacts {
    private final List<Contact> contactList;

    public Contacts() {
        Controller controller = new Controller();
        this.contactList = controller.contactList();
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}

